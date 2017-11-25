<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
</head>

<body>
<form>
    X: <input type="text" name="num1"/>
    Y: <input type="text" name="num2"/>
    Z: <input type="text" name="num3"/>
    <input type="submit"/>
</form>

<?php
if (isset($_GET['num1']) && isset($_GET['num2']) && isset($_GET['num3'])) {

    $strNumbers = [$_GET['num1'], $_GET['num2'], $_GET['num3']];

    $numbers = array_map('intval', $strNumbers);

    if (in_array(0, $numbers)) {

        echo 'Positive';

        return;
    }

    $negativeNumbers = array_filter($numbers, function ($num) {

        return $num < 0;
    });

    echo count($negativeNumbers) % 2 == 0 ? 'Positive' : 'Negative';
}
?>
</body>
</html>