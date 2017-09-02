<form>
    N: <input type="text" name="num"/>
    <input type="submit"/>
</form>
<?php
if (isset($_GET['num'])) {
    $num = intval($_GET['num']);

    $factorial = 1;

    for ($index = 2; $index <= $num; $index++) {
        $factorial *= $index;
    }

    echo $factorial;
}
?>