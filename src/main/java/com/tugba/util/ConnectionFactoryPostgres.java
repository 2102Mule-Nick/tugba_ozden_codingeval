package com.tugba.util;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	import org.apache.log4j.Logger;

	public final class ConnectionFactoryPostgres {

		Logger log = Logger.getRootLogger();

		public static String URL;

		public static String USERNAME;

		public static String PASSWORD;
		
		private static ConnectionFactoryPostgres connectionFactory = null;

		private ConnectionFactoryPostgres() {
			
			URL = "jdbc:postgresql://" + System.getenv("CHAT_DB_URL") + ":5432/" + "chatting"+"?";

			USERNAME = System.getenv("CHAT_DB_USERNAME");

			PASSWORD = System.getenv("CHAT_PASSWORD");
		}
		
		
		public Connection createConnection() {
			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e) {
				System.out.println("Failed to load Driver");
			}

			log.info("URL : " + URL);

			try {
				return DriverManager.getConnection(URL, USERNAME, PASSWORD);
			} catch (SQLException e) {
				log.error("Failed to connect to DB", e);
			}
			return null;
		}
		

		public static synchronized Connection getConnection() {
			
			if (connectionFactory == null) {
				connectionFactory = new ConnectionFactoryPostgres();
			}

			return connectionFactory.createConnection();

		}


}
