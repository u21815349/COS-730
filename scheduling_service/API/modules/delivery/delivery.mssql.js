const mssqlcon = require ('../dbconnection');

/**The delivery database query */
class DeliveryMSSql{
    
    async getAllDeliveries(){
        const conn = await mssqlcon.getConnection();
        const res = await conn.request().execute("getAllDeliveries");
        return res.recordset;
    }

    async addDelivery(delivery){
        const conn = await mssqlcon.getConnection();
        const res = await conn.request()
        .input("vehicle", delivery.vehicle)
        .input("date", delivery.date)
        .execute("addDelivery");
        return res;
    }

    async updateDelivery(delivery){
        const conn = await mssqlcon.getConnection();
        const res = await conn.request()
        .input("delivery_id", delivery.delivery_id)
        .input("vehicle", delivery.vehicle)
        .input("date", delivery.date)
        .execute("updateDelivery");
        return res;
    }

    /** */
    async addParcel(delivery){
        const conn = await mssqlcon.getConnection();
        const res = await conn.request()
        .input("parcel_code", delivery.parcel_code)
        .input("parcel_description", delivery.parcel_description)
        .input("street_no", delivery.street_no)
        .input("street", delivery.street)
        .input("surburb", delivery.surburb)
        .input("city", delivery.city)
        .input("post_code", delivery.post_code) 
        .execute("addParcel");
        return res;
    }

    async updateParcel(delivery){
        const conn = await mssqlcon.getConnection();
        const res = await conn.request()
        .input("parcel_id", delivery.parcel_id)
        .input("parcel_code", delivery.parcel_code)
        .input("parcel_description", delivery.parcel_description)
        .input("destination_address", delivery.destination_address)
        .input("delivery_id", delivery.delivery_id)
        .input("street_no", delivery.street_no)
        .input("surburb", delivery.surburb)
        .input("city", delivery.city)
        .input("post_code", delivery.post_code)
        .execute("updateParcel");
        return res;
    }


}
module.exports = new DeliveryMSSql();