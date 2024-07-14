const user = {
    userName: "Keval Ajani",
    age: 18,

    welcomeMessage: function () {
        console.log(`${this.userName} , Welcome To Wesite`);
        console.log(this);
    }
}

// user.welcomeMessage();

const one = () =>{
    let userName="Keval Ajani";
    console.log(this);           
}
// one();

// const addTwo=(num1,num2)=> num1+num2;
const addTwo=(num1,num2)=> (num1+num2);

console.log(addTwo(5,4));