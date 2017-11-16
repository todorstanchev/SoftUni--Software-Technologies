function printValue(arr) {

    let searchedKey = arr.pop();

    for (let index = arr.length - 1; index >= 0; index--) {

        let arrTokens = arr[index].split(' ');

        let currentKey = arrTokens[0];

        if (currentKey === searchedKey) {

            let value = arrTokens[1];

            console.log(value);

            return;
        }
    }

    console.log('None');
}

//printValue(['key value', 'key eulav', 'test tset', 'key']);
//printValue(['3 test', '3 test1', '4 test2', '4 test3', '4 test5', '4']);
//printValue(['3 bla', '3 alb', '2']);