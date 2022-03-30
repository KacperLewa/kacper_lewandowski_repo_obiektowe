public class Logowanie{
    private String login;
    private String haslo;
    public Logowanie(String login, String haslo){
        this.login = login;
        this.haslo = haslo;
    }
    public String toString(){
        return "Login: "+login+" Password: "+haslo;
    }
    
    
    
}