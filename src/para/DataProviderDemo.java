package para;

import org.testng.annotations.DataProvider;

public class DataProviderDemo {
 
  @DataProvider
  public Object[][] dataprovider() {
	  Object[][] data = new Object[3][2];

		data[0][0] = "Admin";
		data[0][1] = "admin123";

		data[1][0] = "Admin";
		data[1][1] = "123";

		data[2][0] = "Admin";
		data[2][1] = "admin123";

		return data;
  }
}

