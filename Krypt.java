import java.util.*;
import java.io.*;
public class Krypt{

    public static String caesar(String klarText){
        klarText = klarText.toLowerCase();
        String geheimText="";
        char klarZeichen,geheimZeichen;
        int klarCode,geheimCode;
        int startCode;
        int verschiebung = 13;
        int bw[] = new int[klarText.length()]; 
        int ver[] = new int[klarText.length()]; 
        int counter = klarText.length() -1;
        for (int index=0;index<klarText.length();index++){
            int ascii = (int)klarText.charAt(index);
            System.out.println("Text in Ascii umwandeln: " + ascii);
            geheimCode = ascii + verschiebung - 96;
            if (geheimCode > 26) {
                geheimCode = geheimCode%26;
            }
            System.out.println("Zahl in Buchstabenwerte umschreiben: " + geheimCode);
            String binarzahl = Integer.toBinaryString(geheimCode);
            geheimCode = Integer.parseInt(binarzahl);
            bw[index] = geheimCode;
            System.out.println("Zahl in Binär umwandeln: " + geheimCode);
            ver[counter] = geheimCode;
            counter--;
        }
        
        System.out.println("Vertauschtes Array: " + ver[0] + " " + ver[4]);
        for (int vor=klarText.length()-1;vor>=0;vor--){
            geheimText = geheimText + bw[vor] + " ";
        }
        return geheimText;
    }

    
    public static double[] hAnalyse(String text){
        text=text.toUpperCase();
        double h[]=new double[26];
        int counter = 0;
        for (int index = 0; index < text.length(); index++){
            int ascii = (char)text.charAt(index);
            if (ascii >= 65 && ascii <= 90){
                counter++;
                ascii -= 65;
                h[ascii]++;
            }
        } for (int i = 0; i < h.length; i++) {
            h[i] /= counter;
        }
        
        return h;
    }

    public static String encode(String klarText){
        klarText = klarText.toLowerCase();
        String geheimText="";
        char klarZeichen,geheimZeichen;
        int klarCode,geheimCode;
        int startCode;
        int verschiebung = 13;
        int bw[] = new int[klarText.length()]; 
        int ver[] = new int[klarText.length()]; 
        int counter = klarText.length() -1;
        for (int index=0;index<klarText.length();index++){
            int ascii = (int)klarText.charAt(index);
            System.out.println("Text in Ascii umwandeln: " + ascii);
            geheimCode = ascii + verschiebung - 96;
            if (geheimCode > 26) {
                geheimCode = geheimCode%26;
            }
            System.out.println("Zahl in Buchstabenwerte umschreiben: " + geheimCode);
            String binarzahl = Integer.toBinaryString(geheimCode);
            geheimCode = Integer.parseInt(binarzahl);
            bw[index] = geheimCode;
            System.out.println("Zahl in Binär umwandeln: " + geheimCode);
            ver[counter] = geheimCode;
            counter--;
        }
        
        System.out.println("Vertauschtes Array: " + ver[0] + " " + ver[4]);
        for (int vor=klarText.length()-1;vor>=0;vor--){
            geheimText = geheimText + bw[vor] + " ";
        }
        return geheimText;
    }
    
    
    public static String decode(String klarText){
        klarText = klarText.toLowerCase();
        String geheimText="";
        char klarZeichen,geheimZeichen;
        int klarCode,geheimCode;
        int startCode;
        int verschiebung = 13;
        char space = ' ';
        int count32 = 0;
        for (int i = 0; i < klarText.length(); i++) {
            if (klarText.charAt(i) == space) {
                count32++;
            }
        }
        //int bw[] = new int[klarText.length()]; 
        String ver[] = new String[count32 +1]; 
        int arrCount = count32;
        String binarZZ = "";
        //int counter = klarText.length() -1;
        for (int index=0;index<klarText.length();index++){
            int binarZ = (int)klarText.charAt(index);
            binarZ = binarZ - 48;
            if(klarText.charAt(index) == space){
                ver[arrCount] = binarZZ;
                arrCount--;
                binarZZ = "";
            }
            binarZZ = binarZZ + binarZ;
        }
        
        System.out.println("Vertauschtes Array: " + ver[0] + " " + ver[1] + " " + ver[2] + " " + ver[3] + " " + ver[4]);
        // for (int vor=klarText.length()-1;vor>=0;vor--){
            // geheimText = geheimText + ver[vor] + " ";
        // }
        geheimText = "t";
        return geheimText;
    }
    

    
    public static String zerlege(String klarText, String schluessel){
        klarText = klarText.toUpperCase();
        schluessel = schluessel.toUpperCase();
        int slaenge = schluessel.length();
        char klarZeichen,geheimZeichen;
        int klarCode,geheimCode;
        int startCode;
        int verschiebung = 0;
        
            for (int index=0; index<slaenge; index++){
                
            }
        return "";
    }
}

