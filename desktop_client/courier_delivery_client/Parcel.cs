using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace courier_delivery_client
{
    class Parcel
    {
        public string name;
        public double weight;
        public double value;

        public Parcel(string name, double weight, double value)
        {
            this.name = name;
            this.weight = weight;
            this.value = value;
        }
    }
}
