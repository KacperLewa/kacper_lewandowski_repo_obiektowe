import java.io.NumberFormatException;
import java.math.BigInteger;
import java.math.BigDecimal;
public class Dzialania{
    private int a;
    private int b;

    public Dzialania(){
        
    }

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
        return (int)Math.round(Math.pow(a, b));
    }

    public BigDecimal pierwiastek(){
        //return (Math.pow(a, 1.0/b));
        return BigDecimal.valueOf((Math.pow(a, 1.0/b)));
    }

    public boolean isInt(String s)
    {
        try
        {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex)
        {
            return false;
        }
    }
}