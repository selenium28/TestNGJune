package para;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
//Data Provider returns a 2-dimensional Object Array.
	
  @Test(dataProvider = "dataProvider")
  public void loginTest(String str1, String str2) {
	  System.out.println(" str1: "+ " " +str1+ " str2: " +str2);
  }

  @DataProvider
  public Object[][] dataProvider() {
	  Object[][] data = new Object[3][2];
   
	  data[0][0] = "Admin";
	  data[0][1] = "admin123";
	  
	  data[1][0] = 123;
	  data[1][1] = "Admin654";
	  
	  data[2][0] = 33.22;
	  data[2][1] = 'G';
	  
	  return data;
    }
  }
