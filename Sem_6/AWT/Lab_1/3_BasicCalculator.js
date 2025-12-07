operation = prompt("Enter a Operation(+,-,/,*,%) You Want to Perform.")
a = prompt("Enter First Number")
b = prompt("Enter Second Number")

let err = document.getElementById("error")
let ans = document.getElementById("ans")

if(operation === "+"){
    ans.innerText = `The Sum of ${a} and ${b} is : ${parseFloat(a) + parseFloat(b)}`
    err.innerText = ""
}else if(operation === "-"){
    ans.innerText = `The Difference of ${a} and ${b} is : ${parseFloat(a) - parseFloat(b)}`
    err.innerText = ""
}else if(operation === "*"){
    ans.innerText = `The Product of ${a} and ${b} is : ${parseFloat(a) * parseFloat(b)}`
    err.innerText = ""
}else if(operation === "/"){
    if(b == 0){
        err.innerText = "Division by Zero is Not Allowed!"
        ans.innerText = ""
    }else{
        ans.innerText = `The Quotient of ${a} and ${b} is : ${parseFloat(a) / parseFloat(b)}`
        err.innerText = ""
    }
}else if(operation === "%"){
    ans.innerText = `The Remainder of ${a} and ${b} is : ${parseFloat(a) % parseFloat(b)}`
    err.innerText = ""
}else{
    err.innerText = "Invalid Operation! Please Enter a Valid Operation."
    ans.innerText = ""
}
