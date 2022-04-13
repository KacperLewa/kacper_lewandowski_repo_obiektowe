public class Dane{
    private String name;
    private String last_name;
    private int income;

    public Dane(String name, String last_name, int income){
        this.name = name;
        this.last_name = last_name;
        this.income = income;
    }
    public String getName(){return name;}
    public String getLast_name(){return last_name;}
    public int getIncome(){return income;}
    public void setName(String name){this.name = name;}
    public void setLast_name(String last_name){this.last_name = last_name;}
    public void setIncome(int income){this.income = income;}
}