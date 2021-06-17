const mssql = require('mssql');
class DBConnection {
    async getConnection(){
        try {
            return await mssql.connect({
                user: 'loginoyama',
                password: 'Oyama345',
                server: 'localhost',
                database: 'deliveries',
                options: {
                    encrypt: false,
                    trustServerCerficate: true
                },
                port: 1433,
            })
        } catch (error) {
            console.log(error);
        }
    }
}

module.exports = new DBConnection();