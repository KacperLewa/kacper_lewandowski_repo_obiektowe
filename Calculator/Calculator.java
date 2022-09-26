import java.util.Scanner;
public class Calculator{
    //1
    static Scanner sc;
    static double l1,l2;
    static String d;
    public static void main(String[] args){
        //2
        sc = new Scanner(System.in);
        System.out.println("Kalkulator do obliczeń");
        System.out.print("Podaj pierwszą liczbe: ");
        l1 = sc.nextDouble();
        System.out.print("Wybierz działanie [+,-,*,/]: ");
        d = sc.next();
        System.out.print("Podaj drugą liczbe: ");
        l2 = sc.nextDouble();
        if(d.equals("+")){
            System.out.print(""+l1+" "+d+" "+l2+" = "+sum(l1,l2));
        } else if(d.equals("-")){
            System.out.print(""+l1+" "+d+" "+l2+" = "+roz(l1,l2));
        } else if(d.equals("*")){
            System.out.print(""+l1+" "+d+" "+l2+" = "+mno(l1,l2));
        } else if(d.equals("/")){
            System.out.print(""+l1+" "+d+" "+l2+" = "+dzi(l1,l2));
        } else {
            System.out.print("Wybrałeś złe działanie");
        }
        
    }
    //3
    private static double sum(double n1, double n2){
        return n1+n2;
    }
    private static double roz(double n1, double n2){
        return n1-n2;
    }
    private static double mno(double n1, double n2){
        return n1*n2;
    }
    private static double dzi(double n1, double n2){
        return n1/n2;
    }
}