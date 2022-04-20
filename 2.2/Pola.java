public class Pola{
    private double a;
    private double b;
    private double h;

    public Pola(double a, double b, double h){
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public double poleKwadratu(){
        return a*a;
    }

    public double poleTrojkataP(){
        return (a*b)/2;
    }

    public double poleTrojkataD(){
        return (a*h)/2;
    }

    public double poleTrojkataR(){
        return (a*a*Math.sqrt(2, 3))/4;
    }
}