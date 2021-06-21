using Microsoft.VisualStudio.TestTools.UnitTesting;
using courier_delivery_client;
using System;
using System.Collections.Generic;
using System.Linq;
using Newtonsoft.Json;
using System.Threading.Tasks;

namespace courier_delivery_client.Tests
{
    [TestClass()]
    public class APIClientTests
    {
        [TestMethod()]
        public void SortParcelsTest()
        {
            var data = @"{
                ""capacity"" : 3.0,
                ""quota"" : 10.0,
                ""numOfParcels"" : 3,
                ""parcels"" : [
                    {
                        ""name"" : ""A"",
                        ""weight"" : 1.1,
                        ""value"" : 5.0
                    },
                    {
                        ""name"" : ""B"",
                        ""weight"" : 2.1,
                        ""value"" : 10.0
                    },
                    {
                        ""name"" : ""C"",
                        ""weight"" : 3.1,
                        ""value"" : 15.0
                    }
                ]
            }";
            APIClient api = new APIClient();

            SortedParcels sortedParcels = JsonConvert.DeserializeObject<SortedParcels>(api.SortParcels(data));
            Assert.AreEqual("B", sortedParcels.sortedParcels.ElementAt(0));

        }

        [TestMethod()]
        public void AddDeliveryTest()
        {
            APIClient api = new APIClient();
            var data = @"{
                ""vehicle"": ""Van 23"",
                ""date"": ""2022-03-03T00:00:00.000Z""}";
            
            Console.WriteLine(api.AddDelivery(data));
            Assert.AreEqual("OK", api.AddDelivery(data));
        }

        [TestMethod()]
        public void AddDeliveryPnRTest()
        {
            APIClient api = new APIClient();
            var data = @"{
              ""parcel_code"" : ""AAAASSSS"",
              ""parcel_description"" : ""Thinkpad"",
              ""street_no"" : 23,
              ""street"" : ""Kirk Street"",
              ""surburb"" : ""Hammersdale"",
              ""city"" : ""Cape Town"",
              ""post_code"" : ""4473""
            }";

            Assert.AreEqual("OK", api.AddDeliveryPnR(data));
        }
    }
}