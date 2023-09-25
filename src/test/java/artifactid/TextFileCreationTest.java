package artifactid;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;



public class TextFileCreationTest {
	
    @Test
	public void FileCreation() throws IOException{
	    //try {
	     //String ts = new Date().toString();
    	String input = System.getProperty("parm");
		String ts = new SimpleDateFormat("ddMMyyyy_hhmmss").format(new Date());  
	      File myObj = new File("src/test/resources/FileCreation/"+ts+".txt");
	      if (myObj.createNewFile()) {
	        System.out.println("File created: " + myObj.getName());
	        FileWriter fWriter = new FileWriter("src/test/resources/FileCreation/"+myObj.getName());
	            fWriter.write(input);
	            fWriter.close();
	      } else {
	        System.out.println("File already exists.");
	      }
	    
	  }
    
}