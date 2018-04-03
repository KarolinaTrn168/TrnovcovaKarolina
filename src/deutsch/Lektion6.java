package deutsch;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Lektion6 extends Lektionen {

	public static void lernen() throws IOException {
		
	       File file = new File("6. Präpositionen und Tiere.docx");
	        
	        //check if Desktop is supported by Platform or not
	        if(!Desktop.isDesktopSupported()){
	            System.out.println("Desktop is not supported");
	            return;
	        }
	        
	        Desktop desktop = Desktop.getDesktop();
	        if(file.exists()) desktop.open(file);
	        
	}       
}


// if (passwort.contains((...) && username.contains(...))  { ... }