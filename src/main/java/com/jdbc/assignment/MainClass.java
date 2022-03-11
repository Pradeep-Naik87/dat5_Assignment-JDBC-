package com.jdbc.assignment;

public class MainClass {

	public static void main(String[] args) {
		JdbcExample j = new JdbcExample();

		// Inserting one customer
		j.insertCustomer(003, "Kavya", "Sirsi", 3457, 45000);

		// Inserting 5 customer
		j.insertCustomer(004, "Shravya", "Ankola", 5679, 7800);

		j.insertCustomer(005, "Ramya", "Karwar", 4567, 34000);

		j.insertCustomer(006, "Shravya", "Kumta", 5679, 60800);

		j.insertCustomer(007, "Swati", "Joida", 8766, 50800);

		j.insertCustomer(010, "Raksha", "Bhatkal", 1267, 8000);

		// update the balance

		j.updateBalance(004, 65000);

		// Delete the Row
		j.delete(004);

		// List the Customer
		j.getCustomerDetails();

		// Get customer details with id
		j.getCustomerWithId(002);

	}

}
