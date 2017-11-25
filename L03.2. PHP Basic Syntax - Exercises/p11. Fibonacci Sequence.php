<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
</head>

<body>
<form>
    N: <input type="text" name="num"/>
    <input type="submit"/>
</form>

<?php
if (isset($_GET['num'])) {

    $number = intval($_GET['num']);

    $temp = 1;
    $previous = 1;
    $current = 2;

    echo "$temp $previous $current ";

    for ($index = 0; $index < $number - 3; $index++) {

        $temp = $previous;
        $previous = $current;
        $current = $previous + $temp;

        echo "$current ";
    }
}
?>
</body>
</html>