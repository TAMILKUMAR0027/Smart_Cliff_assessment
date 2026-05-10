package com.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class data {

    @DataProvider(name = "LoginData", parallel = false)
    public Object[][] excelDataProvider() throws IOException {
        return getExcelData("D:\\TestNG\\TestNG_Assessment\\src\\test\\resources\\data.xlsx", "Sheet1");
    }

    @DataProvider(name = "RegisterData", parallel = false)
    public Object[][] excelDataProvider1() throws IOException {
        return getExcelData("D:\\TestNG\\TestNG_Assessment\\src\\test\\resources\\data.xlsx", "Sheet2");
    }
    @DataProvider(name = "Invalid_RegisterData", parallel = false)
    public Object[][] excelDataProvider2() throws IOException {
        return getExcelData("D:\\TestNG\\TestNG_Assessment\\src\\test\\resources\\data.xlsx", "Sheet3");
    }
    @DataProvider(name = "Invalid_LoginData", parallel = false)
    public Object[][] excelDataProvider3() throws IOException {
        return getExcelData("D:\\TestNG\\TestNG_Assessment\\src\\test\\resources\\data.xlsx", "Sheet4");
    }

    public String[][] getExcelData(String filename, String sheetName) throws IOException {

        FileInputStream fs = new FileInputStream(filename);
        XSSFWorkbook workbook = new XSSFWorkbook(fs);
        XSSFSheet sheet = workbook.getSheet(sheetName);
        int noOfRows = sheet.getPhysicalNumberOfRows();
        int noOfCols = sheet.getRow(0).getLastCellNum();
        String[][] data = new String[noOfRows - 1][noOfCols];
        DataFormatter formatter = new DataFormatter();
        for (int i = 1; i < noOfRows; i++) {
            XSSFRow row = sheet.getRow(i);
            for (int j = 0; j < noOfCols; j++) {
                Cell cell = row.getCell(j);
                data[i - 1][j] = formatter.formatCellValue(cell);
            }
        }
        return data;
    }
}