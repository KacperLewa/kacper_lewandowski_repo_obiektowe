import java.time.LocalDate;
import java.util.ArrayList;
public class KalendarzDane{
    private int year;
    private int month;
    private int day;
    private LocalDate localDate;

    public KalendarzDane(){

    }

    public KalendarzDane(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
        localDate = LocalDate.of(year,month,day);
    }

    public LocalDate getLocalDate(){
        return localDate;
    }

    
}