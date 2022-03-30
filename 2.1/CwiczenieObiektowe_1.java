public class CwiczenieObiektowe_1{
    public static void main(String[] args){
        MojeDane md = new MojeDane("Kacper", "Lewandowski","2PTN");
        Logowanie l = new Logowanie("AFDDG", "1324535");
        Kolo kolo = new Kolo(3.1415, 4.0);
        Prostokat pros = new Prostokat(3, 4);
        System.out.println(md.imie);
        System.out.println(md.nazwisko);
        System.out.println(md.klasa);
        String login = l.toString();
        System.out.println(login);
        double pole_k = kolo.pole_kola();
        System.out.println(pole_k);
        double obwod_k = kolo.obwod_kola();
        System.out.println(obwod_k);
        double pole_p = pros.pole_pros();
        double obwod_p = pros.obwod_pros();
        System.out.println(pole_p);
        System.out.println(obwod_p);
    }
}