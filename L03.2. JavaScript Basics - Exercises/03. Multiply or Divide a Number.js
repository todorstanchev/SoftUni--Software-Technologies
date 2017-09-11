function multiplyOrDivide(arr) {
    let num1 = Number(arr[0]);
    let num2 = Number(arr[1]);

    return num1 > num2 ? num1 / num2 : num1 * num2;
}

console.log(multiplyOrDivide(['144', '12']));