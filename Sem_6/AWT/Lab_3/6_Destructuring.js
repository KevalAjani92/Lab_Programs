//Demonstrate the Array and Object Destructuring.
let arr = [100, 200, 300];
let [a, ...rest] = arr;
console.log("Array Destructuring:");
console.log("a:", a);
console.log("rest:", rest);

let obj = { x: 10, y: 20, z: 30, a: 40 };
let { x, y,...remain } = obj;
console.log("Object Destructuring:");
console.log("x:", x);
console.log("y:", y);
console.log("remain:", remain);
