<!DOCTYPE html>
<html>
<body>
<center>
<h1>Arithmetic Operation</h1>


<h3>1st Number: <input type="number" id="typeInput1" style="height: 15px;width: 100px;"></h3>
<h3>2nd Number: <input type="number" id="typeInput2" style="height: 15px;width: 100px;"></h3>
<button  style="height: 25px;width: 60px;" onclick="press1()">Multiply</button>
<button  style="height: 25px;width: 60px;" onclick="press2()">Divide</button>
<h3>The Result is:</h3>

<h3 id="answer"></h3>

</center>



<script>


function press1(){
    
    let a=document.getElementById('typeInput1').value;
    let b=document.getElementById('typeInput2').value;
    document.getElementById("answer").innerHTML =a*b;

}

function press2(){
    
    let a=document.getElementById('typeInput1').value;
    let b=document.getElementById('typeInput2').value;
    document.getElementById("answer").innerHTML =a/b;

}

</script>

</body>
</html>
