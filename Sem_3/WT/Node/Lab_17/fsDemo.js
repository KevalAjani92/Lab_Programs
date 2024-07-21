const fs=require('fs');

fs.exists('pathDemo.js',(e)=>{   // check whether file exists or not.
    // console.log(e); 
});

fs.stat('path.js',(err,data)=>{   // retur details about file
    // console.log(data);
});

// fs.readFile('pathDemo.js',(err,data)=>{
//     console.log(data.toString());
// });

fs.readFile('pathDemo.js',(err,data)=>{
    fs.writeFile('demo.txt',data,(err)=>{
        
    });
});
