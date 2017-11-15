function extractCapitalCaseWords(arr) {

    let upperCaseWords = arr.join(',')
        .split(/\W+/)
        .filter(w => w)
        .filter(w => w === w.toUpperCase());

    console.log(upperCaseWords.join(', '));
}

//extractCapitalCaseWords([
//    'We start by HTML, CSS, JavaScript, JSON and REST.\n' +
//    'Later we touch some PHP, MySQL and SQL.\n' +
//    'Later we play with C#, EF, SQL Server and ASP.NET MVC.\n' +
//    'Finally, we touch some Java, Hibernate and Spring.MVC.'
//]);