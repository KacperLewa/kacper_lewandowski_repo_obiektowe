import java.util.Scanner;
public class Zad2_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Pola p = new Pola();
        Menu m = new Menu();
        System.out.println(p.poleKwadratu(sc.nextDouble()));
        m.showMenu();
        m.choseMenu(sc.nextInt());
    }
}