const express = require('express');
const app = express();
const fs = require('fs');

app.get('/', (req, res) => {
    res.send("Hello World");
});

app.get('/about',(req,res)=>{
    const data = fs.readFileSync('./about.txt')
    res.send(data.toString());
});
app.get('/contact',(req,res)=>{
    const data = fs.readFileSync('./contact.txt')
    res.send(data);
});

app.listen(3000, () => {
    console.log("Server Running On Port 3000");
})