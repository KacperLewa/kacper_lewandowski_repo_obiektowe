import java.util.Scanner;
class Zad3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj imie");
        String a = sc.nextLine();
        System.out.println("Podaj nazwisko");
        String b = sc.nextLine();
        System.out.println("Podaj wiek");
        String c = sc.nextLine();
        System.out.println("Podaj wagę");
        double d = sc.nextDouble();
        System.out.println("Podaj wzrost");
        double e = sc.nextDouble();
        double bmi = d/Math.pow(e, 2);
        if (bmi<=18.5){
            System.out.println("Twoje bmi wynosi "+bmi+". Masz niedowage.");
        } else if (bmi>18.5 && bmi<=25){
            System.out.println("Twoje bmi wynosi "+bmi+". Jest w normie.");
        } else if (bmi>25 && bmi<=30){
            System.out.println("Twoje bmi wynosi "+bmi+". Masz nadwage.");
        } else if (bmi>30){
            System.out.println("Twoje bmi wynosi "+bmi+". Jestes otyly.");
        }
    }
}