public class Pola{

    public double poleKwadratu(double a){
        return a*a;
    }

    public double poleTrojkataD(double a, double b, double c){
        int p = (a+b+c)/2;
        return Math.sqrt(2, p*(p-a)*(p-b)*(p-c));
    }

    public double poleTrojkataD(double a, double h){
        return (a*h)/2;
    }

    public double poleTrojkataR(double a){
        return (a*a*Math.sqrt(2, 3))/4;
    }

    public double poleTrojkataR(double a, double h){
        return 0.5*a*h;
    }
}