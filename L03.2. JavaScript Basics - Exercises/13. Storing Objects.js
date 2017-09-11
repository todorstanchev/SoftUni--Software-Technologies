function printObjects(arr) {

    let students = [];

    for (let index = 0; index < arr.length; index++) {

        let arrTokens = arr[index].split(' -> ');

        let [name, age, grade] = arrTokens;

        let obj = {name: name, age: age, grade: grade};

        students.push(obj);
    }

    for (student of students) {
        console.log(`Name: ${student.name}`);
        console.log(`Age: ${student.age}`);
        console.log(`Grade: ${student.grade}`);
    }
}

printObjects(['Pesho -> 13 -> 6.00', 'Ivan -> 12 -> 5.57', 'Toni -> 13 -> 4.90']);