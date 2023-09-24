package utilities;

import org.testng.annotations.DataProvider;

public class Dataset {
	@DataProvider(name = "ValidCredensial")
	public static Object dataset(){
		Object [][] objects = {{"Tanmoy","123456"}
		};
		return objects;
	}


}
