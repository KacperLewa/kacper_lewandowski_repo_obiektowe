public class Obliczenia{
    private double a,b,c;

    public Obliczenia(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double delta(){
        return b*b-4*a*c;
    }
    public double zeroPlace(){
        double delta = delta();
        if (delta > 0){
            double x1 = (-b-Math.sqrt(delta))/2*a;
            double x2 = (-b+Math.sqrt(delta))/2*a;
            return "Miejsca zerowe: "+x1+" i "+x2;
        }else if (delta < 0){
            return "Delta mniejsza niż zero";
        }else{
            return -b/2*a;
        }
    }
}