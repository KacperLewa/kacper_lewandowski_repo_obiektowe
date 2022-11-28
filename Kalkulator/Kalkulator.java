import java.util.ArrayList;
import java.util.Scanner;
public class Kalkulator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Pomoc p = new Pomoc();
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
            } else if(d.equals("koniec")){
                System.exit(0);
            } else{
                for(int i=0; i<d.length(); i++){
                    char h = d.charAt(i);
                    if(tab.contains(h)){
                        z = h;
                    }
                }
                String q = d.substring(0, d.indexOf(z));
                String q2 = d.substring(d.indexOf(z)+1, d.length());
                String wynik = q+" "+z+" "+q2+" = ";
                Dzialania dz = new Dzialania(Integer.parseInt(q), Integer.parseInt(q2));
                if(z == '+'){
                    System.out.println(wynik+dz.dodawanie());
                } else if(z == '-'){
                    System.out.println(wynik+dz.odejmowanie());
                } else if(z == '*'){
                    System.out.println(wynik+dz.mnozenie());
                } else if(z == '/'){
                    System.out.println(wynik+dz.dzielenie());
                } else if(z == '^'){
                    System.out.println(wynik+dz.potega());
                } else if(z == '@'){
                    System.out.println(wynik+dz.pierwiastek());
                } else{
                    System.out.println("Podałeś zły znak");
                }
            }
        }
    }
}