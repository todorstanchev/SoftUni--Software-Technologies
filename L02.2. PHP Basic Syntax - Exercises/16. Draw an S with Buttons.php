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

        $button = '';
        $buttonOne = "<button style='background-color: blue'>1</button>";
        $buttonZero = "<button>0</button>";

        if ($row == 0 || $row == 4 || $row == 8) {
            $button = $buttonOne;
        } else if ($row > 0 && $row < 4) {
            if ($col == 0) {
                $button = $buttonOne;
            } else {
                $button = $buttonZero;
            }
        } else {
            if ($col == 4) {
                $button = $buttonOne;
            } else {
                $button = $buttonZero;
            }
        }
        echo $button;
    }
    echo "</br>";
}
?>
</body>
</html>