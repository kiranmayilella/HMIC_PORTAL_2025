package myPack
import java.text.SimpleDateFormat

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.kms.katalon.core.annotation.Keyword

import internal.GlobalVariable


public class WriteExcel {

	public static String TestData_Path = ""

	public static final String TestData_FolderPath = "\\\\resources\\TESTING\\Katalon\\PortalOutput\\"

	private static String WorkBookName = "";

	@Keyword
	public void savePortalData(String currentDateAndTime, String tcName, String state, String lob, String accountNumber, String submissionNumber, String policyNumber, String ExecutionStatus, String pcURL, String portalURL) throws IOException{

		if(lob.equals("PersonalUmbrella")) {
			WorkBookName = "ULP_Output.xlsx"
			println (WorkBookName)
		} else if(lob.equals("Workers Compensation") || lob.equals("Workers") || lob.equals("Workers\' Compensation")) {
			WorkBookName = "WC_Output.xlsx"
			println (WorkBookName)
		}
		String testDataFileName = WorkBookName
		TestData_Path = TestData_FolderPath+testDataFileName
		println (TestData_Path)

		FileInputStream fis = new FileInputStream(TestData_Path);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		Row row = sheet.createRow(rowCount+1);

		//set date in the cell
		Date d = new Date();
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss")
		currentDateAndTime = format.format(d)

		Cell cell = row.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(currentDateAndTime);

		//set tcName in the cell
		cell = row.createCell(1);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(tcName);

		//set state in the cell
		cell = row.createCell(2);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(state);

		//set LOB in the cell
		cell = row.createCell(3);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(lob);

		//set accountNumber in the cell
		cell = row.createCell(4);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(accountNumber);

		//set submissionNumber in the cell
		cell = row.createCell(5);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(submissionNumber);

		//set policyNumber in the cell
		cell = row.createCell(6);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(policyNumber);

		//set ExecutionStatus in the cell
		cell = row.createCell(7);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(ExecutionStatus);

		//set PC URL in the cell
		cell = row.createCell(8);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(pcURL);

		//set PORTAL URL in the cell
		cell = row.createCell(9);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(portalURL)

		FileOutputStream fos = new FileOutputStream(TestData_Path);
		workbook.write(fos);
		fos.close();
	}
}