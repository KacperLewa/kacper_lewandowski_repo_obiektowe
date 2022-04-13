public class Zadanie{
    public static void main(String[] args){
        Dane d = new Dane("Kacper", "Lewandowski", 3000);
        System.out.println(d.getName()+" "+d.getLast_name()+" "+d.getIncome());
    }
}