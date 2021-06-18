const express = require('express');
const parcel = require('./modules/parcel');
const router = express.Router();
//const mssqlcon = require ('./modules/dbconnection');

router.get('/parcel', parcel.getAllParcels );
router.post('/parcel', parcel.addParcel );
router.get('/parcel/id', parcel.getParcelById);
router.get('/parcel/code', parcel.getParcelByCode);

/** 
router.get('/search', async(req, res) =>{
    const conn = await mssqlcon.getConnection();
    const result = await conn.request()
        .input('parcel_id', req.query.id)
        .execute('getParcelById')
    res.send(result)
})
*/

module.exports = router;
