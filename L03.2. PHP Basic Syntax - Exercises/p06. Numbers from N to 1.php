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

    for ($index = $number; $index > 0; $index--) {

        echo "$index ";
    }
}
?>
</body>
</html>