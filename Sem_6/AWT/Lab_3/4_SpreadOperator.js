let arr1 = [1, 2, 3];
let arr2 = [4, 5, 6];

let combinedArr = [...arr1, ...arr2];
let combinedArr2 = [arr1,arr2];

console.log("Combined Array (Without Spread):", combinedArr2);
console.log("Combined Array (With Spread):", combinedArr);
