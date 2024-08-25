const express = require('express');
const app = express();

app.get('/',(req,res)=>{
    res.send("Hello World");
});

app.get('/home',(req,res)=>{
    res.send("Welcome to Home Page");
});
app.get('/contact',(req,res)=>{
    res.send("Welcome to Contact Page");
});
app.get('/about',(req,res)=>{
    res.send("Welcome to About Page");
});
app.get('/blog',(req,res)=>{
    res.send("Welcome to Blog Page");
});
app.get('/download',(req,res)=>{
    res.send("Welcome to Download Page");
});

app.listen(3000,()=>{
    console.log("Server Running On Port 3000");
})