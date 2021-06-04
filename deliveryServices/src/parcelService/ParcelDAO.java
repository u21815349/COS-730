package parcelService;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import static java.lang.System.out;
/*
 * This class contains the query strings
 * */
public class ParcelDAO {
	
	public ParcelDAO() {
	}
	
	
	/**
     * Connect to the parcels_store.db database
     * @return the Connection object
     */
	private Connection connect() {
		String url = "jdbc:sqlite:parcels_store.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
	}
	
	/*
	 * Insert into parcel_sender table
	 * 
	 * @param sendorNo
	 * @param name 
	 * @param contact
	 * 
	 * @return 0 for successful
	 * */
	public int insertSender(String senderNo, String name, String contact) {
		String sql = "INSERT INTO parcel_sender(sender_id,sender_name,sender_contact) VALUES(?,?,?)";
		
		try (Connection conn = this.connect();
				PreparedStatement preparedStatement = conn.prepareStatement(sql)){
				preparedStatement.setString(1, senderNo);
				preparedStatement.setString(2, name);
				preparedStatement.setString(3, contact);
				preparedStatement.executeUpdate();
				return 0;
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			return 1;
		}
	}
	
	
	
	/*
	 * Insert into parcel_customer table
	 * 
	 * @param custNo
	 * @param name 
	 * @param surname
	 * @param contact
	 * @param address
	 * 
	 * @return 0 for successful
	 * */
	public int insertCustomer(String custNo, String name, String surname, String contact, String address) {
		String sql = "INSERT INTO parcel_customer(customer_id,cust_name,cust_surname,cust_contact,cust_address) VALUES(?,?,?,?,?)";
		
		try (Connection conn = this.connect();
				PreparedStatement preparedStatement = conn.prepareStatement(sql)){
				preparedStatement.setString(1, custNo);
				preparedStatement.setString(2, name);
				preparedStatement.setString(3, surname);
				preparedStatement.setString(4, contact);
				preparedStatement.setString(5, address);
				preparedStatement.executeUpdate();
				return 0;
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			return 1;
		}
	}
	
	
	
	
	/*
	 * Insert new parcel
	 * 
	 * @param name
	 * @param sender
	 * @param address
	 * @param receiver
	 * @param code
	 * @param arrivalDate
	 * @param scheduledDate
	 * @param deliveryDate
	 * @param deliveryDate
	 * @param value
	 * @param weight
	 * */
	
	public int insertParcel(String name, String sender, String address, String receiver, String code,
		Date arrivalDate, double value, double weight ) {
		String sql = "INSERT INTO parcel(parcel_name,parcel_sender,parcel_address,parcel_receiver,parcel_code,"
				+ "parcel_arrival_date,parcel_value,parcel_weight) "
				+ "VALUES(?,?,?,?,?,?,?,?)";
		
		try (Connection conn = this.connect();
				PreparedStatement preparedStatement = conn.prepareStatement(sql)){
				preparedStatement.setString(1, name);
				preparedStatement.setString(2, sender);
				preparedStatement.setString(3, address);
				preparedStatement.setString(4, receiver);
				preparedStatement.setString(5, code);
				preparedStatement.setDate(6, arrivalDate);
				preparedStatement.setDouble(7, value);
				preparedStatement.setDouble(8, weight);
				
				preparedStatement.executeUpdate();
				return 0;
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			return 1;
		}
	}
	
	
	/*
	 * Select a parcel by id
	 * 
	 * @param id
	 * @ret
	 * */
	public Object selectParcelByID(int id) {
		String sql = "SELECT * FROM parcel WHERE parcel_id = ?";
		
		try (Connection conn = this.connect();
				PreparedStatement statement = conn.prepareStatement(sql))	
		{
			
			statement.setInt(1, id);
			ResultSet result = statement.executeQuery();
			return result;
			
		} catch (SQLException e) {
			e.getMessage();
		}
		return 1;
	}
		
		
		
