import java.time.LocalDate;
import java.util.ArrayList;

public class UserDate{
    private ArrayList<UserDate> list = new ArrayList<UserDate>();
    private String name;
    private String surname;
    private String email;
    private String birth;

    public UserDate(){}

    public UserDate(String name, String surname, String email, String birth){
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.birth = birth;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getBirth(){
        return birth;
    }

    public void setBirth(String birth){
        this.birth = birth;
    }

    public ArrayList<UserDate> getList(){
        return list;
    }

    public void setList(ArrayList<UserDate> list){
        this.list = list;
    }

    public void siema(){
        UserDate chuj = new UserDate("s", "s", "s", "s");
        list.add(chuj);
    }

    public void chuj(){
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i)+"\n");
        }
    }

    @Override
    public String toString(){
        return name+" "+surname+" "+email+" "+birth;
    }
}