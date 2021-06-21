const http = require('http');
const app = require('./app');

const server = http.createServer(app);
server.listen(3000, 'localhost', ()=> {
    console.log('Server started @3000');
});