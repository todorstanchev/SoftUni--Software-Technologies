const Film = require('../models/Film');

module.exports = {
    index: (req, res) => {

        Film.find().then(films => {
            res.render('film/index', {'films': films});
        });
    },

    createGet: (req, res) => {

        res.render('film/create');
    },

    createPost: (req, res) => {

        let film = req.body;

        Film.create(film).then(film => {

            res.redirect('/');

        }).catch(res.redirect('/'));
    },

    editGet: (req, res) => {

        let id = req.params.id;

        Film.findById(id).then(film => {

            if (!film) {

                res.redirect('/');

                return;
            }

            res.render('film/edit', film);
        });
    },

    editPost: (req, res) => {

        let filmId = req.params.id;
        let film = req.body;

        Film.findByIdAndUpdate(filmId, film, {runValidators: true}).then(film => {

            res.redirect('/');

        }).catch(err => {

            film.id = filmId;

            res.render('film/edit', film);
        })
    },

    deleteGet: (req, res) => {

        let id = req.params.id;

        Film.findById(id).then(film => {

            if (!film) {

                res.redirect('/');

                return;
            }

            res.render('film/delete', film);
        });
    },

    deletePost: (req, res) => {

        let filmId = req.params.id;

        Film.findByIdAndRemove(filmId).then(film => {

            res.redirect('/');

        });
    }
};