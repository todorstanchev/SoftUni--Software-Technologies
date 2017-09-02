<form>
    N: <input type="text" name="num"/>
    <input type="submit"/>
</form>
<?php
if (isset($_GET['num'])) {
    $num = intval($_GET['num']);

    for ($index = $num; $index > 1; $index--) {
        $isprime = true;

        for ($pos = $index - 1; $pos > 1; $pos--) {
            if ($index % $pos == 0) {
                $isprime = false;
                break;
            }
        }

        if ($isprime) {
            echo $index . ' ';
        }
    }
}
?>