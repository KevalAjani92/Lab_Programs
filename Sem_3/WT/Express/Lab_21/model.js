const mongoose = require('mongoose');

const studentSchema  = new mongoose.Schema({
    name:String,
    age:Number,
    rollNo:{
        type:Number,
        unique:true
    }
});
const Student = mongoose.model('Student',studentSchema );
module.exports = Student;