	/**
	 * Select all parcels
	 */
	public Object selectAllParcels() {

		String sql = "SELECT * FROM parcel";
		
		try (Connection conn = this.connect();
				Statement statement = conn.createStatement();	
				ResultSet result = statement.executeQuery(sql))
		{
			return result;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return 1;
	}
	
	
	
	
	/*
	 * Update parcel with given id
	 * */
	public void updateParcel(int id) {
		String sql = "UPDATE parcel "
				+ "SET parcel_scheduled_date = ?, "
				+ "parcel_delivery_date = ? "
				+ "WHERE parcel_id = ? ";
		try (Connection conn = this.connect();
				PreparedStatement statement = conn.prepareStatement(sql))
		{
			statement.setDate(1, new Date(System.currentTimeMillis()));
			statement.setDate(2, new Date(System.currentTimeMillis()));
			statement.setInt(3, id);
			statement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}












/*
 * Select a parcel by id
 * 
 * @param id
 * */

/**
public void selectParcelByID(int id) {
	String sql = "SELECT * FROM parcel WHERE parcel_id = ?";
	
	try (Connection conn = this.connect();
			PreparedStatement statement = conn.prepareStatement(sql))	
	{
		
		statement.setInt(1, id);
		ResultSet result = statement.executeQuery();
		
		
		while(result.next()) {
			out.println(result.getInt("parcel_id") + "\t" +
					result.getString("parcel_name") + "\t" +
					result.getString("parcel_sender") + "\t" +
					result.getString("parcel_address") + "\t" +
					result.getString("parcel_receiver") + "\t" +
					result.getString("parcel_code") + "\t" +
					result.getDate("parcel_arrival_date") + "\t" +
					result.getDate("parcel_scheduled_date") + "\t" +
					result.getDate("parcel_delivery_date") + "\t" +
					result.getDouble("parcel_value") + "\t" +
					result.getDouble("parcel_weight")
					);
			
			ArrayList<Object> tableRow = new ArrayList<>();
			tableRow.add(result.getInt("parcel_id"));
			tableRow.add(result.getString("parcel_name"));
			tableRow.add(result.getString("parcel_sender"));
			tableRow.add(result.getString("parcel_address"));
			tableRow.add(result.getString("parcel_receiver"));
			tableRow.add(result.getString("parcel_code"));
			tableRow.add(result.getDate("parcel_arrival_date"));
			tableRow.add(result.getDate("parcel_scheduled_date"));
			tableRow.add(result.getDate("parcel_delivery_date"));
			tableRow.add(result.getDouble("parcel_value"));
			tableRow.add(result.getDouble("parcel_weight"));
			
		}
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
}*/



/**
 public void selectAllParcels() {

		String sql = "SELECT * FROM parcel";
		
		try (Connection conn = this.connect();
				Statement statement = conn.createStatement();	
				ResultSet result = statement.executeQuery(sql))
		{
			
			while(result.next()) {
				out.println(result.getInt("parcel_id") + "\t" +
						result.getString("parcel_name") + "\t" +
						result.getString("parcel_sender") + "\t" +
						result.getString("parcel_address") + "\t" +
						result.getString("parcel_receiver") + "\t" +
						result.getString("parcel_code") + "\t" +
						result.getDate("parcel_arrival_date") + "\t" +
						result.getDate("parcel_scheduled_date") + "\t" +
						result.getDate("parcel_delivery_date") + "\t" +
						result.getDouble("parcel_value") + "\t" +
						result.getDouble("parcel_weight")
						);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
 */




/**
	public void updateParcel(int id) {
		String sql = "UPDATE parcel "
				+ "SET parcel_scheduled_date = ?, "
				+ "parcel_delivery_date = ? "
				+ "WHERE parcel_id = ? ";
		try (Connection conn = this.connect();
				PreparedStatement statement = conn.prepareStatement(sql))
		{
			statement.setDate(1, new Date(System.currentTimeMillis()));
			statement.setDate(2, new Date(System.currentTimeMillis()));
			statement.setInt(3, id);
			statement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
 
 */
