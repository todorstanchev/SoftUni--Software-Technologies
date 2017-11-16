function multiplyOrDivide(arr) {

    let firstNum = Number(arr[0]);
    let secondNum = Number(arr[1]);

    console.log(firstNum > secondNum ? firstNum / secondNum : firstNum * secondNum);
}

//multiplyOrDivide(['2', '3']);
//multiplyOrDivide(['13', '13']);
//multiplyOrDivide(['3', '2']);
//multiplyOrDivide(['144', '12']);