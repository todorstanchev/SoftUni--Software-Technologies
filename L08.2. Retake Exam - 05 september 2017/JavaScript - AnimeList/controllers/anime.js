const Anime = require('../models/Anime');

module.exports = {

    index: (req, res) => {

        Anime.find().then(animes => {

            res.render('anime/index', {'animes': animes});
        });
    },

    createGet: (req, res) => {

        res.render('anime/create');
    },

    createPost: (req, res) => {

        let anime = req.body;

        Anime.create(anime).then(anime => {

            res.redirect('/');

        });
    },

    deleteGet: (req, res) => {

        Anime.findById(req.params.id).then(anime => {

            res.render('anime/delete', anime);
        })
    },

    deletePost: (req, res) => {

        Anime.findByIdAndRemove(req.params.id).then(anime => {

            res.redirect('/');
        });
    }
};