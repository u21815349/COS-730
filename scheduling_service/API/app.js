const http = require('http');
const express = require('express');
const bodyparser = require('body-parser');
const route = require('./route');
const app = express();

//app.use(bodyparser.json({limit: '50mb'}));
//app.use(bodyparser.urlencoded({limit: '50mb', extended: true, parameterLimit: 5000}));
app.use(express.json({limit: '50mb'}));
app.use('/api/delivery/service',route); 
//app.use('/', (req, res,next)=>{});
const server = http.createServer(app);
server.listen(3000);

//jarGAs