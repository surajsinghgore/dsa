<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
input{
width: 620px;
outline: none;
border: 3px solid #03599c;
height: 40px;
margin-left: 28%;
color: #03599c;
padding: 0% 1%;
font-size: 30px;
text-align: center;
}

input[type=number]::-webkit-inner-spin-button, 
input[type=number]::-webkit-outer-spin-button { 
    -webkit-appearance: none;
    -moz-appearance: none;
    appearance: none;
    margin: 0; 
}

input:focus{

border: 3px solid #03599c;

}
h1{
    margin-top: 5%;
text-align: center;
color: #05affc;
font-size: 40px;
}

h3{
margin-left: 4%;
font-size: 25px;
color: #0293d6;
}
h3 span{
color: #014a6b;

}

    </style>
</head>
<body>
    <form action="SumOfDigit.php" method="POST">
<input type="Number" name="Number" id="number" placeholder="Enter Any Number To get Sum Of Digit " value=<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
  // collect value of input field
  $userNumber = $_POST['Number'];
  if (empty($userNumber)) {
    echo 0;
  } else {
    echo $userNumber;
  }
}
?>>
    </form>




<h1>Sum Of Digit of a Number Program</h1>
<h3>Original Number Is : <span>    <?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
  // collect value of input field
  $userNumber = $_POST['Number'];
  if (empty($userNumber)) {
    echo "Number is Empty";
  } else {
    echo $userNumber;
  }
}
?></span></h3>
<h3>Sum Of Digit Of a Number Is : <span>
    

<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
  // collect value of input field
  $userNumber = $_POST['Number'];
  if (empty($userNumber)) {
    echo "Number is Empty";
  } else {
    $sum=0;

    while($userNumber!=0){
        $digit=$userNumber%10;
$sum=$sum+$digit;

        $userNumber = (int)($userNumber / 10);
    }
    echo $sum;
  }
}
?>


</span></h3>
</body>
</html>