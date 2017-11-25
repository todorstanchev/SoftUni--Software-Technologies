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

    for ($index = $number; $index > 1; $index--) {

        $isPrime = true;

        for ($pos = $index - 1; $pos > 1; $pos--) {

            if ($index % $pos == 0) {

                $isPrime = false;
                break;
            }
        }

        if ($isPrime) {

            echo "$index ";
        }
    }
}
?>
</body>
</html>