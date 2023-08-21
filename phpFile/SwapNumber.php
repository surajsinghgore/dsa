<?php
$a=10;$b=20;
function CallByValue($x,$y){
$temp=$x;
$x=$y;
$y=$temp;
echo "<h1>Call By Value A : $x B : $y <br></h1>";
}

function CallByReference(&$x,&$y){
$temp=$x;
$x=$y;
$y=$temp;
echo "<h1>Call By Reference A : $x B : $y </h1>";
}

CallByValue($a,$b);
CallByReference($a,$b);
echo "$a $b";
?>