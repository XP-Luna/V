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

    public static String encode(String klarText, String schluessel){
        if (schluessel == ""){ return "Kein Schlüssel gegeben"; }
        klarText = klarText.toUpperCase();
        schluessel = schluessel.toUpperCase();
        String geheimText="";
        char klarZeichen,geheimZeichen;
        int klarCode,geheimCode;
        int startCode;
        int verschiebung = 0;
        
        for(int index=0;index<klarText.length();index++){
            
            verschiebung = (int) schluessel.charAt(index%schluessel.length()) - 65;

            int ascii = (int)klarText.charAt(index);
            
            geheimZeichen = (char)ascii;
            if (ascii >= 65 && ascii <= 90){
                
                geheimCode = ascii + verschiebung;
            
                if ( geheimCode > 90){
                    geheimCode -= 26;
                }
            
                geheimZeichen = (char)geheimCode;
            }
            geheimText += geheimZeichen;
        }
        return geheimText;
    }
    
    public static String decode(String klarText, String schluessel){
        if (schluessel == ""){ return "Kein Schlüssel gegeben"; }
        klarText = klarText.toUpperCase();
        String geheimText="";
        schluessel = schluessel.toUpperCase();
        char klarZeichen,geheimZeichen;
        int klarCode,geheimCode;
        int startCode;
        int verschiebung = 0;
        
        for(int index=0;index<klarText.length();index++){
            
            verschiebung = (int) schluessel.charAt(index%schluessel.length()) - 65;

            int ascii = (int)klarText.charAt(index);
            
            geheimZeichen = (char)ascii;
            if (ascii >= 65 && ascii <= 90){
                
                geheimCode = ascii - verschiebung;
            
                if ( geheimCode < 65){
                    geheimCode += 26;
                }
            
                geheimZeichen = (char)geheimCode;
            }
            geheimText += geheimZeichen;
        }
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

