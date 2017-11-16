function setValuesToIndicesInArray(arr) {

    let resultArrLength = Number(arr.shift());

    let resultArr = new Array(resultArrLength).fill(0);

    for (let element of arr) {

        let elementTokens = element.split(' - ');

        let index = Number(elementTokens[0]);
        let value = elementTokens[1];

        resultArr[index] = value;
    }

    console.log(resultArr.join('\n'));
}

//setValuesToIndicesInArray(['3', '0 - 5', '1 - 6', '2 - 7']);
//setValuesToIndicesInArray(['2', '0 - 5', '0 - 6', '0 - 7']);
//setValuesToIndicesInArray(['5', '0 - 3', '3 - -1', '4 - 2']);