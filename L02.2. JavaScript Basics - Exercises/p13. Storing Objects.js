function printObjects(arr) {

    let students = [];

    for (let element of arr) {

        let elementTokens = element.split(' -> ');

        let [name, age, grade] = elementTokens;

        let obj = {name: name, age: age, grade: grade};

        students.push(obj);
    }

    for (student of students) {

        console.log(`Name: ${student.name}`);
        console.log(`Age: ${student.age}`);
        console.log(`Grade: ${student.grade}`);
    }
}

//printObjects(['Pesho -> 13 -> 6.00', 'Ivan -> 12 -> 5.57', 'Toni -> 13 -> 4.90']);