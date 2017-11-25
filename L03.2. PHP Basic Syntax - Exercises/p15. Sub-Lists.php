<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
</head>

<body>
<form>
    N: <input type="text" name="num1"/>
    M: <input type="text" name="num2"/>
    <input type="submit"/>
</form>

<ul>
    <?php
    if (isset($_GET['num1']) && isset($_GET['num2'])) {

        $firstNum = intval($_GET['num1']);
        $secondNum = intval($_GET['num2']);

        for ($index = 1; $index <= $firstNum; $index++) {

            echo "<li>List $index";

            echo "<ul>";

            for ($pos = 1; $pos <= $secondNum; $pos++) {

                echo "<li>Element $index.$pos</li>";
            }

            echo "</ul>";
            echo "</li>";
        }
    }
    ?>
</ul>
</body>
</html>