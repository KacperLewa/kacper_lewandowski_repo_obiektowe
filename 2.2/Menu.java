import java.util.Scanner;
public class Menu{
    Scanner sc = new Scanner(System.in);
    Pola p = new Pola();

    public void showMenu(){
        System.out.println("Witam w menu kalkulatora figur! Wybierz figurę:");
        System.out.println("1.Kwadrat");
        System.out.println("2.Trójkąt dowolny");
        System.out.println("3.Trójkąt równoboczny");
        System.out.println("4.Wyjdź");
    }

    public void choseMenu(int a){
        if(a==1){
            double b = sc.nextDouble();
            p.poleKwadratu(b);
        }
    }
}