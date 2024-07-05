function calc(a,b,callback) {
    callback(a,b);
}
function add(a,b) {
    console.log(a+b);
}
function sub(a,b) {
    console.log(a-b);
}
function multi(a,b) {
    console.log(a*b);
}
function division(a,b) {
    if(b==0){
        console.log("Can't Divide By Zero");
        return;
    }
    console.log(a/b);
}

calc(4,4,multi);