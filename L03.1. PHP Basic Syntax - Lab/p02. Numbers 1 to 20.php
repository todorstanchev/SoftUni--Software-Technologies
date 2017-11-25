<ul>
    <?php for ($i = 1; $i <= 20; $i++) {

        $color = $i % 2 == 0 ? "green" : "blue";

        echo "\t<li><span style='color:$color'>$i</span></li>\n";
    } ?>
</ul>