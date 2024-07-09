const mySym = Symbol("Key1");

const user = {
    name: "Keval Ajani",
    [mySym]: "MyKey1",
    email: "ak@gmail.com",
    age: 18,
    isLoggedIn: false,
    location: "Rajkot"
};

// console.log(user.name);
// console.log(user["age"]);
// console.log(user[mySym]);

// console.log(user);
// Object.freeze(user);  // Used to stop changing values Of Object

user.greetings = function () {
    console.log(`Hello User ${this.name}`);
}

// console.log(user.greetings());

const obj1={1:'a',2:'b'};
const obj2={3:'c',4:'d'};

const obj3=Object.assign({},obj1,obj2);

const obj4={...obj1,...obj2};
// console.log(obj4);

// console.log(Object.keys(user));
// console.log(Object.values(user));
// console.log(Object.entries(user));

// console.log(user.hasOwnProperty('age'));

const {name}=user;                  //destructuring Of Objects
const {email : userEmail} =user;  
console.log(userEmail);
console.log(name);