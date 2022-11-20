import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStrea;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SaveRead extends UserDate{
    File f = new File("C:/Users/kacpe/Desktop/PROGRAMOWANIE/obiektowe/CRUD/tajne_dane.csv");
    public void zapisz(){
        try {
            FileOutputStream  fos = new FileOutputStream(f, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for(int i=0; i<getList().size(); i++){
                oos.writeObject(getList().get(i)+"\n");
                oos.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void odczyt(){
        try{
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<UserDate> ud = (List <UserDate>)ois.readObject();
            ois.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}