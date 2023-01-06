import java.util.ArrayList;
import java.util.Collections;

public class LosowanieKart extends Card{
    private ArrayList<Card> list = new ArrayList<>();

    public void losuj(){
        for(int i=0; i<4; i++){
            list.add(new Card("Dwójkę", 2));
            list.add(new Card("Trójkę", 3));
            list.add(new Card("Czwórkę", 4));
            list.add(new Card("Piątkę", 5));
            list.add(new Card("Szóstkę", 6));
            list.add(new Card("Siódemkę", 7));
            list.add(new Card("Ósemkę", 8));
            list.add(new Card("Dziewiątkę", 9));
            list.add(new Card("Dziesiątkę", 10));
            list.add(new Card("Waleta", 10));
            list.add(new Card("Damę", 10));
            list.add(new Card("Króla", 10));
            list.add(new Card("Asa", 1));
        }
        Collections.shuffle(list);
        /*for(int q=0; q<40; q++){
            System.out.println(list.get(q).getCardValue());
        }*/
    }
    

    public void usunKarte(){
        list.remove(0);
    }

    public ArrayList<Card> getList(){
        return list;
    }
}