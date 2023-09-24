package utilities;

import org.testng.annotations.DataProvider;

public class Dataset {
	@DataProvider(name = "ValidCredensial")
	public static Object dataset(){
		Object [][] objects = {{"test@orangetoolz.com","8Kh8nTe*^jdk"}
		};
		return objects;
	}


}
