public class Card{
    private String name;
    private int value;
    private String type;

    public Card(String name, int value, String type){
        this.name = name;
        this.value = value;
        this.type = type;
    }

    public Card(){
        
    }
    
    public String getCardName(){
        return name;
    }

    public int getCardValue(){
        return value;
    }

    public String getCardType(){
        return type;
    }

    @Override
    public String toString(){
        return "Card{"+"name='"+name+'\''+", value='"+value+'\''+", type='"+type+'\''+'}';
    }
}