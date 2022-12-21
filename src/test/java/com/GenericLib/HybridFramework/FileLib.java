package com.GenericLib.HybridFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileLib 
{
	//To read property files
	public String getProperties(String fileName,String propertyName) throws IOException
	{
		Properties loadfile = new Properties();
		FileInputStream fis = new FileInputStream(fileName);
		loadfile.load(fis);
		String str = loadfile.getProperty(propertyName);
		return str;
	}
	
	//To read data from excel files
	public String read(String Location,String Value) throws Exception, IOException 
	{
		File f = new File(Location);
		
		XSSFWorkbook wb = new XSSFWorkbook(f);
		
		XSSFSheet sh = wb.getSheetAt(0);
		
		int LastRowNum = sh.getLastRowNum();
		String Key="";
		
		for(int j=1; j<=LastRowNum;j++)
		{
			Row r = sh.getRow(j);
			
			if(r.getCell(0).toString().equals(Value))
			{
				Key= r.getCell(1).toString();
				break;
			}
		}
		return Key;
	}
}
