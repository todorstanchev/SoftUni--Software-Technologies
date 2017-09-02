<form>
    N: <input type="text" name="num"/>
    <input type="submit"/>
</form>
<?php
if (isset($_GET['num'])) {
    $num = intval($_GET['num']);

    for ($index = $num; $index > 0; $index--) {
        if ($index % 2 == 1) {
            echo $index . ' ';
        }
    }
}
?>