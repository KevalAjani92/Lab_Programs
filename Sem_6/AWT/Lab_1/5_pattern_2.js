let rows = 6;
let pattern = "";

for(let i=rows;i>0;i--){
    //space
    for(let j=1;j<=rows-i;j++){
        pattern += " ";
    }

    //other
    let symbol = "";
    if(i%2==0){
        symbol = "@"
    }else{
        symbol = "*"
    }
    for(let j=1;j<=2*i-1;j++){
        if(j%2==0){
            pattern += " "
        }else{
            pattern += symbol
        }
    }
    pattern += "\n"
}
console.log(pattern);
