import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAdapter {

	public static void main(String[] args) {

				// 새로운 엑셀 워크 시트 생성
			XSSFWorkbook wb = new XSSFWorkbook();
		        Sheet sheet = wb.createSheet();
		        
		        // 해당 시트의 행별로 결과값 입력
		        for(int rownum = 0; rownum < 10; rownum++) 
		        {
		     	   Row r = sheet.createRow(rownum);     	   

		     	   // 열별로 나눔 구분자 '\t'
		     	   String[] str = "hello jong wha ba bo mung chung i".split("	");
		     	   for(int cellnum = 0; cellnum < str.length; cellnum++) 
		     	   {
		     		   Cell c = r.createCell(cellnum);
		     		   c.setCellValue(str[cellnum]);
		     	   }
		        }
		        
		        // 해당 워크시트를 저장함.
		        FileOutputStream stream = null;
				try {
					stream = new FileOutputStream("D://test.xlsx");
					wb.write(stream);
					stream.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}catch (IOException e) {
					e.printStackTrace();
				}
		
	}
}
