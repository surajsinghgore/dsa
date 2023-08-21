<?php

$str="HelloText";
echo "<h2><center>Original String <span style=\"color:red\">$str </span><br> </center></h2>";
$len=strlen($str);

echo "Length  of String is <span style=\"color:red\">$len</span>";

echo "<h2><center>Different  <span style=\"color:red\">Case Function</span><br> </center></h2>";

echo " Lower Case <span style=\"color:red\">".strtolower($str)."</span> <br>";
echo " upper Case <span style=\"color:red\">".strtoupper($str)."</span> <br>";
echo " Uc First <span style=\"color:red\">".ucfirst($str)."</span> <br>";
echo " Lc First <span style=\"color:red\">".lcfirst($str)."</span> <br>";
echo " Uc Word <span style=\"color:red\">".ucwords($str)."</span> <br>";

?>


