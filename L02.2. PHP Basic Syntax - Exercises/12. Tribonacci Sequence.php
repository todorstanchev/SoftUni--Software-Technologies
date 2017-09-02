<form>
    N: <input type="text" name="num"/>
    <input type="submit"/>
</form>
<?php
if (isset($_GET['num'])) {
    $num = intval($_GET['num']);

    $beforeBeforePrevious = 1;
    $beforePrevious = 1;
    $previous = 2;
    $current = 4;

    echo "$beforeBeforePrevious $beforePrevious $previous $current ";

    for ($index = 0; $index < $num - 4; $index++) {
        $beforeBeforePrevious = $beforePrevious;
        $beforePrevious = $previous;
        $previous = $current;
        $current = $previous + $beforePrevious + $beforeBeforePrevious;

        echo $current . ' ';
    }
}
?>