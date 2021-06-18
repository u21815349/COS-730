var exec = require('child_process').exec;

class ParcelSorter{
	sortParcels(){ 
		exec('java -jar schedule_service.jar', function (error, stdout, stderr){
		console.log('Output -> ' + stdout);
  		if(error !== null){
    		console.log("Error -> "+error);
		}
	})}
}

module.exports = new ParcelSorter;