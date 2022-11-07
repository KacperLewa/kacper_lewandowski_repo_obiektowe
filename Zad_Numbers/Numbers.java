import java.util.ArrayList;

public class Numbers{
    private static int l1 = 2;
    private int l2;

    public Numbers(int l2){
        this.l2 = l2;
    }

    public int getL1(){
        return l1;
    }

    public void setL1(int l1){
        this.l1 = l1;
    }

    public int getL2(){
        return l2;
    }

    public void setL2(int l2){
        this.l2 = l2;
    }

    public String showMultiply(){
        return l1+" * "+l2+" = "+l1*l2;
    }

    public ArrayList<Numbers> show(ArrayList<Numbers> list){
        for(int i=0; i<list.size();i++){
            return list.get(i).showMultiply();
        }
    }
}