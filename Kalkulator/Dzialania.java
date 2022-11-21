public class Dzialania{
    private int a;
    private int b;

    public Dzialania(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA(){
        return a;
    }

    public void setA(int a){
        this.a = a;
    }

    public int getB(){
        return b;
    }

    public void setB(int b){
        this.b = b;
    }

    public int dodawanie(){
        return a+b;
    }

    public int odejmowanie(){
        return a-b;
    }

    public int mnozenie(){
        return a*b;
    }

    public int dzielenie(){
        return a/b;
    }

    public int potega(){
        return Math.pow(a, b);
    }

    public int pierwiastek(){
        return Math.sqrt(a, b);
    }
}