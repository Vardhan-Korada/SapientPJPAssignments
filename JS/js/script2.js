var inp = document.querySelector("#inp")
var res = document.querySelector("#getRes")
var clear = document.querySelector("#clear")
var empId = document.querySelector("#empId")
var empName = document.querySelector("#empName")
var empAge = document.querySelector("#empAge")
var empDetails = {"001":["Vardhan",27],"002":["Ritesh",35],"003":["Satish",21]}
res.addEventListener("click",function(){
    if(empDetails[inp.value] != null){
    empId.innerHTML = inp.value;
    empName.innerHTML = empDetails[inp.value][0]
    empAge.innerHTML = empDetails[inp.value][1]
    } else{
        alert("Employee record not found...");
    }
})
clear.addEventListener("click",function(){
    inp.value = "";
})