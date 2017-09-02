<form>
    N: <input type="text" name="num"/>
    <input type="submit"/>
</form>
<?php
if (isset($_GET['num'])) {
    $num = intval($_GET['num']);

    for ($index = $num; $index > 0; $index--) {
        $result = $num / $index;
        if ($result != (int)$result) {
            echo $index . ' ';
        }
    }
}
?>