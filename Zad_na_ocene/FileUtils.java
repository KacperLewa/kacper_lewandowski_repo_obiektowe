import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class FileUtils{
    File f = new File("C:/Users/kacpe/Desktop/PROGRAMOWANIE/obiektowe/Zad_na_ocene/hit.csv");
    private int s;
    public void zapisz(String a, String b){
        try {
            FileWriter fw = new FileWriter(f, true);
            fw.write(a+" "+b+"\n");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(MyStartClass.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }

    public void odczyt(String a, String b){
        try{
            Scanner sc = new Scanner(f);
            String data = "";
            while(sc.hasNext()){
                data += sc.nextLine()+System.lineSeparator();  
            }
            if(data.contains(b)){
                
                s=1;
            } else {
                s=0;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MyStartClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int getData(){
        return s;
    }

    public void setData(int d){
        this.s=d;
    }

    public void czysc(){
        try {
            FileWriter fw = new FileWriter(f, false);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(MyStartClass.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}