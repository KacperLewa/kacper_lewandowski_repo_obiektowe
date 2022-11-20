import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SaveRead extends UserDate{
    File f = new File("C:/Users/kacpe/Desktop/PROGRAMOWANIE/obiektowe/CRUD/tajne_dane.csv");
    public void zapisz(){
        try {
            FileWriter fw = new FileWriter(f, true);
            for(int i=0; i<getList().size(); i++){
                fw.write(getList().get(i)+"\n");
            }
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void odczyt(){
        try{
            Scanner sc = new Scanner(f);
            String data = "";
            while(sc.hasNext()){
                data += sc.nextLine()+System.lineSeparator();  
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MyStartClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}