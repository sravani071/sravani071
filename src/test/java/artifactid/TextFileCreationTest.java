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
    	File input = new File(System.getProperty("parm"));
		String ts = new SimpleDateFormat("ddMMyyyy_hhmmss").format(new Date());  
	      //File myObj = new File("src/test/resources/FileCreation/"+ts+".txt");
	      //if (myObj.createNewFile()) {
	        //System.out.println("File created: " + myObj.getName());
		System.out.println(input.getAbsoluteFile());
	        FileWriter fWriter = new FileWriter(input.getAbsoluteFile());
	            fWriter.append("Test file creation");
	            fWriter.close();
	     // } else {
	        //System.out.println("File already exists.");
	      //}
	    
	  }
    
}