function solve(arr) {

    let json = {};

    for (let index = 0; index < arr.length; index++) {

        let tokens = arr[index].split(' -> ');

        if (!isNaN(tokens[1])) {
            tokens[1] = Number(tokens[1]);
        }

        json[tokens[0]] = tokens[1];
    }

    console.log(JSON.stringify(json));
}

solve(['name -> Angel', 'surname -> Georgiev',
    'age -> 20', 'grade -> 6.00',
    'date -> 23/05/1995', 'town -> Sofia']);