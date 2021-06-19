using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace courier_delivery_client
{
    class DeliveryCandidates
    {
        public double capacity;
        public double quota;
        public int numOfParcels;
        public Parcel[] parcels;

        public DeliveryCandidates(double capacity, double quota, int numOfParcels)
        {
            this.capacity = capacity;
            this.quota = quota;
            this.numOfParcels = numOfParcels;
            this.parcels = new Parcel[numOfParcels];
        }
    }
}
