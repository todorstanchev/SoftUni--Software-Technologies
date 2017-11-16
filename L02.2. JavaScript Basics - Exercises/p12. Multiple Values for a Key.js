function printValues(arr) {

    let searchedKey = arr.pop();

    let isSearchedKeyFound = false;

    for (let element of arr) {

        let elementTokens = element.split(' ');

        let key = elementTokens[0];

        if (key === searchedKey) {

            let value = elementTokens[1];

            console.log(value);

            isSearchedKeyFound = true;
        }
    }

    if (!isSearchedKeyFound) {

        console.log('None');
    }
}

//printValues(['key value', 'key eulav', 'test tset', 'key']);
//printValues(['3 test', '3 test1', '4 test2', '4 test3', '4 test5', '4']);
//printValues(['3 bla', '3 alb', '2']);