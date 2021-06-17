
const vehicleMssql = require('./vehicle.mssql');

/**The vehicle object */
class Parcel {
    async addDriver(req, res){
        try {
            const output = await vehicleMssql.addDriver(req.body);
            res.send(output)
        } catch (error) {
            console.log(error);
        }
    }

    async addVehicle(req, res){
        try {
            const output = await vehicleMssql.addVehicle(req.body);
            res.send(output)
        } catch (error) {
            console.log(error);
        }
    }

    async getVehicleJoinById(req, res){
        try {
            const output = await vehicleMssql.getVehicleJoinById(req);
            res.send(output)
        } catch (error) {
            console.log(error)
        }
    }

    async getVehicleJoin(req, res){
        try {
            const output = await vehicleMssql.getVehicleJoin(req);
            res.send(output)
        } catch (error) {
            console.log(error)
        }
    }

    async updateDriver(req, res){
        try {
            const output = await vehicleMssql.updateDriver(req.body);
            res.send(output)
        } catch (error) {
            console.log(error);
        }
    }

    async updateVehicle(req, res){
        try {
            const output = await vehicleMssql.updateVehicle(req.body);
            res.send(output)
        } catch (error) {
            console.log(error);
        }
    }
    
}

module.exports = new Parcel();