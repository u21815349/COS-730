const express = require('express');
const delivery = require('./modules/delivery/delivery')
const parcel = require('./modules/parcel/parcel')
const router = express.Router();


//router.post('/parcel', parcel.addParcel);
//router.put('/parcel', parcel.updateParcel);
//router.get('/delivery', delivery.getAllDeliveries);
//router.post('/delivery', delivery.addDelivery);
//router.put('/delivery', delivery.updateDelivery);

/**Delivery */
router.get('/getAllDeliveries', delivery.getAllDeliveries);
router.post('/addDelivery', delivery.addDelivery);
router.post('/sortParcels', delivery.sortParcels);

module.exports = router;