package com.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String name) {

		// chrome.equals chrome
		if (name.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		}

		else if (name.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();

			driver = new EdgeDriver();
		}
		return driver;

	}

	public static void maxi() {
		driver.manage().window().maximize();
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static String title() {
		return driver.getTitle();
	}

	public static String text(WebElement tex) {

		return tex.getText();
	}

	public static void inputValue(WebElement ele, String value) {
		ele.sendKeys(value);

	}

	public static void clickOnElement(WebElement cl) {
		cl.click();
	}

//	public String dataRead(int row, int cellNumber) throws IOException {
//		File f = new File("C:\\Users\\balas\\eclipse-workspace\\Test\\Excel\\CarTest.xlsx");
//
//		FileInputStream fis = new FileInputStream(f);
//
//		Workbook wb = new XSSFWorkbook(fis);
//
//		Sheet sheetAt = wb.getSheetAt(0);
//
//		Row ro = sheetAt.getRow(row);
//
//		Cell cel = ro.getCell(cellNumber);
//
//		CellType cellTp = cel.getCellType();
//		String stringCellValue="";
//		if (cellTp.equals(CellType.STRING)) {
//			stringCellValue = cel.getStringCellValue();
//			System.out.println(stringCellValue);
//		} else if (cellTp.equals(CellType.NUMERIC)) {
//			double numericCellValue = cel.getNumericCellValue();
//
//			int value = (int) numericCellValue;
//			System.out.println(value);
//
//		}
//		return stringCellValue;

}
