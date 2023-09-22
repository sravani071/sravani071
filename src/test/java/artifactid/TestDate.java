package artifactid;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		//Date date = new Date();  
		//SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy_hh:mm:ss");   
		String strDate = new SimpleDateFormat("ddMMyyyy_hhmmss").format(new Date());
		System.out.println(strDate);  
		

	}

}
//Date date = new Date();  
//SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy_hh:mm:ss");   
//String strDate = formatter.format(date);
//System.out.println(strDate); 
