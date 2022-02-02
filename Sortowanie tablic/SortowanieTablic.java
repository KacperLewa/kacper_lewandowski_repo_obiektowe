import java.util.Random;
class SortowanieTablic{
    public static void main(String[] args){
        final int ILOSC_ELEMENTOW = 100;
        Random r = new Random();
        int [] tab = new int[ILOSC_ELEMENTOW];
        for(int i=0;i<ILOSC_ELEMENTOW;i++){
            tab[i] = r.nextInt(1000000)+1;
        }
        long millisActualTime = System.currentTimeMillis();
        //sortowanie bąbelkowe
        for (int i = 0; i<tab.length; i++) {
            for (int j = 1; j<tab.length; j++) {
                if (tab[j]<tab[j-1]) {
                    int wieksza = tab[j-1];
                    tab[j-1] = tab[j];
                    tab[j] = wieksza;
                }
            }
        }
        long executionTime = System.currentTimeMillis() - millisActualTime;
        System.out.println("Sortowanie bąbelkowe czas wykonania: "+executionTime);
    }
}