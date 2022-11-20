import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class DUM extends SaveRead{

    public void addToList(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj imię:");
        String a = sc.nextLine();
        System.out.println("Podaj nazwisko:");
        String b = sc.nextLine();
        System.out.println("Podaj email:");
        String c = sc.nextLine();
        System.out.println("Podaj datę urodzenia:");
        //LocalDate bi = LocalDate.parse(sc.next());
        String bi = sc.nextLine();
        //System.out.println(ur);
        this.daj(new UserDate(a, b, c, bi));
        /*for(int i=0; i<getList().size(); i++){
            System.out.println(getList().get(i)+"\n");
        }*/
        zapisz();
    }

    public void delFromList(){
        odczyt();
    }
}