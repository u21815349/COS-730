using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using Newtonsoft.Json;
using Newtonsoft;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace courier_delivery_client
{
    
    public partial class Form1 : Form
    {
        APIClient Api = new APIClient();
        public Form1()
        {
            InitializeComponent();

        }

        private void sort_parcels_button_Click(object sender, EventArgs e)
        {
            DeliveryCandidates deliveryCandidates;
            Parcel[] parcels = new Parcel[SelectedParcelsDataGridView.Rows.Count];

            int j = -1;
            foreach (DataGridViewRow row in SelectedParcelsDataGridView.Rows)
            {
                j++;
   
                Parcel parcel = new Parcel(row.Cells["code"].Value.ToString(),
                    double.Parse(row.Cells["value"].Value.ToString()),
                    double.Parse(row.Cells["weight"].Value.ToString()));

                parcels[j] = parcel;
            }

            deliveryCandidates = new DeliveryCandidates(400, double.Parse(quota_textbox.Text), j);
            for (int i = 0; i < j; i++) {
                deliveryCandidates.parcels[i] = parcels[i];
            }
         

            string JSONresult = JsonConvert.SerializeObject(deliveryCandidates);
            string sortedParcelsJaon = Api.SortParcels(JSONresult);

            /*Write Sorted parcels to sorted parcels gridview*/
            SortedParcels sortedParcels = JsonConvert.DeserializeObject<SortedParcels>(sortedParcelsJaon);
            TotalValue.Text =  sortedParcels.value.ToString();
            TotalWeightLabel.Text = sortedParcels.value.ToString();

            
            sortedParcelsGridView.Rows.Clear();

                foreach (DataGridViewRow row in SelectedParcelsDataGridView.Rows)
            {
                if (sortedParcels.sortedParcels.Contains(row.Cells["code"].Value.ToString()))
                {
                    object[] rowData = new object[row.Cells.Count];
                    for (int i = 0; i < rowData.Length; ++i)
                    {
                        rowData[i] = row.Cells[i].Value;
                    }
                    this.sortedParcelsGridView.Rows.Add(rowData);
                }
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            parcels_dataGridView.DataSource = Api.GetAllParcels();
        }

        

        private void add_delivery_button_Click(object sender, EventArgs e)
        {
            
        }

        private void RightButton_Click(object sender, EventArgs e)
        {
            foreach (DataGridViewRow row in parcels_dataGridView.SelectedRows)
            {
                object[] rowData = new object[row.Cells.Count];
                for (int i = 0; i < rowData.Length; ++i)
                {
                    rowData[i] = row.Cells[i].Value;
                }
                this.SelectedParcelsDataGridView.Rows.Add(rowData);
            }
        }
    }
}
