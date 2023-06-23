package hybridframework;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ebayhybrid1 
{
	public static Object[] [] getexeldata(String fpath) throws IOException
	{
	Object[][] mydata=null;
	  
    XSSFWorkbook wb=new XSSFWorkbook("E:\\bhagya-work\\datadrivenframeworkexelsheet.xlsx");
    XSSFSheet ws=wb.getSheet("sheet1");
    int rows=ws.getPhysicalNumberOfRows();
    mydata =new Object[rows][2];
    
    for (int i=0;i<rows;i++)
    {
    mydata[i][0]=ws.getRow(i).getCell(0).getStringCellValue();
    mydata[i][1]=ws.getRow(i).getCell(1).getStringCellValue();
    
	
    }
 return mydata;
}
}