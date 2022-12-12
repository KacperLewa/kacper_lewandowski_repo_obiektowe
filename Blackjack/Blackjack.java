public class Blackjack{
    public static void main(String[] args){
        LosowanieKart lk = new LosowanieKart();
        LogikaGry lg = new LogikaGry();
        InfoGracza ig = new InfoGracza();
        Instrukcja in = new Instrukcja();

        in.info();
        lk.losuj();
        lg.setGraczPKT(lg.dobierz());
        ig.dobranaKarta();
    }
}