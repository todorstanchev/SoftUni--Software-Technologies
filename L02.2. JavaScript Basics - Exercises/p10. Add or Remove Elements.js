function addRemoveElements(arr) {

    let resultArr = [];

    for (let element of arr) {

        let elementTokens = element.split(' ');

        let command = elementTokens[0];
        let argument = elementTokens[1];

        if (command === 'add') {

            resultArr.push(argument);

        } else if (argument < resultArr.length) {

            resultArr.splice(argument, 1);
        }
    }

    console.log(resultArr.join('\n'));
}

//addRemoveElements(['add 3', 'add 5', 'add 7']);
//addRemoveElements(['add 3', 'add 5', 'remove 1', 'add 2']);
//addRemoveElements(['add 3', 'add 5', 'remove 2', 'remove 0', 'add 7']);