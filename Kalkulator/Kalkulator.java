import java.util.ArrayList;
import java.util.Scanner;
public class Kalkulator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Pomoc p = new Pomoc();
        Historia h = new Historia();
        h.zapisz("Otworzono program");
        p.pomocy();
        ArrayList<Character> tab = new ArrayList<>();
        tab.add('+');
        tab.add('-');
        tab.add('*');
        tab.add('/');
        tab.add('^');
        tab.add('@');
        while(true){
            String d = sc.nextLine();
            d = d.replaceAll(" ", "");
            char z = ' ';
            if(d.equals("pomoc")){
                p.pomocy();
                h.zapisz("Otworzono pomoc");
            } else if(d.equals("koniec")){
                h.zapisz("Zamknięto program");
                System.exit(0);
            } else if(d.equals("historia")){
                h.zapisz("Otworzono historię");
                System.out.println(h.odczyt());
            } else{
                for(int i=0; i<d.length(); i++){
                    char w = d.charAt(i);
                    if(tab.contains(w)){
                        z = w;
                    }
                }
                String q = d.substring(0, d.indexOf(z));
                String q2 = d.substring(d.indexOf(z)+1, d.length());
                String wynik = q+" "+z+" "+q2+" = ";
                Dzialania dz = new Dzialania(Integer.parseInt(q), Integer.parseInt(q2));
                if(z == '+'){
                    System.out.println(wynik+dz.dodawanie());
                    h.zapisz(wynik+dz.dodawanie());
                } else if(z == '-'){
                    System.out.println(wynik+dz.odejmowanie());
                    h.zapisz(wynik+dz.dodawanie());
                } else if(z == '*'){
                    System.out.println(wynik+dz.mnozenie());
                    h.zapisz(wynik+dz.dodawanie());
                } else if(z == '/'){
                    System.out.println(wynik+dz.dzielenie());
                    h.zapisz(wynik+dz.dodawanie());
                } else if(z == '^'){
                    System.out.println(wynik+dz.potega());
                    h.zapisz(wynik+dz.dodawanie());
                } else if(z == '@'){
                    System.out.println(wynik+dz.pierwiastek());
                    h.zapisz(wynik+dz.dodawanie());
                } else{
                    System.out.println("Podałeś zły znak");
                }
            }
        }
    }
}