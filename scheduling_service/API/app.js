const express = require('express');
const route = require('./route');
const app = express();

app.use(express.json({limit: '50mb'}));
app.use('/api/delivery/service',route); 

module.exports = app;