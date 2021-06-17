const express = require('express');
const delivery = require('./modules/delivery/delivery')
const parcel = require('./modules/parcel/parcel')
const router = express.Router();


router.post('/parcel', parcel.addParcel);
router.put('/parcel', parcel.updateParcel);
router.get('/delivery', delivery.getAllDeliveries);
router.post('/delivery', delivery.addDelivery);
router.put('/delivery', delivery.updateDelivery);

module.exports = router;