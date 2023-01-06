import java.util.Date;
public class LogikaGry extends LosowanieKart{
    private int graczPKT;
    private int krupierPKT;
    private int pkt;
    private String card;
    
    public void dobierz(){
        card = getList().get(0).getCardName();
        pkt = getList().get(0).getCardValue();
        usunKarte();
    }

    public int getPKT(){
        return pkt;
    }

    public int getGraczPKT(){
        return graczPKT;
    }

    public void setGraczPKT(int graczPKT){
        this.graczPKT = graczPKT;
    }

    public int getKrupierPKT(){
        return krupierPKT;
    }

    public void setKrupierPKT(int krupierPKT){
        this.krupierPKT = krupierPKT;
    }

    public String getCard(){
        return card;
    }

    public void graKrupiera(){
        while(getKrupierPKT()<=13){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            dobierz();
            setKrupierPKT(getKrupierPKT()+getPKT());
            System.out.println("Krupier dobrał "+getCard()+". Ma "+getKrupierPKT()+" PKT.\n");
        }
    }

    public boolean wynik(){
        if(getKrupierPKT()>21){
            return false;
        } else if(getKrupierPKT()>getGraczPKT()){
            return false;
        } else{
            return true;
        }
    }
}