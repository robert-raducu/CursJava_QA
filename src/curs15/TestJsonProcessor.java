package curs15;

public class TestJsonProcessor {

	public static void main(String[] args) {
		
		JsonFileProcessor obj = new JsonFileProcessor();
		obj.writeJsonFile();
		obj.readJsonFile("email");

	}

}
