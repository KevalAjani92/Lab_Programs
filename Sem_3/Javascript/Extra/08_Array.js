const myArr=[1,2,3,4,5,6];

const myArr2=new Array(1,2,3,4,5,6);

myArr.push(8);
myArr.pop();
myArr.unshift(15);
myArr.shift();

console.log(myArr);

const mn1=myArr.slice(1,3);
console.log(mn1);
console.log(myArr);

const mn2=myArr.splice(1,3);
console.log(mn2);
console.log(myArr);

console.log(Array.isArray("Keval"));
console.log(Array.from("Keval"));



