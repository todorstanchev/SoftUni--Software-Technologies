function productOfThreeNumbers(arr) {
    let nums = arr.map(Number);

    if (nums.includes(0)) {
        return 'Positive';
    }

    let negatives = nums.filter(n => n < 0).length;

    return negatives % 2 == 0 ? 'Positive' : 'Negative';
}

console.log(productOfThreeNumbers(['-3', '-1', '5']));