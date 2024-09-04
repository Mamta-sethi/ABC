package DDF;
//asdf

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exceldata_feching {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\Users\\Mamta\\eclipse-workspace\\Coreselenium1\\src\\test\\resources\\TestDataexcelbatch.xlsx");
Workbook wd=WorkbookFactory.create(fis);
      String data = wd.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
       System.out.println(data);
       
       double data1 = wd.getSheet("sheet1").getRow(0).getCell(1).getNumericCellValue();
       System.out.println(data1);


}
}
