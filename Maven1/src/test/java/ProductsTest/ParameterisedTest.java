package ProductsTest;

import org.testng.annotations.Test;

public class ParameterisedTest {

	@Test
	public void parameterisedTest()
	{
		String browser = System.getProperty("browser");
		System.out.println(browser);
	}
}
