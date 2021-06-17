const express = require('express');
const vehicle = require('./modules/vehicle');
const router = express.Router();
//const mssqlcon = require ('./modules/dbconnection');

router.post('/vehicle', vehicle.addVehicle );
router.post('/driver', vehicle.addDriver );
router.put('/vehicle', vehicle.updateVehicle);
router.put('/driver', vehicle.updateDriver)
router.get('/vehicle/id', vehicle.getVehicleJoinById);
router.get('/vehicle/all', vehicle.getVehicleJoin);

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
