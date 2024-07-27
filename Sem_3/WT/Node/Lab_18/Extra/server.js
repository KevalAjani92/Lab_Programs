const http = require('http');
const fs = require('fs');
const path = require('path');

const server = http.createServer((req, res) => {
    res.setHeader('Content-Type', 'text/html');

    if (req.url === '/about' || req.url === '/contact' || req.url === '/home' || req.url === '/blog' || req.url === '/download') {
        const fileName = req.url.substring(1) + '.html';
        const filePath = path.join(__dirname, fileName);

        fs.readFile(filePath, (err, data) => {
            if (err) {
                res.statusCode = 404;
                res.end('Page not found');
                return;
            }

            res.write(data);
            res.end();
        });
    } else if (req.url === '/') {
        fs.readFile('index.html', (err, data) => {
            if (err) {
                res.statusCode = 404;
                res.end('Hello World');
                return;
            }

            res.write(data);
            res.end();
        });
    } else {
        res.statusCode = 404;
        res.end('Page not found');
    }
});

const port = 3000;

server.listen(port, () => {
    console.log("Server is Started On " + port);
});
