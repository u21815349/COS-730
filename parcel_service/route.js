const express = require('express');
const parcel = require('./modules/parcel');
const router = express.Router();
//const mssqlcon = require ('./modules/dbconnection');

router.get('/getAllParcels', parcel.getAllParcels );
router.post('/addParcel', parcel.addParcel );
router.get('/getParcelById', parcel.getParcelById);
router.get('/getParcelByCode', parcel.getParcelByCode);

module.exports = router;
