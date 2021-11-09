package Locators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fifa.com/fifa-world-ranking/men?dateId=id13407");
	    driver.manage().window().maximize();
		ArrayList<String> List = new ArrayList<>(); 
		List<WebElement> countryname = driver.findElements(By.xpath("//table[@class='fc-ranking-list-full_rankingTable__1u4hs']/tbody/tr[*]/td[3]"));
		for(WebElement names:countryname)
		{
			List.add(names.getText());
		}
		ArrayList<String> sortedList = new ArrayList<>();   
		for(String s:List){
		sortedList.add(s);
		}
		Collections.sort(sortedList);
		
		System.out.println(sortedList);
		driver.quit();
		
		
	}

}
