const http = require('http');
const express = require('express');
const bodyparser = require('body-parser');
const route = require('./route');
const app = express();

app.use(express.json({limit: '50mb'}));
app.use('/api/vehicle/service',route); 
const server = http.createServer(app);
server.listen(3002);