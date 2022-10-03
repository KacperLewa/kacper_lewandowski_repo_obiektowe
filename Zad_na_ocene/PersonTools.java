import java.util.Collections;
import java.util.Comparator;
public class PersonTools{

    public String getCharI(String a, String b){
        return a.charAt(0)+""+b.charAt(0);
    }

    public ArrayList<Person> sortByName(ArrayList<Person> list){
        for(Person p : list){
            System.out.println(p.getName()+" "+p.getLastname());
        }
        Collections.sort(list, new Comparotor() {
            @Override
            public int compare()
        });

    }
    
}