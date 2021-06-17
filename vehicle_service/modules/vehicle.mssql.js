const mssqlcon = require ('./dbconnection');

/**The vehicle database query */
class ParcelMSSql{
    async addDriver(driver){
        const conn = await mssqlcon.getConnection();
        const res = await conn.request()
        .input("name", driver.name)
        .input("surname", driver.surname )
        .input('contact', driver.contact)
        .execute("addDriver");
        return res;
    }

    async addVehicle(vehicle){
        const conn = await mssqlcon.getConnection();
        const res = await conn.request()
        .input("name", vehicle.name)
        .input("weight_capacity", vehicle.weight_capacity )
        .execute("addVehicle");
        return res;
    }

    async getVehicleJoinById(req){
        const conn = await mssqlcon.getConnection();
        const res = await conn.request()
        .input("vehicle_id", req.query.id)
        .execute("getVehicleJoinById");
        return res;
    }

    async getVehicleJoin(){
        const conn = await mssqlcon.getConnection();
        const res = await conn.request().execute("getVehicleJoin");
        return res.recordset;
    }

    async updateDriver(driver){
        const conn = await mssqlcon.getConnection();
        const res = await conn.request()
        .input("driver_id", driver.driver_id)
        .input('name', driver.name)
        .input('surname', driver.surname)
        .input('contact', driver.contact)
        .input('availability', driver.availability)
        .input('vehicle_id', driver.vehicle_id)
        .execute("updateDriver");
        return res;
    }

    async updateVehicle(vehicle){
        const conn = await mssqlcon.getConnection();
        const res = await conn.request()
        .input("vehicle_id", vehicle.vehicle_id)
        .input('name', vehicle.name)
        .input('weight_capacity', vehicle.weight_capacity)
        .input('availability', vehicle.availability)
        .execute("updateVehicle");
        return res;
    }
}

module.exports = new ParcelMSSql();