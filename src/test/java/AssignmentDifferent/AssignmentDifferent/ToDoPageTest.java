package AssignmentDifferent.AssignmentDifferent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToDoPageTest {

	WebDriver driver;
	ToDoPage todopage = new ToDoPage();

	@BeforeTest
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "C://Users/CHATHURI/eclipse-workspace/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://todomvc.com/examples/react/#/");

	}

	@AfterTest
	public void terminate() {

		driver.close();
		driver.quit();
	}

	@Test(dataProvider = "dp", dataProviderClass = DP.class, priority = 0)
	public void TC02_AddItem(String d1) {
		
		todopage.addItem(driver, d1);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String status = todopage.confirmAddedItem(driver, d1);
		Assert.assertEquals("Pass", status);
	}
	
	@Test(priority = 1)
	public void TC04_CompleteItem() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		todopage.completeItem(driver);
		Boolean status = todopage.confirmCompletedItem(driver);
		Assert.assertTrue(status);
		
	}
	
	@Test(priority = 2)
	public void TC06_FilterCompletedItem() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		todopage.filterCompletedItem(driver);
		int nuOfItems = todopage.confirmFilterItemCount(driver);
		Assert.assertEquals(nuOfItems, 1);
		
	}
	
	@Test(priority = 3)
	public void TC07_FilterActiveItem() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		todopage.filterActiveItem(driver);
		int nuOfItems = todopage.confirmFilterItemCount(driver);
		Assert.assertEquals(nuOfItems, 4);
		
	}
	
	@Test(priority = 4)
	public void TC08_FilterAllItem() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		todopage.filterAllItem(driver);
		int nuOfItems = todopage.confirmFilterItemCount(driver);
		Assert.assertEquals(nuOfItems, 5);
		
	}
	
	@Test(priority = 5)
	public void TC03_DeleteItem() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		todopage.deleteItem(driver);
		String value = todopage.confirmDeletedItem(driver);
		Assert.assertEquals( value, "3 items left");
		
	}
	
	@Test(priority = 6)
	public void TC05_UndoCompletedItem() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		todopage.completeItem(driver);
		String value = todopage.confirmDeletedItem(driver);
		Assert.assertEquals( value, "4 items left");
		
	}

}
