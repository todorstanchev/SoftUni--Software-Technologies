function printValue(arr) {

    let key = arr[arr.length - 1];

    let hasKey = false;

    for (let index = arr.length - 2; index >= 0; index--) {

        let arrTokens = arr[index].split(' ');

        if (arrTokens[0] === key) {

            console.log(arrTokens[1]);

            hasKey = true;

            return;
        }
    }

    console.log('None');
}

printValue(['key value', 'key eulav', 'test tset', 'key']);