import java.time.LocalDate;

public class Kalendarz{
    public static void main(String[] args){
        KalendarzDane kd = new KalendarzDane(2,12,2022);
        
        LocalDate localDate = LocalDate.now();
        int d = localDate.getDayOfMonth();
        int dt = localDate.getDayOfWeek().getValue();
        int m = localDate.getMonthValue();
        int y = localDate.getYear();
        System.out.println(d+"-"+m+"-"+y);

        localDate = localDate.plusDays(1);

        d = localDate.getDayOfMonth();
        dt = localDate.getDayOfWeek().getValue();
        m = localDate.getMonthValue();
        y = localDate.getYear();
        System.out.println(d+"-"+m+"-"+y);

        localDate = localDate.minusDays(localDate.getDayOfMonth()-1);

        /*System.out.println("PO\tWT\tŚR\tCZ\tPT\tSo\tND");
        for(int i=1; i<42; i++){
            if(i == d){
                System.out.print(""+i+"*\t");
            } else{
                System.out.print(""+i+"\t");
            }
            
            if(i%7==0){
                System.out.println();
            }
        }*/
    }
}