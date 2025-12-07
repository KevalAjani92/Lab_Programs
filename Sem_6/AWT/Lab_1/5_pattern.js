let rows = 6;
let pattern = "";
for(let i = 1;i<=rows;i++){
    //space logic
    for(let j=1;j<=rows-i;j++){
        pattern += " ";
    }

    //num logic
    var temp = rows;
    for(let j=1;j<=2*i-1;j++){
        if(j%2==0){
            pattern+=" ";
        }else{
            pattern += temp.toString();
            temp--;
        }
    }
    pattern += "\n";
}
console.log(pattern);
