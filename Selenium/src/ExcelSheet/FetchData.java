package ExcelSheet;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		String path="C:\\Users\\Administrator.DESKTOP-N7MD7B5\\Desktop\\SeleniumFetchData.xlsx";
		FileInputStream File=new FileInputStream(path);
//		String str=WorkbookFactory.create(File).getSheet("Velocity").getRow(1).getCell(1).getStringCellValue();
//		System.out.println(str);

		//Method Chaining
//		Workbook wb=WorkbookFactory.create(File);
//		Sheet Sh=wb.getSheet("Velocity");
//		Row rw=Sh.getRow(2);
//		Cell cl=rw.getCell(0);
//		String st=cl.getStringCellValue();
//		//double num=cl.getNumericCellValue();
//		System.out.println(st);
//		int r=Sh.getLastRowNum();
//		System.out.println(r);
//		int c=rw.getLastCellNum();
//		System.out.println(c);
		
		Sheet sheet=WorkbookFactory.create(File).getSheet("Velocity");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				String value=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(" "+value+" ");
				
//				Row rw=sheet.getRow(i);
//				Cell cl=rw.getCell(j);
//				String st=cl.getStringCellValue();
//				System.out.println(" "+st+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
