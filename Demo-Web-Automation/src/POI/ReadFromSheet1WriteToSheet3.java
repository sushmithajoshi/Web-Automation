package POI;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromSheet1WriteToSheet3 {

	public static void main(String[] args) {
		readWriteExcelData();

	}
	
	static void readWriteExcelData()
	{
		FileInputStream fin=null;
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh1=null;
		Sheet sh3=null;
		Row rowSh1=null;
		Row rowSh3=null;
		Cell cellSh1=null;
		Cell cellSh3=null;
		try
		{
			fin=new FileInputStream("E:\\Class2\\Test6.xlsx");
			wb=new XSSFWorkbook(fin);
			sh1=wb.getSheet("Sheet1");
			sh3=wb.getSheet("Sheet3");
			if(sh3==null)
			{
				sh3=wb.createSheet("Sheet3");
			}
			rowSh3=sh3.createRow(4);
			int rc=sh1.getPhysicalNumberOfRows();
			for(int r=0;r<rc;r++)
			{
				rowSh1=sh1.getRow(r);
				cellSh1=rowSh1.getCell(0);
				cellSh3=rowSh3.getCell(r);
				if(cellSh3==null)
				{
					cellSh3=rowSh3.createCell(r);
				}
					String data=cellSh1.getStringCellValue();
					cellSh3.setCellValue(data);
			}		
			fout=new FileOutputStream("E:\\Class2\\Test6.xlsx");
			wb.write(fout);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				fout.close();
				wb.close();
				sh1=null;
				sh3=null;
				rowSh1=null;
				rowSh3=null;
				cellSh1=null;
				cellSh3=null;
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
