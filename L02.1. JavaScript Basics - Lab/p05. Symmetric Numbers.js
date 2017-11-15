function printSymmetricNumbers([strNum]) {

    let num = Number(strNum);

    let symmetricNumbers = [];

    for (let index = 1; index <= num; index++) {

        if (isSymmetric(index.toString())) {

            symmetricNumbers.push(index);
        }
    }

    console.log(symmetricNumbers.join(' '));

    function isSymmetric(strNum) {

        let reversedStrNum = strNum.split('').reverse().join('');

        return strNum === reversedStrNum;
    }
}

//printSymmetricNumbers(['100']);
//printSymmetricNumbers(['750']);