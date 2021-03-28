package POI;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteContentToExcelFileDemo {
	public static void main(String[] args) {
		writeContentToExcelfile();

	}
	
	static void writeContentToExcelfile()
	{
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		FileOutputStream fout=null;
		try
		{
			wb=new XSSFWorkbook();
			sh=wb.getSheet("Information");
			if(sh==null)
			{
				sh=wb.createSheet("Information");
			}
			//First Row
			row=sh.getRow(0);
			if(row==null)
			{
				row=sh.createRow(0);
			}
			
			cell=row.createCell(0);
			cell.setCellValue("UserName");
			cell=row.createCell(1);
			cell.setCellValue("Password");
			
			//Second Row
			row=sh.getRow(1);
			if(row==null)
			{
				row=sh.createRow(1);
			}
			
			cell=row.createCell(0);
			cell.setCellValue("admin");
			cell=row.createCell(1);
			cell.setCellValue("manager");
			
			fout=new FileOutputStream("G:\\EXCEL\\Test-New.xlsx");
			wb.write(fout);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
