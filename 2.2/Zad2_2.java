import java.util.Scanner;
public class Zad2_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Pola p = new Pola(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println(p.poleKwadratu());
    }
}