function printValues(arr) {

    let searchedKey = arr.pop();

    let isSearchedKeyFound = false;

    for (let index = 0; index < arr.length; index++) {

        let arrTokens = arr[index].split(' ');

        let key = arrTokens[0];
        let value = arrTokens[1];

        if (key === searchedKey) {

            console.log(value);

            isSearchedKeyFound = true;
        }
    }

    if (!isSearchedKeyFound) {

        console.log('None');
    }
}

//printValues(['key value', 'key eulav', 'test tset', 'key']);
printValues(['3 test', '3 test1', '4 test2', '4 test3', '4 test5', '4']);
//printValues(['3 bla', '3 alb', '2']);