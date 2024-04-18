package curs14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFileProcessor {
	
	public void writePropertiesFile() {
		
		try {
			OutputStream outputStream = new FileOutputStream("test.properties");
			Properties propFile = new Properties();
			propFile.setProperty("user", "testUser");
			propFile.setProperty("pass", "test123");
			propFile.setProperty("email", "test@test.com");
			
			propFile.store(outputStream, "am salvat fisierul");
			//outputStream.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void readPropertiesFile(String key) {
		try(InputStream inputStream = new FileInputStream("test.properties")){
			Properties propFile = new Properties();
			propFile.load(inputStream);
			
			System.out.println(propFile.getProperty(key));
			
		}catch(IOException e) {
			System.out.println("Cannot read properties file");
		}
	}
	
	
	
	public void updatePropertiesFile(String key, String value) {
		Properties propFile = new Properties();	
		try(InputStream input =  new FileInputStream("test.properties")){
			propFile.load(input);
		}catch(IOException e) {	
			e.printStackTrace();
		}
		
		try(OutputStream output = new FileOutputStream("test.properties")){
			propFile.setProperty(key, value);
			propFile.store(output, null);
		}catch(IOException e) {		
			e.printStackTrace();
		}
	}
	
	
	/*
	 * 	try(OutputStream output = new FileOutputStream("test.properties");
				InputStream input =  new FileInputStream("test.properties")){
			
			Properties propFile = new Properties();
			propFile.load(input);
			propFile.setProperty(key, value);
			propFile.store(output, null);
			
		}catch(IOException e) {
			
			e.printStackTrace();
		}
		
		*/
	
	public void deleteFromPropertiesFile(String key) {
		
		Properties propFile = new Properties();	
		try(InputStream input =  new FileInputStream("test.properties")){
			propFile.load(input);
		}catch(IOException e) {	
			e.printStackTrace();
		}
		
		try(OutputStream output = new FileOutputStream("test.properties")){
			propFile.remove(key);
			propFile.store(output, null);
		}catch(IOException e) {		
			e.printStackTrace();
		}
		
		
	}

}
