const Report = require('../models/Report');

module.exports = {
    index: (req, res) => {
        Report.find().then(reports => {
            res.render('report/index', {'reports': reports});
        });
    },
    createGet: (req, res) => {
        res.render('report/create');
    },
    createPost: (req, res) => {
        let report = req.body;
        Report.create(report).then(data => {
            res.redirect("/");
        }).catch(err => {
            return res.redirect('/')
        });
    },
    detailsGet: (req, res) => {
        let id = req.params.id;
        Report.findById(id).then(report => {
            res.render('report/details', report);
        }).catch(err => {
            return res.redirect('/')
        });
    },
    deleteGet: (req, res) => {
        let id = req.params.id;
        Report.findById(id).then(report => {
            res.render('report/delete', report);
        }).catch(err => {
            return res.redirect('/')
        });
    },
    deletePost: (req, res) => {
        let id = req.params.id;
        Report.findByIdAndRemove(id).then(data => {
            res.redirect('/');
        });
    }
};