function isProductPositiveOrNegative(arr) {

    let nums = arr.map(Number);

    if (nums.includes(0)) {

        console.log('Positive');

        return;
    }

    let negativesCount = nums.filter(n => n < 0).length;

    console.log(negativesCount % 2 === 0 ? 'Positive' : 'Negative');
}

//isProductPositiveOrNegative(['2', '3', '-1']);
//isProductPositiveOrNegative(['5', '4', '3']);
//isProductPositiveOrNegative(['-3', '-4', '5']);