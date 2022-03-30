public class Kolo{
    private double p;
    private double pk;
    public Kolo(double p, double pk){
        this.p = p;
        this.pk = pk;
    }
    public double pole_kola(){
        return p*(pk*pk);
    }
    public double obwod_kola(){
        return 2*p*pk;
    }
}