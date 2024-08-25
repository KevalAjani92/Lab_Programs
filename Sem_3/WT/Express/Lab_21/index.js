const mongoose = require('mongoose');
const express = require('express');
const Student = require('./model');
const body_parser = require('body-parser');

const connectionString = "mongodb+srv://kevalajani:Keval123@cluster0.nz6hf.mongodb.net/LAB_WORK"

mongoose.connect(connectionString).then(()=>{
    console.log("Database Connected");
    
    const app = express();
    app.use(body_parser.urlencoded());
    app.get('/students',async (req,res)=>{
        const data = await Student.find();
        res.send(data);
    });
    app.get('/students/:rollNo',async (req,res)=>{
        const data = await Student.findOne({rollNo:req.params.rollNo});
        res.send(data);
    });
    app.post('/students', (req,res)=>{
        const data = new Student({...req.body});
        data.save();
        res.send(data);
    });
    app.patch('/students/:rollNo',async (req,res)=>{
        const data =await Student.findOneAndUpdate({rollNo:req.params.rollNo},req.body,{new:true});
        res.send(data);
    });
    app.delete('/students/:rollNo',async (req,res)=>{
        const ans = await Student.findOneAndDelete({rollNo:req.params.rollNo});
        res.send(ans);
    });
    app.get('/students/search/:text',async (req,res)=>{
        const data = await Student.find();
        const ans = data.filter((student)=>{
            if(student.name.toLowerCase().indexOf(req.params.text)>-1){
                return true;
            }
        })
        res.send(ans);
    })
    app.listen(3000,()=>{
        console.log("Server Connected");
    });
})