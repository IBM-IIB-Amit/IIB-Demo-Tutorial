package com.esb.landmarkgroup;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConversion {

	/**
	 * Sample method that can be called from a Mapping Custom Java transform.
	 * The content of this method provides the implementation for the Custom Java transform.
	 * @throws ParseException 
	 */
	public static String sampleTransform(String expireDate) throws ParseException {
		String expire_date="";
		if(expireDate!=null && expireDate != ""){
			
			
			SimpleDateFormat formatter1=new SimpleDateFormat("yyyymmdd");  
			SimpleDateFormat formatter2=new SimpleDateFormat("yyyy-mm-dd"); 
			Date date1=formatter1.parse(expireDate); 
			
			 expire_date=formatter2.format(date1);
		}
		
		return expire_date;
	}

}
