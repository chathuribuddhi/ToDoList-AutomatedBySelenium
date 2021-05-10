package AssignmentDifferent.AssignmentDifferent;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ToDoPage {

	String status;

	public void addItem(WebDriver driver, String item) {
		driver.findElement(By.xpath("//input[@class = \"new-todo\"]")).sendKeys(item);
		Actions builder = new Actions(driver);
		builder.sendKeys(Keys.RETURN).perform();
	}

	public String confirmAddedItem(WebDriver driver, String item) {

		List<WebElement> itemList = driver.findElements(By.xpath("//ul[@class = \"todo-list\"]/li/div/label"));
		for (WebElement todo : itemList) {
//			System.out.println(todo.getText());
			if (todo.getText().equalsIgnoreCase(item)) {
				status = "Pass";
				break;
			} else {
				status = "Fail";
			}
		}
		return status;

	}

	public void completeItem(WebDriver driver) {
		driver.findElement(By.xpath("/html/body/section/div/section/ul/li[1]/div/input")).click();
	}

	public boolean confirmCompletedItem(WebDriver driver) {

		Boolean checked = driver.findElement(By.xpath("/html/body/section/div/section/ul/li[1]/div/input"))
				.isSelected();

		return checked;

	}

	public void deleteItem(WebDriver driver) {
		Actions builder = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("/html/body/section/div/section/ul/li[2]/div/label"));
		builder.moveToElement(we).moveToElement(driver.findElement(By.xpath("/html/body/section/div/section/ul/li[2]/div/button"))).click().build().perform();
	}

	public String confirmDeletedItem(WebDriver driver) {

		String value = driver.findElement(By.xpath("/html/body/section/div/footer/span")).getText();

		return value;

	}
	
	public void filterCompletedItem(WebDriver driver) {
		driver.findElement(By.xpath("//ul[@class = \"filters\"]/li[3]/a")).click();
	}
	
	public void filterActiveItem(WebDriver driver) {
		driver.findElement(By.xpath("//ul[@class = \"filters\"]/li[2]/a")).click();
	}
	public void filterAllItem(WebDriver driver) {
		driver.findElement(By.xpath("//ul[@class = \"filters\"]/li[1]/a")).click();
	}

	public int confirmFilterItemCount(WebDriver driver) {

		List<WebElement> itemList = driver.findElements(By.xpath("//ul[@class = \"todo-list\"]/li/div/label"));
		int noOfItems = itemList.size();
		
		return noOfItems;

	}

}
