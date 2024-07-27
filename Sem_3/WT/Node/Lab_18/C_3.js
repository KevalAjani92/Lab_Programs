const http=require('http');
const fs=require('fs');

const server=http.createServer((req,res)=>{
    if(req.url === '/about'){
        fs.readFile('about.txt',(err,data)=>{
            res.end(data.toString());
        })
    }else if(req.url === '/contact'){
        fs.readFile('contact.txt',(err,data)=>{
            res.end(data.toString());
        })
    }else {
        res.end("Enter /about or /contact");
    }
})

const port=3000;

server.listen(port,()=>{
    console.log(`Server Running On ${port}`);
});
