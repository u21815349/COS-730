const mssqlcon = require ('../dbconnection');

/**The parcel database query */
class ParcelMSSql{
    async addParcel(parcel){
        const conn = await mssqlcon.getConnection();
        const res = await conn.request()
        .input("parcel_code", parcel.parcel_code)
        .input("parcel_description", parcel.parcel_description)
        .input("street_no", parcel.street_no)
        .input("street", parcel.street)
        .input("surburb", parcel.surburb)
        .input("city", parcel.city)
        .input("post_code", parcel.post_code) 
        .execute("addParcel");
        return res;
    }

    async updateParcel(parcel){
        const conn = await mssqlcon.getConnection();
        const res = await conn.request()
        .input("parcel_id", parcel.parcel_id)
        .input("parcel_code", parcel.parcel_code)
        .input("parcel_description", parcel.parcel_description)
        .input("destination_address", parcel.destination_address)
        .input("delivery_id", parcel.delivery_id)
        .input("street_no", parcel.street_no)
        .input("surburb", parcel.surburb)
        .input("city", parcel.city)
        .input("post_code", parcel.post_code)
        .execute("updateParcel");
        return res;
    }
}

module.exports = new ParcelMSSql();