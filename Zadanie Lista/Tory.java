class Tory{
    private String tor;
    private String data;
    private String wygrany;

    public Tory(String tor, String data, String wygrany){
        this.tor = tor;
        this.data = data;
        this.wygrany = wygrany;
    }
    public String getTor(){
        return tor;
    }
    public String getData(){
        return data;
    }
    public String getWygrany(){
        return wygrany;
    }
    public void menu(){
        System.out.println("1. Wyświetl wszystkie tory.");
        System.out.println("2. Wyświetl wszystkich zwycięzców.");
        System.out.println("3. Wyświetl kto wygrał najwięcej wyścigów.");
    }
}