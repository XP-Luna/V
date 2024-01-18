import java.io.File; 
import java.io.FileReader; 
import java.io.IOException; 
import java.io.BufferedReader;

public class DLesen{ 
    private  String dtext="";
    
    public  String ladeDatei(String datName) { 

            try {
		BufferedReader in = new BufferedReader(new FileReader(datName));
		String zeile = null;
		while ((zeile = in.readLine()) != null) {
			 dtext += zeile + "\r\n";
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
   return dtext;    

    } 
}