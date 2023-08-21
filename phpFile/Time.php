<?php 
$seconds=60;
$minutes=120;

echo "<h1>Input Minutes is : $minutes and Seconds = $seconds<br></h1>";


function convert_seconds_to_minutes($s){
$min=$s/60;
return $min;
}

function convert_minutes_to_Hourse($m){
$hours=$m/60;
return $hours;
}
echo "<h1>$seconds seconds is ".convert_seconds_to_minutes($seconds)." Minutes <br></h1>";
echo "<h1>$minutes Minutes is ".convert_minutes_to_Hourse($minutes)." Hours </h1>";
?>