function setValuesToIndicesInArray(arr) {
    let resultArrLength = Number(arr[0]);

    let resultArr = Array(resultArrLength).fill(0);

    for (let i = 1; i < arr.length; i++) {
        let elements = arr[i].split(' - ').map(Number);

        let index = elements[0];
        let value = elements[1];

        resultArr[index] = value;
    }

    console.log(resultArr.join('\n'));
}

setValuesToIndicesInArray(['5', '0 - 3', '3 - -1', '4 - 2']);