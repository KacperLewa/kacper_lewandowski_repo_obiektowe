import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; 
public class Historia{
    File f = new File("C:/Users/kacpe/Desktop/PROGRAMOWANIE/obiektowe/Kalkulator/historia.txt");
    private int s;
    public void zapisz(String a){
        a = a.replaceAll(" ", "");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); 
        LocalDateTime now = LocalDateTime.now();
        try {
            FileWriter fw = new FileWriter(f, true);
            fw.write(dtf.format(now)+";"+a+"\n");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(MyStartClass.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(MyStartClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
}