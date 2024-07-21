const http=require('http');

const server=http.createServer((req,res)=>{
    console.log(req.url);
    if(req.url === '/contact'){
        res.end('Contact Page');
    }else if(req.url === '/about'){
        res.end('About Page');
    }else if(req.url === '/home'){
        res.end("Home Page");
    }else if(req.url === '/blog'){
        res.end("Blog Page");
    }else if(req.url === '/download Page'){
        res.end("Download Page");
    }else{
        res.end("Hello World");
    }
})

const port=1010;

server.listen(port,()=>{
    console.log(`Server Running On ${port}`);
});