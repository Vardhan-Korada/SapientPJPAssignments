var clear = document.querySelector("#Clear")
var eqs = document.querySelector("#equals")
var inp = document.querySelector("#inp")
var res = document.querySelector("#res")
var but_1 = document.querySelector("#one").addEventListener("click",function(){
    inp.value = inp.value.concat("1")
})
var but_2 = document.querySelector("#two").addEventListener("click",function(){
    inp.value = inp.value.concat("2")
})
var but_3 = document.querySelector("#three").addEventListener("click",function(){
    inp.value = inp.value.concat("3")
})
var but_4 = document.querySelector("#four").addEventListener("click",function(){
    inp.value = inp.value.concat("4")
})
var but_5 = document.querySelector("#five").addEventListener("click",function(){
    inp.value = inp.value.concat("5")
})
var but_6 = document.querySelector("#six").addEventListener("click",function(){
    inp.value = inp.value.concat("6")
})
var but_7 = document.querySelector("#seven").addEventListener("click",function(){
    inp.value = inp.value.concat("7")
})
var but_8 = document.querySelector("#eight").addEventListener("click",function(){
    inp.value = inp.value.concat("8")
})
var but_9 = document.querySelector("#nine").addEventListener("click",function(){
    inp.value = inp.value.concat("9")
})
var but_0 = document.querySelector("#zero").addEventListener("click",function(){
    inp.value = inp.value.concat("0")
})
var but_p = document.querySelector("#plus").addEventListener("click",function(){
    inp.value = inp.value.concat("+")
})
var but_s = document.querySelector("#minus").addEventListener("click",function(){
    inp.value = inp.value.concat("-")
})
var but_m = document.querySelector("#multiply").addEventListener("click",function(){
    inp.value = inp.value.concat("*")
})
var but_d = document.querySelector("#divide").addEventListener("click",function(){
    inp.value = inp.value.concat("/")
})
var but_r = document.querySelector("#mod").addEventListener("click",function(){
    inp.value = inp.value.concat("%")
})
var but_dot = document.querySelector("#dot").addEventListener("click",function(){
    inp.value = inp.value.concat(".")
})
clear.addEventListener("click",function(){
    inp.value = "";
    res.value = "";
})
eqs.addEventListener("click",function(){
    try {
       res.value = eval(inp.value); 
    } catch (e) {
        if (e instanceof SyntaxError) {
            res.value=e;
        }
    }
})