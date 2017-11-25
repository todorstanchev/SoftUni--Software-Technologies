<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
</head>

<body>
<?php
for ($row = 0; $row < 9; $row++) {

    for ($col = 0; $col < 5; $col++) {

        if (($row == 0 || $row == 4 || $row == 8)
            || ($col == 0 && $row > 0 && $row < 4)
            || ($col == 4 && $row > 4)
        ) {
            echo "<button style='background-color: blue'>1</button>";

        } else {

            echo "<button>0</button>";
        }
    }

    echo "<br>";
}
?>
</body>
</html>