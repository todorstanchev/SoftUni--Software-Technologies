function symmetricNumbers(arr) {
    let num = Number(arr[0]);
    let result = '';

    for (let index = 1; index <= num; index++) {

        if (isSymmetric(index.toString())) {
            result += index + ' ';
        }
    }

    console.log(result);

    function isSymmetric(strNum) {
        for (let pos = 0; pos < strNum.length / 2; pos++) {

            if (strNum[pos] !== strNum[strNum.length - pos - 1]) {
                return false;
            }
        }

        return true;
    }
}

console.log(symmetricNumbers(['100']));
console.log(symmetricNumbers(['750']));