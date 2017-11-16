function printLines(arr) {

    for (element of arr) {

        if (element === 'Stop') {

            break;
        }

        console.log(element);
    }
}

//printLines(['Line 1', 'Line 2', 'Line 3', 'Stop']);
//printLines(['3', '6', '5', '4', 'Stop', '10', '12']);