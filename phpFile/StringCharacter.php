<?php

$str="HelloText";
echo "<h2><center>Original String <span style=\"color:red\">$str </span><br> </center></h2>";
$len=strlen($str);

for($i=0;$i<$len;$i++){
echo "Character at $i = $str[$i] <br>";
}
?>