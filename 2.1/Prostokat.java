public class Prostokat{
    private double a;
    private double b;
    public Prostokat(double a, double b){
        this.a = a;
        this.b = b;
    }
    public double pole_pros(){
        return a*b;
    }
    public double obwod_pros(){
        return a+a+b+b;
    }
}