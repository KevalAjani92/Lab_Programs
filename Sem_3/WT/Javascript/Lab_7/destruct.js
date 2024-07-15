const arr=[1,2,3]

let c=8;
const new_arr=[...arr,c];

[c,...rest]=new_arr;
console.log(new_arr);
console.log(rest);

let obj={
    a:'H',
    b:'e',
    c:'l',
    d:'l'
};

const new_obj={...obj,e:'o'};

const {b,...rest_obj}=new_obj;
console.log(obj);
console.log(new_obj);
console.log(rest_obj);