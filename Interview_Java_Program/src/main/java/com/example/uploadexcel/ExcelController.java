package com.example.uploadexcel;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class ExcelController {

	
	@RequestMapping(path="uploadExcel", method = RequestMethod.POST)
	public String test1(@RequestParam MultipartFile file) throws Exception{
	
		FileOutputStream fout = new FileOutputStream(file.getOriginalFilename());
		fout.write(file.getBytes());

		XSSFWorkbook workbook = new XSSFWorkbook(file.getOriginalFilename());
	    XSSFSheet worksheet = workbook.getSheetAt(0);
	    XSSFRow row;
	    for(int i = 0; i < worksheet.getPhysicalNumberOfRows(); i++) {	   
	    	row = worksheet.getRow(i);
	    	System.out.println(row.getCell(0).getNumericCellValue());
	    	System.out.println(row.getCell(1).getStringCellValue());
	    	System.out.println(row.getCell(2).getNumericCellValue());
	    }
		return "success";
	}
}
