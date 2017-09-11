function addRemoveElements(arr) {

    let resultArr = [];

    for (let index = 0; index < arr.length; index++) {
        let arrTokens = arr[index].split(' ');

        let command = arrTokens[0];
        let argument = Number(arrTokens[1]);

        switch (command) {
            case 'add':
                resultArr.push(argument);
                break;
            case 'remove':
                if (argument < resultArr.length) {
                    resultArr.splice(argument, 1);
                }
                break;
        }
    }

    console.log(resultArr.join('\n'));
}

addRemoveElements(['add 3', 'add 5', 'remove 2', 'remove 0', 'add 7']);