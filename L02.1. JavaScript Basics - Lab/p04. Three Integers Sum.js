function sumThreeIntegers(arr) {

    let [firstNum, secondNum, thirdNum] = arr[0]
        .split(' ')
        .map(Number);

    console.log(
        check(firstNum, secondNum, thirdNum) ||
        check(firstNum, thirdNum, secondNum) ||
        check(secondNum, thirdNum, firstNum) ||
        'No'
    );

    function check(firstNum, secondNum, thirdNum) {

        if (firstNum + secondNum !== thirdNum) {

            return false;
        }

        if (firstNum > secondNum) {

            [firstNum, secondNum] = [secondNum, firstNum];
        }

        return `${firstNum} + ${secondNum} = ${thirdNum}`;
    }
}

//sumThreeIntegers(['8 15 7']);
//sumThreeIntegers(['-5 -3 -2']);
//sumThreeIntegers(['3 8 12']);
//sumThreeIntegers(['0 0 0']);