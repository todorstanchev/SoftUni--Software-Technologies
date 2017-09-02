<form>
    N: <input type="text" name="num"/>
    <input type="submit"/>
</form>
<?php
if (isset($_GET['num'])) {
    $num = intval($_GET['num']);

    $temp = 1;
    $previous = 1;
    $current = 2;

    echo "$temp $previous $current ";

    for ($index = 0; $index < $num - 3; $index++) {
        $temp = $previous;
        $previous = $current;
        $current = $previous + $temp;

        echo $current . ' ';
    }
}
?>