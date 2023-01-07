import java.util.ArrayList;
import java.util.Collections;

public class LosowanieKart extends Card{
    private ArrayList<Card> list = new ArrayList<>();
    private ArrayList<String> types = new ArrayList<String>();

    public void losuj(){
        types.add("Trefl");
        types.add("Karo");
        types.add("Kier");
        types.add("Pik");
        for(int i=0; i<4; i++){
            String a = types.get(i);
            list.add(new Card("Dwójkę", 2, a));
            list.add(new Card("Trójkę", 3, a));
            list.add(new Card("Czwórkę", 4, a));
            list.add(new Card("Piątkę", 5, a));
            list.add(new Card("Szóstkę", 6, a));
            list.add(new Card("Siódemkę", 7, a));
            list.add(new Card("Ósemkę", 8, a));
            list.add(new Card("Dziewiątkę", 9, a));
            list.add(new Card("Dziesiątkę", 10, a));
            list.add(new Card("Waleta", 10, a));
            list.add(new Card("Damę", 10, a));
            list.add(new Card("Króla", 10, a));
            list.add(new Card("Asa", 1, a));
        }
        Collections.shuffle(list);
    }
    

    public void usunKarte(){
        list.remove(0);
    }

    public ArrayList<Card> getList(){
        return list;
    }

    
}