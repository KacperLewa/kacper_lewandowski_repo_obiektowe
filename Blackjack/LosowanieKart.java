import java.util.ArrayList;
import java.util.Collections;

public class LosowanieKart{
    private int dwa = 2;
    private int trzy = 3;
    private int cztery = 4;
    private int piec = 5;
    private int szesc = 6;
    private int siedem = 7;
    private int osiem = 8;
    private int dziewiec = 9;
    private int dziesiec = 10;
    private int walet = 10;
    private int dama = 10;
    private int krol = 10;
    private int as = 11;
    private ArrayList<Integer> list = new ArrayList<Integer>();
    
    public void losuj(){
        for(int i=0; i<4; i++){
            list.add(dwa);
            list.add(trzy);
            list.add(cztery);
            list.add(piec);
            list.add(szesc);
            list.add(siedem);
            list.add(osiem);
            list.add(dziewiec);
            list.add(dziesiec);
            list.add(walet);
            list.add(dama);
            list.add(krol);
            list.add(as);
        }
        Collections.shuffle(list);
    }

    public void usunKarte(){
        list.remove(0);
    }

    public ArrayList<Integer> getList(){
        return list;
    }
}