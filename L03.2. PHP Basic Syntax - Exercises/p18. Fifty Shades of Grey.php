<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
    <style>
        div {
            display: inline-block;
            margin: 5px;
            width: 20px;
            height: 20px;
        }
    </style>
</head>

<body>
<?php
for ($rowColor = 0; $rowColor <= 204; $rowColor += 51) {

    for ($colColor = $rowColor; $colColor <= $rowColor + 45; $colColor += 5) {

        echo "<div style='background-color: rgb($colColor, $colColor, $colColor)'></div>";
    }

    echo "<br/>";
}
?>
</body>
</html>