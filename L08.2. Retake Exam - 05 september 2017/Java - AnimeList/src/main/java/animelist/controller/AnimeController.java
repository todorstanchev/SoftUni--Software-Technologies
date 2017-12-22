package animelist.controller;

import animelist.entity.Anime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import animelist.bindingModel.AnimeBindingModel;
import animelist.repository.AnimeRepository;

import java.util.List;

@Controller
public class AnimeController {

    private final AnimeRepository animeRepository;

    @Autowired
    public AnimeController(AnimeRepository animeRepository) {

        this.animeRepository = animeRepository;
    }

    @GetMapping("/")
    public String index(Model model) {

        List<Anime> animes = this.animeRepository.findAll();

        model.addAttribute("animes", animes);
        model.addAttribute("view", "anime/index");

        return "base-layout";
    }

    @GetMapping("/create")
    public String create(Model model) {

        model.addAttribute("view", "anime/create");

        return "base-layout";
    }

    @PostMapping("/create")
    public String createProcess(AnimeBindingModel animeBindingModel) {

        Anime anime = new Anime();

        anime.setRating(animeBindingModel.getRating());
        anime.setName(animeBindingModel.getName());
        anime.setDescription(animeBindingModel.getDescription());
        anime.setWatched(animeBindingModel.getWatched());

        animeRepository.saveAndFlush(anime);

        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(Model model, @PathVariable int id) {

        Anime anime = animeRepository.findOne(id);

        model.addAttribute("view", "anime/delete");
        model.addAttribute("anime", anime);

        return "base-layout";
    }

    @PostMapping("/delete/{id}")
    public String deleteProcess(Model model, @PathVariable int id, AnimeBindingModel animeBindingModel) {

        Anime anime = this.animeRepository.findOne(id);

        animeRepository.delete(anime);

        return "redirect:/";
    }
}