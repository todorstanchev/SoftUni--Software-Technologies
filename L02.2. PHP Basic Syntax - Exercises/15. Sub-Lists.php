<form>
    N: <input type="text" name="num1"/>
    M: <input type="text" name="num2"/>
    <input type="submit"/>
</form>
<ul>
    <?php
    if (!isset($_GET['num1']) || !isset($_GET['num2'])) {
        exit(1);
    }

    $num1 = intval($_GET['num1']);
    $num2 = intval($_GET['num2']);

    for ($index = 1; $index <= $num1; $index++) {
        echo "<li>List $index";
        echo "<ul>";

        for ($pos = 1; $pos <= $num2; $pos++) {
            echo "<li>Element $index.$pos</li>";
        }

        echo "</ul>";
        echo "</li>";
    }
    ?>
</ul>