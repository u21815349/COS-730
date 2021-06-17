const parcelMssql = require('./parcel.mssql');
const deliveryMssql = require('./parcel.mssql');

/**The parcel object */
class Parcel {
    async addParcel(req, res){
        try {
            const output = await parcelMssql.addParcel(req.body);
            res.send(output)
        } catch (error) {
            console.log(error);
        }
    }

    async updateParcel(req, res){
        try {
            const output = await parcelMssql.updateParcel(req.body);
            res.send(output)
        } catch (error) {
            console.log(error);
        }
    }
}

module.exports = new Parcel();