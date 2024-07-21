const path=require('path');

var filename=path.basename('/Users/Refsnes/demo_path../abc/def.js');
console.log(filename);

var normalName=path.normalize('C:////temp\\\\/\\/\\/foo/bar');
console.log(normalName);

var abs=path.isAbsolute('/Users/demo_path../def.js');
console.log(abs);

var extension=path.extname('/Users/demo_path../def.js');
console.log(extension);

var x = path.join('Users', 'Refsnes', 'demo_path.js');
console.log(x);

console.log(path.parse('C:\\path\\dir\\file.txt'));

console.log(path.relative('C:\\orandea\\test\\aaa', 'C:\\orandea\\impl\\bbb'));
