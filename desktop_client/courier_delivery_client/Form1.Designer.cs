
namespace courier_delivery_client
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.parcels_dataGridView = new System.Windows.Forms.DataGridView();
            this.vehiclesDataGridView = new System.Windows.Forms.DataGridView();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.RightButton = new System.Windows.Forms.Button();
            this.LeftButton = new System.Windows.Forms.Button();
            this.label2 = new System.Windows.Forms.Label();
            this.VehicleCapacityTextbox = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.quota_textbox = new System.Windows.Forms.TextBox();
            this.sort_parcels_button = new System.Windows.Forms.Button();
            this.groupBox3 = new System.Windows.Forms.GroupBox();
            this.SelectedParcelsDataGridView = new System.Windows.Forms.DataGridView();
            this.parcel_id = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.code = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.description = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.value = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.weight = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.groupBox2 = new System.Windows.Forms.GroupBox();
            this.AddVehicleButton = new System.Windows.Forms.Button();
            this.groupBox4 = new System.Windows.Forms.GroupBox();
            this.sortedParcelsGridView = new System.Windows.Forms.DataGridView();
            this._parcelId = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this._code = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this._description = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this._value = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this._weight = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.add_delivery_button = new System.Windows.Forms.Button();
            this.label3 = new System.Windows.Forms.Label();
            this.TotalWeightLabel = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.TotalValue = new System.Windows.Forms.Label();
            ((System.ComponentModel.ISupportInitialize)(this.parcels_dataGridView)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.vehiclesDataGridView)).BeginInit();
            this.groupBox1.SuspendLayout();
            this.groupBox3.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.SelectedParcelsDataGridView)).BeginInit();
            this.groupBox2.SuspendLayout();
            this.groupBox4.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.sortedParcelsGridView)).BeginInit();
            this.SuspendLayout();
            // 
            // parcels_dataGridView
            // 
            this.parcels_dataGridView.AllowUserToAddRows = false;
            this.parcels_dataGridView.AllowUserToDeleteRows = false;
            this.parcels_dataGridView.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.parcels_dataGridView.Location = new System.Drawing.Point(20, 36);
            this.parcels_dataGridView.Name = "parcels_dataGridView";
            this.parcels_dataGridView.RowHeadersWidth = 51;
            this.parcels_dataGridView.RowTemplate.Height = 24;
            this.parcels_dataGridView.Size = new System.Drawing.Size(580, 377);
            this.parcels_dataGridView.TabIndex = 0;
            // 
            // vehiclesDataGridView
            // 
            this.vehiclesDataGridView.AllowUserToAddRows = false;
            this.vehiclesDataGridView.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.vehiclesDataGridView.Location = new System.Drawing.Point(20, 36);
            this.vehiclesDataGridView.Name = "vehiclesDataGridView";
            this.vehiclesDataGridView.RowHeadersWidth = 51;
            this.vehiclesDataGridView.RowTemplate.Height = 24;
            this.vehiclesDataGridView.Size = new System.Drawing.Size(623, 302);
            this.vehiclesDataGridView.TabIndex = 1;
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.RightButton);
            this.groupBox1.Controls.Add(this.LeftButton);
            this.groupBox1.Controls.Add(this.label2);
            this.groupBox1.Controls.Add(this.VehicleCapacityTextbox);
            this.groupBox1.Controls.Add(this.label1);
            this.groupBox1.Controls.Add(this.quota_textbox);
            this.groupBox1.Controls.Add(this.sort_parcels_button);
            this.groupBox1.Controls.Add(this.groupBox3);
            this.groupBox1.Controls.Add(this.parcels_dataGridView);
            this.groupBox1.Location = new System.Drawing.Point(49, 38);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(1730, 448);
            this.groupBox1.TabIndex = 2;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "Parcels";
            // 
            // RightButton
            // 
            this.RightButton.Location = new System.Drawing.Point(668, 161);
            this.RightButton.Name = "RightButton";
            this.RightButton.Size = new System.Drawing.Size(41, 58);
            this.RightButton.TabIndex = 11;
            this.RightButton.Text = ">>";
            this.RightButton.UseVisualStyleBackColor = true;
            this.RightButton.Click += new System.EventHandler(this.RightButton_Click);
            // 
            // LeftButton
            // 
            this.LeftButton.Location = new System.Drawing.Point(622, 161);
            this.LeftButton.Name = "LeftButton";
            this.LeftButton.Size = new System.Drawing.Size(38, 58);
            this.LeftButton.TabIndex = 10;
            this.LeftButton.Text = "<<";
            this.LeftButton.UseVisualStyleBackColor = true;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(1489, 267);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(110, 17);
            this.label2.TabIndex = 9;
            this.label2.Text = "Vehicle capacity";
            // 
            // VehicleCapacityTextbox
            // 
            this.VehicleCapacityTextbox.Location = new System.Drawing.Point(1489, 290);
            this.VehicleCapacityTextbox.Name = "VehicleCapacityTextbox";
            this.VehicleCapacityTextbox.ReadOnly = true;
            this.VehicleCapacityTextbox.Size = new System.Drawing.Size(156, 22);
            this.VehicleCapacityTextbox.TabIndex = 8;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(1489, 156);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(156, 17);
            this.label1.TabIndex = 7;
            this.label1.Text = "Enter quota (Min value)";
            // 
            // quota_textbox
            // 
            this.quota_textbox.Location = new System.Drawing.Point(1489, 179);
            this.quota_textbox.Name = "quota_textbox";
            this.quota_textbox.Size = new System.Drawing.Size(156, 22);
            this.quota_textbox.TabIndex = 6;
            // 
            // sort_parcels_button
            // 
            this.sort_parcels_button.Location = new System.Drawing.Point(1492, 69);
            this.sort_parcels_button.Name = "sort_parcels_button";
            this.sort_parcels_button.Size = new System.Drawing.Size(129, 44);
            this.sort_parcels_button.TabIndex = 5;
            this.sort_parcels_button.Text = "Sort Parcels";
            this.sort_parcels_button.UseVisualStyleBackColor = true;
            this.sort_parcels_button.Click += new System.EventHandler(this.sort_parcels_button_Click);
            // 
            // groupBox3
            // 
            this.groupBox3.Controls.Add(this.SelectedParcelsDataGridView);
            this.groupBox3.Location = new System.Drawing.Point(715, 36);
            this.groupBox3.Name = "groupBox3";
            this.groupBox3.Size = new System.Drawing.Size(733, 377);
            this.groupBox3.TabIndex = 4;
            this.groupBox3.TabStop = false;
            this.groupBox3.Text = "Selected for sorting";
            // 
            // SelectedParcelsDataGridView
            // 
            this.SelectedParcelsDataGridView.AllowUserToAddRows = false;
            this.SelectedParcelsDataGridView.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.SelectedParcelsDataGridView.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.parcel_id,
            this.code,
            this.description,
            this.value,
            this.weight});
            this.SelectedParcelsDataGridView.Location = new System.Drawing.Point(43, 33);
            this.SelectedParcelsDataGridView.Name = "SelectedParcelsDataGridView";
            this.SelectedParcelsDataGridView.RowHeadersWidth = 51;
            this.SelectedParcelsDataGridView.RowTemplate.Height = 24;
            this.SelectedParcelsDataGridView.Size = new System.Drawing.Size(671, 310);
            this.SelectedParcelsDataGridView.TabIndex = 0;
            // 
            // parcel_id
            // 
            this.parcel_id.HeaderText = "Parcel ID";
            this.parcel_id.MinimumWidth = 6;
            this.parcel_id.Name = "parcel_id";
            this.parcel_id.Width = 125;
            // 
            // code
            // 
            this.code.HeaderText = "Code";
            this.code.MinimumWidth = 6;
            this.code.Name = "code";
            this.code.Width = 125;
            // 
            // description
            // 
            this.description.HeaderText = "Description";
            this.description.MinimumWidth = 6;
            this.description.Name = "description";
            this.description.Width = 125;
            // 
            // value
            // 
            this.value.HeaderText = "Value";
            this.value.MinimumWidth = 6;
            this.value.Name = "value";
            this.value.Width = 125;
            // 
            // weight
            // 
            this.weight.HeaderText = "Weight";
            this.weight.MinimumWidth = 6;
            this.weight.Name = "weight";
            this.weight.Width = 125;
            // 
            // groupBox2
            // 
            this.groupBox2.Controls.Add(this.AddVehicleButton);
            this.groupBox2.Controls.Add(this.vehiclesDataGridView);
            this.groupBox2.Location = new System.Drawing.Point(49, 549);
            this.groupBox2.Name = "groupBox2";
            this.groupBox2.Size = new System.Drawing.Size(670, 408);
            this.groupBox2.TabIndex = 3;
            this.groupBox2.TabStop = false;
            this.groupBox2.Text = "Vehicles";
            // 
            // AddVehicleButton
            // 
            this.AddVehicleButton.Location = new System.Drawing.Point(243, 344);
            this.AddVehicleButton.Name = "AddVehicleButton";
            this.AddVehicleButton.Size = new System.Drawing.Size(160, 43);
            this.AddVehicleButton.TabIndex = 2;
            this.AddVehicleButton.Text = "Add Vehicle";
            this.AddVehicleButton.UseVisualStyleBackColor = true;
            this.AddVehicleButton.Click += new System.EventHandler(this.AddVehicleButton_Click);
            // 
            // groupBox4
            // 
            this.groupBox4.Controls.Add(this.sortedParcelsGridView);
            this.groupBox4.Location = new System.Drawing.Point(764, 549);
            this.groupBox4.Name = "groupBox4";
            this.groupBox4.Size = new System.Drawing.Size(733, 408);
            this.groupBox4.TabIndex = 4;
            this.groupBox4.TabStop = false;
            this.groupBox4.Text = "Sorted parcels";
            // 
            // sortedParcelsGridView
            // 
            this.sortedParcelsGridView.AllowUserToAddRows = false;
            this.sortedParcelsGridView.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.sortedParcelsGridView.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this._parcelId,
            this._code,
            this._description,
            this._value,
            this._weight});
            this.sortedParcelsGridView.Location = new System.Drawing.Point(20, 47);
            this.sortedParcelsGridView.Name = "sortedParcelsGridView";
            this.sortedParcelsGridView.RowHeadersWidth = 51;
            this.sortedParcelsGridView.RowTemplate.Height = 24;
            this.sortedParcelsGridView.Size = new System.Drawing.Size(694, 302);
            this.sortedParcelsGridView.TabIndex = 0;
            // 
            // _parcelId
            // 
            this._parcelId.HeaderText = "Parcel ID";
            this._parcelId.MinimumWidth = 6;
            this._parcelId.Name = "_parcelId";
            this._parcelId.Width = 125;
            // 
            // _code
            // 
            this._code.HeaderText = "Code";
            this._code.MinimumWidth = 6;
            this._code.Name = "_code";
            this._code.Width = 125;
            // 
            // _description
            // 
            this._description.HeaderText = "Description";
            this._description.MinimumWidth = 6;
            this._description.Name = "_description";
            this._description.Width = 125;
            // 
            // _value
            // 
            this._value.HeaderText = "Value";
            this._value.MinimumWidth = 6;
            this._value.Name = "_value";
            this._value.Width = 125;
            // 
            // _weight
            // 
            this._weight.HeaderText = "Weight";
            this._weight.MinimumWidth = 6;
            this._weight.Name = "_weight";
            this._weight.Width = 125;
            // 
            // add_delivery_button
            // 
            this.add_delivery_button.Location = new System.Drawing.Point(1579, 748);
            this.add_delivery_button.Name = "add_delivery_button";
            this.add_delivery_button.Size = new System.Drawing.Size(129, 52);
            this.add_delivery_button.TabIndex = 5;
            this.add_delivery_button.Text = "Add delivery";
            this.add_delivery_button.UseVisualStyleBackColor = true;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 7.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(1538, 585);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(96, 17);
            this.label3.TabIndex = 6;
            this.label3.Text = "Total weight";
            // 
            // TotalWeightLabel
            // 
            this.TotalWeightLabel.AutoSize = true;
            this.TotalWeightLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 7.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.TotalWeightLabel.Location = new System.Drawing.Point(1650, 585);
            this.TotalWeightLabel.Name = "TotalWeightLabel";
            this.TotalWeightLabel.Size = new System.Drawing.Size(0, 17);
            this.TotalWeightLabel.TabIndex = 7;
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Font = new System.Drawing.Font("Microsoft Sans Serif", 7.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label6.Location = new System.Drawing.Point(1538, 632);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(110, 17);
            this.label6.TabIndex = 8;
            this.label6.Text = "Total value: R";
            // 
            // TotalValue
            // 
            this.TotalValue.AutoSize = true;
            this.TotalValue.Location = new System.Drawing.Point(1650, 632);
            this.TotalValue.Name = "TotalValue";
            this.TotalValue.Size = new System.Drawing.Size(0, 17);
            this.TotalValue.TabIndex = 9;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.AutoSize = true;
            this.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
            this.ClientSize = new System.Drawing.Size(1813, 1016);
            this.Controls.Add(this.TotalValue);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.TotalWeightLabel);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.add_delivery_button);
            this.Controls.Add(this.groupBox4);
            this.Controls.Add(this.groupBox2);
            this.Controls.Add(this.groupBox1);
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            ((System.ComponentModel.ISupportInitialize)(this.parcels_dataGridView)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.vehiclesDataGridView)).EndInit();
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            this.groupBox3.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.SelectedParcelsDataGridView)).EndInit();
            this.groupBox2.ResumeLayout(false);
            this.groupBox4.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.sortedParcelsGridView)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.DataGridView parcels_dataGridView;
        private System.Windows.Forms.DataGridView vehiclesDataGridView;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox VehicleCapacityTextbox;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox quota_textbox;
        private System.Windows.Forms.Button sort_parcels_button;
        private System.Windows.Forms.GroupBox groupBox3;
        private System.Windows.Forms.DataGridView SelectedParcelsDataGridView;
        private System.Windows.Forms.GroupBox groupBox2;
        private System.Windows.Forms.GroupBox groupBox4;
        private System.Windows.Forms.DataGridView sortedParcelsGridView;
        private System.Windows.Forms.Button add_delivery_button;
        private System.Windows.Forms.DataGridViewTextBoxColumn parcel_id;
        private System.Windows.Forms.DataGridViewTextBoxColumn code;
        private System.Windows.Forms.DataGridViewTextBoxColumn description;
        private System.Windows.Forms.DataGridViewTextBoxColumn value;
        private System.Windows.Forms.DataGridViewTextBoxColumn weight;
        private System.Windows.Forms.Button RightButton;
        private System.Windows.Forms.Button LeftButton;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label TotalWeightLabel;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label TotalValue;
        private System.Windows.Forms.DataGridViewTextBoxColumn _parcelId;
        private System.Windows.Forms.DataGridViewTextBoxColumn _code;
        private System.Windows.Forms.DataGridViewTextBoxColumn _description;
        private System.Windows.Forms.DataGridViewTextBoxColumn _value;
        private System.Windows.Forms.DataGridViewTextBoxColumn _weight;
        private System.Windows.Forms.Button AddVehicleButton;
    }
}

