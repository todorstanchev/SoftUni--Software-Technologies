<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
    <style>
        button {
            display: block;
        }
    </style>
</head>
<body>
<form>
    N: <input type="text" name="num"/>
    <input type="submit"/>
</form>
<?php
if (!isset($_GET['num'])) {
    exit(1);
}

$num = intval($_GET['num']);

for ($index = 1; $index <= $num; $index++) {
    echo "<button>$index</button>\n";
}
?>
</body>
</html>
