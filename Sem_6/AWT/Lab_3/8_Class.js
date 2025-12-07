class Person{
    constructor(name, age){
        this.name = name;
        this.age = age;
    }
    displayInfo(){
        console.log(`Name: ${this.name}, Age: ${this.age}`);
    }
}
let person1 = new Person("Alice", 30);
person1.displayInfo();

//Inheritance Example
class Student extends Person{
    constructor(name, age, studentId){
        super(name, age);
        this.studentId = studentId;
    }   
    displayInfo(){
        super.displayInfo();
        console.log(`Student ID: ${this.studentId}`);
    }
}
let student1 = new Student("Bob", 20, "S12345");
console.log("\nStudent Info");

student1.displayInfo();
