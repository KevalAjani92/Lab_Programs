//Demonstrate the difference between let and var.

function abc(){
    if(true){
        let letVariable = "Let Variable";
        var varVariable = "Var Variable";
    }
    console.log("Var :",varVariable);       // Accessible Due to Functional Scope
    // console.log("Let :",letVariable);    //Not accessible because of block scope
}
abc();