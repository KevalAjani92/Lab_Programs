let a = 10,b=30;

console.log("Prime Numbers Between "+a+" and "+b+" are : ");

for (let index = a; index <= b ; index++) {
    if(isPrime(index)){
        console.log(index);
    }    
}

function isPrime(a) {
    flag = true;
    for(let i = 2;i<Math.sqrt(a);i++){
        if(a%i==0){
            flag = false;
            break;
        }
    }
    return flag;
}