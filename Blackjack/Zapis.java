import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; 
public class Zapis{
    File f = new File("C:/Users/kacpe/Desktop/PROGRAMOWANIE/obiektowe/Blackjack/HistoriaWynikow.txt");
    public void zapisz(String a){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); 
        LocalDateTime now = LocalDateTime.now();
        try {
            FileWriter fw = new FileWriter(f, true);
            fw.write(a+"; "+dtf.format(now)+";"+"\n");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Blackjack.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }

    public String odczyt(){
        String data = "";
        try{
            Scanner sc = new Scanner(f);
            while(sc.hasNext()){
                data += sc.nextLine()+System.lineSeparator();  
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Blackjack.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
}