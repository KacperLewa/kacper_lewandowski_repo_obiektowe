import java.util.ArrayList;
import java.time.LocalDate;
public class CRUD{
    public static void main(String[] args) {
        ArrayList<UserDate> list = new ArrayList();
        Menu_CRUD m = new Menu_CRUD();
        UserDate ud = new UserDate("123","Kacper", "Lewandows", LocalDate.of(2020, 11, 4));
        System.out.println(m.menu());
        for(int i=0; i<ud.getArList().size(); i++){
            System.out.println(ud.getArList().get(i));
        }
    }
}