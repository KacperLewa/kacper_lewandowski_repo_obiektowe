public class LogikaGry extends LosowanieKart{
    private int graczPKT;
    private int krupierPKT;
    private int pkt;

    public int dobierz(){
        pkt = getList().get(0);
        usunKarte();
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
}