const http=require('http');

const server=http.createServer((req,res)=>{
    res.end('Hello World');
})

const port=1010;

server.listen(port,()=>{
    console.log(`Server Running On ${port}`);
});