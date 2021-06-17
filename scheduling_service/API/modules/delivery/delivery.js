const deliveryMssql = require('./delivery.mssql');

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
}

module.exports = new Delivery();