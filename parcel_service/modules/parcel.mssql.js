const mssqlcon = require ('./dbconnection');

/**The parcel database query */
class ParcelMSSql{
    async addParcel(parcel){
        const conn = await mssqlcon.getConnection();
        const res = await conn.request()
        .input("code", parcel.code)
        .input("description", parcel.description)
        .input("value", parcel.value)
        .input("weight", parcel.weight)
        .input("street_no", parcel.street_no)
        .input("street", parcel.street)
        .input("surburb", parcel.surburb)
        .input("city", parcel.city)
        .input("post_code", parcel.post_code)
        .input("receiver_name", parcel.receiver_name)
        .input("receiver_surname", parcel.receiver_surname)
        .input("receiver_contact", parcel.receiver_contact)
        .input("sender_name", parcel.sender_name) 
        .input("sender_contact", parcel.sender_contact)
        .execute("addParcel");
        return res;
    }

    async getParcelById(req){
        const conn = await mssqlcon.getConnection();
        const res = await conn.request()
        .input("parcel_id", req.query.id)
        .execute("getParcelById");
        return res;
    }

    async getParcelByCode(req){
        const conn = await mssqlcon.getConnection();
        const res = await conn.request()
        .input("code", req.query.code)
        .execute("getParcelByCode");
        return res;
    }

    async getAllParcels(){
        const conn = await mssqlcon.getConnection();
        const res = await conn.request().execute("getAllParcels");
        return res.recordset;
    }
}

module.exports = new ParcelMSSql();