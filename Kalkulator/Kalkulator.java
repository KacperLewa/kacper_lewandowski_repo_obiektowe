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
        String d = sc.nextLine();
        char z = ' ';
        for(int i=0; i<d.length(); i++){
            char h = d.charAt(i);
            if(tab.contains(h)){
                z = h;
            } else{
                System.out.println("Podałeś złe dane");
            }
        }
        System.out.println(z);
        String q = d.substring(0, d.indexOf(z));
        System.out.println(q);
        String q2 = d.substring(d.indexOf(z)+1, d.length());
        System.out.println(q2);
        Dzialania dz = new Dzialania(Integer.parseInt(q), Integer.parseInt(q2));
        System.out.println(dz.dodawanie());
    }
}