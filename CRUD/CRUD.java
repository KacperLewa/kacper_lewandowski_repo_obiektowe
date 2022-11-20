import java.util.ArrayList;
import java.time.LocalDate;
import java.io.File;
import java.util.Scanner;
public class CRUD{
    public static void main(String[] args) {
        File f = new File("C:/Users/kacpe/Desktop/PROGRAMOWANIE/obiektowe/CRUD/tajne_dane.csv");
        Scanner sc = new Scanner(System.in);
        Menu_CRUD m = new Menu_CRUD();
        DUM dum = new DUM();
        UserDate ud = new UserDate();
        ShowDane sd = new ShowDane();
        SaveRead sr = new SaveRead();
        dum.addToList();
        dum.delFromList();
    }
}