<?php
if (isset($_GET['text'])) {

    $text = $_GET['text'];

    preg_match_all('/\w+/', $text, $words);

    $upperWords = array_filter($words[0], function ($word) {

        return strtoupper($word) == $word;
    });

    echo implode(', ', $upperWords);
} ?>

<form>
    <textarea name="text" rows="10"></textarea> <br>
    <input type="submit" value="Extract"/>
</form>