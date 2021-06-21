const deliveryMssql = require('./delivery.mssql');
const fs = require('fs');
const jarCaller = require('../AI/jar.caller')
var exec = require('child_process').exec;

/**The delivery object */
class Delivery {
    async getAllDeliveries(req, res){
        try{
            const output = await deliveryMssql.getAllDeliveries();
            res.send(output);
        }
        catch (err){
            console.log(err);
        }
    }

    async getDeliveryById(req, res){
        try {
            const output = await deliveryMssql.getDeliveryById(req);
            res.send(output);
        } catch (error) {
            console.log(error);
        }
    }

    async addDelivery(req, res){
        try {
            const output = await deliveryMssql.addDelivery(req.body);
            res.send(output);
        } catch (error) {
            console.log(error);
        }
    }

    async updateDelivery(req,res){
        try {
            const output = await deliveryMssql.updateDelivery(req.body);
            res.send(output);
        } catch (error) {
            console.log(error);
        }
    }

    /** */
    async addParcel(req, res){
        try {
            const output = await deliveryMssql.addParcel(req.body);
            res.send(output)
        } catch (error) {
            console.log(error);
        }
    }

    async updateParcel(req, res){
        try {
            const output = await deliveryMssql.updateParcel(req.body);
            res.send(output)
        } catch (error) {
            console.log(error);
        }
    }

    async sortParcels(req, res){

        //TODO Make sure num of parcels is an integer
        
        /**Read input parcels */
        const parcels = req.body;
        const json = JSON.stringify(parcels);
        /**Write parcels to the schedule_service.jar input file */
        fs.writeFile('D:/Args.json', json, (err) => {
            if (err)console.log(err);
            console.log('Json data saved');
        });
        
        //await jarCaller.sortParcels();

        
        exec('java -jar schedule_service.jar', function (error, stdout, stderr){
            console.log('Output -> ' + stdout);
              if(error !== null){
                console.log("Error -> "+error);
            }

            fs.readFile('D:/Args.json', 'utf-8', (err, data)=>{
                if (err) console.log(err);
                console.log(data)
                res.json(JSON.parse(data));
            });
        })
    
    }
}

module.exports = new Delivery();