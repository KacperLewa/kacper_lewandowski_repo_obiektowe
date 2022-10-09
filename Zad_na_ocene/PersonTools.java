import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;
public class PersonTools{

    public String getCharI(String a, String b){
        return a.charAt(0)+""+b.charAt(0);
    }

    public void showList(ArrayList<Person> list){
        for(Person p : list){
            System.out.println(p.getName()+" "+p.getLastname());
        }
    }

    public ArrayList<Person> sortByName(ArrayList<Person> list){
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2){
                return o1.getName().compareTo(o2.getName());
            }
        });
        return list;
        
    }

    public ArrayList<Person> sortByLastname(ArrayList<Person> list){
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2){
                return o1.getLastname().compareTo(o2.getLastname());
            }
        });
        return list;
    }
    
}