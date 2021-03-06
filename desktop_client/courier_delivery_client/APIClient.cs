using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Data;
using System.IO;
using System.Linq;
using System.Net;
using System.Text.Json;
using System.Text.Json.Serialization;
using System.Threading.Tasks;


namespace courier_delivery_client
{
    public class APIClient
    {
        public APIClient() { }

        public DataTable GetAllParcels(){
            DataTable datatable;

            var url = "http://localhost:3001/api/parcel/service/getAllParcels";
            var httpRequest = (HttpWebRequest)WebRequest.Create(url);

            var httpResponse = (HttpWebResponse)httpRequest.GetResponse();
            using (var streamReader = new StreamReader(httpResponse.GetResponseStream()))
            {
                var result = streamReader.ReadToEnd();
                datatable = (DataTable)JsonConvert.DeserializeObject(result,
                    (typeof(DataTable)));
            }

            return datatable;
        }


        public DataTable GetAllVehicles()
        {
            DataTable datatable;
            var url = "http://localhost:3002/api/vehicle/service/getAllVehicles";

            var httpRequest = (HttpWebRequest)WebRequest.Create(url);

            var httpResponse = (HttpWebResponse)httpRequest.GetResponse();
            using (var streamReader = new StreamReader(httpResponse.GetResponseStream()))
            {
                var result = streamReader.ReadToEnd();
                datatable = (DataTable)JsonConvert.DeserializeObject(result,
                    (typeof(DataTable)));
            }

            return datatable;
        }

        public String SortParcels(String ParcelsJson)
        {

            String result;
            var url = "http://localhost:3000/api/delivery/Service/sortParcels";

            var httpRequest = (HttpWebRequest)WebRequest.Create(url);
            httpRequest.Method = "POST";
            httpRequest.ContentType = "application/json";

            var data = ParcelsJson;

            using (var streamWriter = new StreamWriter(httpRequest.GetRequestStream()))
            {
                streamWriter.Write(data);
            }

            var httpResponse = (HttpWebResponse)httpRequest.GetResponse();
            using (var streamReader = new StreamReader(httpResponse.GetResponseStream()))
            {
                result = streamReader.ReadToEnd();
                
            }

            return result;
        }

        public string AddDelivery(String deliveryJson)
        {
            var url = "http://localhost:3000/api/delivery/service/addDelivery";

            var httpRequest = (HttpWebRequest)WebRequest.Create(url);
            httpRequest.Method = "POST";

            httpRequest.ContentType = "application/json";

            var data = deliveryJson;

            using (var streamWriter = new StreamWriter(httpRequest.GetRequestStream()))
            {
                streamWriter.Write(data);
            }

            var httpResponse = (HttpWebResponse)httpRequest.GetResponse();
            using (var streamReader = new StreamReader(httpResponse.GetResponseStream()))
            {
                var result = streamReader.ReadToEnd();
            }

            Console.WriteLine(httpResponse.StatusCode);
            return httpResponse.StatusCode.ToString();
            

        }

        public String AddDeliveryPnR(String pnrJson)
        {
            var url = "http://localhost:3000/api/delivery/service/addParcels";

            var httpRequest = (HttpWebRequest)WebRequest.Create(url);
            httpRequest.Method = "POST";

            httpRequest.ContentType = "application/json";

            var data = pnrJson;

            using (var streamWriter = new StreamWriter(httpRequest.GetRequestStream()))
            {
                streamWriter.Write(data);
            }

            var httpResponse = (HttpWebResponse)httpRequest.GetResponse();
            using (var streamReader = new StreamReader(httpResponse.GetResponseStream()))
            {
                var result = streamReader.ReadToEnd();
            }

            Console.WriteLine(httpResponse.StatusCode);
            return httpResponse.StatusCode.ToString();
        }

    }
}
