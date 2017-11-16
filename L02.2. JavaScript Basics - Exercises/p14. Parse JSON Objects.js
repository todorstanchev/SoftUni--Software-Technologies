function parseJSON(arr) {

    let jsons = arr.map(JSON.parse);

    for (json of jsons) {

        console.log(`Name: ${json.name}`);
        console.log(`Age: ${json.age}`);
        console.log(`Date: ${json.date}`);
    }
}

//parseJSON([
//    '{"name":"Gosho","age":10,"date":"19/06/2005"}',
//    '{"name":"Tosho","age":11,"date":"04/04/2005"}']);