const { getParcelById } = require('./parcel.mssql');
const parcelMssql = require('./parcel.mssql');

/**The parcel objetc */
class Parcel {
    async addParcel(req, res){
        try {
            const output = await parcelMssql.addParcel(req.body);
            res.send(output)
        } catch (error) {
            console.log(error);
        }
    }

    async getParcelById(req, res){
        try {
            const output = await parcelMssql.getParcelById(req);
            res.send(output)
        } catch (error) {
            console.log(error)
        }
    }

    async getParcelByCode(req, res){
        try {
            const output = await parcelMssql.getParcelByCode(req);
            res.send(output)
        } catch (error) {
            console.log(error)
        }
    }



    async getAllParcels(req, res){
        try {
            const output = await parcelMssql.getAllParcels();
            res.send(output);
        } catch (error) {
            console.log(error);
        }
    }
}

module.exports = new Parcel();