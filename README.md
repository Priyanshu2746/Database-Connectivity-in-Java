# Database Connectivity in Java

This is a Java program that demonstrates how to connect to a MySQL database using the JDBC driver and execute a simple SQL statement to retrieve data from a table.

## Requirements

- Java Development Kit (JDK)
- MySQL database
- MySQL Connector/J JDBC driver

## Steps

1. Download and install the JDK, if not already installed.
2. Download and install MySQL database, if not already installed.
3. Download the latest version of MySQL Connector/J JDBC driver.
4. Add the JDBC driver to the classpath of your Java project.
5. Replace the values for `DB_URL`, `USER`, and `PASS` with your MySQL database URL, username, and password respectively.
6. Run the program.

## Program Explanation

The program uses the `com.mysql.jdbc.Driver` class to register the JDBC driver for MySQL. It then creates a connection to the database using the `DriverManager.getConnection()` method. A `Statement` object is then created from the connection object, which is used to execute the SQL statement to retrieve data from the `customers` table. The results are stored in a `ResultSet` object, which is then iterated over to extract the data using the `ResultSet.getInt()` and `ResultSet.getString()` methods. The program then closes all the resources including the connection, statement, and result set objects.

## Note

Make sure to replace the values of `DB_URL`, `USER`, and `PASS` with your actual MySQL database credentials before running the program.

## Contributing

Contributions are welcome! Please open an issue or submit a pull request for any improvements or bug fixes.

## License

This project is licensed under the MIT License.
```
