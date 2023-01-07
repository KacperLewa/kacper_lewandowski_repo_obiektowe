import java.util.Scanner;
public class Blackjack{
    public static void main(String[] args){
        InfoGracza ig = new InfoGracza();
        Instrukcja i = new Instrukcja();
        Zapis z = new Zapis();
        Scanner sc = new Scanner(System.in);
        i.info();
        while(true){
            System.out.println("\nWybierz co dalej");
            String x = sc.nextLine();
            x = x.toUpperCase();
            if(x.equals("KONIEC")){
                System.exit(0);
            } else if(x.equals("HISTORIA")){
                System.out.println(z.odczyt());
            } else if(x.equals("POMOC")){
                i.info();
            } else{
                ig.losuj();
                ig.dobierz();
                ig.setGraczPKT(ig.getPKT());
                ig.kartaGracza();
                while(ig.getGraczPKT()<21){
                    String a = sc.nextLine();
                    a = a.toUpperCase();
                    if(a.equals("HIT") && ig.getGraczPKT()<21){
                        ig.dobierz();
                        ig.setGraczPKT(ig.getGraczPKT()+ig.getPKT());
                        ig.kartaGracza();
                    } else{
                        break;
                    }
                }
                if(ig.getGraczPKT()>21){
                    System.out.println("Niestety przegrałeś :(");
                    z.zapisz("Niestety przegrałeś :(");
                    break;
                } else{
                    ig.graKrupiera();
                    if(ig.getGraczPKT()==ig.getKrupierPKT()){
                        System.out.println("Remis.");
                        z.zapisz("Remis.");
                    } else if(ig.wynik()==true){
                        System.out.println("Brawo! Udało ci się wygrać.");
                        z.zapisz("Brawo! Udało ci się wygrać.");
                    } else {
                        System.out.println("Niestety przegrałeś :(");
                        z.zapisz("Niestety przegrałeś :(");
                    }
                }
            }
        }
    }
}