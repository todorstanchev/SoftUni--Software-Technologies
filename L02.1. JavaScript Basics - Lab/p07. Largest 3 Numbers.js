function printLargestThreeNumbers(arr) {

    console.log(arr.map(Number)
        .sort((a, b) => b - a)
        .slice(0, 3)
        .join('\r\n'));
}

//printLargestThreeNumbers(['10', '30', '15', '20', '50', '5']);
//printLargestThreeNumbers(['20', '30']);
//printLargestThreeNumbers(['10', '5', '20', '3', '20']);