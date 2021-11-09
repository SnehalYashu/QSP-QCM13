package DataDrivernTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetTheDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		String filePath="./Resources/prop.properties";
		FileInputStream file = new FileInputStream(filePath);
		Properties property = new Properties();
		property.load(file);
		String URL = property.getProperty("URL");
		String username = property.getProperty("username");
		String password = property.getProperty("password");
		System.out.println(URL);
		System.out.println(username);
		System.out.println(password);
		
		

	}

}
