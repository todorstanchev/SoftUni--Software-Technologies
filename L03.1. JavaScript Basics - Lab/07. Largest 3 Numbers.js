function printLargestThreeNumbers(arr) {
    console.log(arr.map(Number)
        .sort((a, b) => b - a)
        .slice(0, 3)
        .join('\r\n'));
}

let arr = ['10', '30', '15', '20', '50', '5'];

printLargestThreeNumbers(arr);