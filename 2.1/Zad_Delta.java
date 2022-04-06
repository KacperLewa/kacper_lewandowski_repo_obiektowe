public class Zad_Delta{
    public static void main(String[] args){
        Obliczenia ob = new Obliczenia(1.0,4.0,4.0);
        double delta = ob.delta();
        System.out.println(delta);
        double zero = ob.zeroPlace();
        System.out.println(zero);
    }
}