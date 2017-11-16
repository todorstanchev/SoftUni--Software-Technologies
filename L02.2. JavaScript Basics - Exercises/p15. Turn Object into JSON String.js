function jsonStringify(arr) {

    let json = {};

    arr.forEach(kvp => {

        let [key, value] = kvp.split(' -> ');

        if (!isNaN(value)) {

            value = Number(value);
        }

        json[key] = value;
    });

    console.log(JSON.stringify(json));
}

//jsonStringify([
//    'name -> Angel', 'surname -> Georgiev', 'age -> 20',
//    'grade -> 6.00', 'date -> 23/05/1995', 'town -> Sofia'
//]);