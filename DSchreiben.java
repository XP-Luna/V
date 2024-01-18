import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DSchreiben{
  
  FileWriter writer;
  File file;
  
  public void schreiben(String t){
    // File anlegen
     file = new File("krypto.txt");
     try {

       // new FileWriter(file) -falls die Datei bereits existiert
       // wird der Text bei true angehängt, bei false wird die Datei ersetzt.
       writer = new FileWriter(file ,false);
       
       // Text wird in den Stream geschrieben
       writer.write(t);

       // Schreibt den Stream in die Datei
       // Sollte immer am Ende ausgeführt werden, sodass der Stream 
       // leer ist und alles in der Datei steht.
       writer.flush();
       
       // Schließt den Stream
       writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  
}