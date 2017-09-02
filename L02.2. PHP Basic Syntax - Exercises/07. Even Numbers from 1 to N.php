<form>
    N: <input type="text" name="num"/>
    <input type="submit"/>
</form>
<?php
if (isset($_GET['num'])) {
    $num = intval($_GET['num']);

    for ($index = 2; $index <= $num; $index += 2) {
        echo $index . ' ';
    }
}
?>