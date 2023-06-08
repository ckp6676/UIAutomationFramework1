package Utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class excelReader {
    static Sheet sheet;

    static {
        try (FileInputStream fis = new FileInputStream("xlFiles/ActiTimeTestData.xlsx")) {
            Workbook wb = WorkbookFactory.create(fis);
            sheet = wb.getSheet("Sheet1");
            System.out.println(wb);
            System.out.println(sheet.getSheetName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @DataProvider(name = "login_tests")
    public static Object[][] testdata(Method m) {
        ArrayList<String[]> outerArray = new ArrayList<>();

        for (int rowIndex = 1; rowIndex < sheet.getPhysicalNumberOfRows(); rowIndex++) {
            Row eachRow = sheet.getRow(rowIndex);

            String testCaseName = eachRow.getCell(1).getStringCellValue();


            ArrayList<String> innerArray = new ArrayList<>();
            if (testCaseName.equalsIgnoreCase(m.getName())) {
                for (int dataCellIndex = 2; dataCellIndex < eachRow.getPhysicalNumberOfCells(); dataCellIndex++) {
                    innerArray.add(eachRow.getCell(dataCellIndex).getStringCellValue());
                }
                outerArray.add(innerArray.toArray(new String[0]));
            }
        }
        return outerArray.toArray(new String[0][0]);
    }
}