class Wielowodkowosc{
    static int counter = 0;
    public static void main(String[] args){
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run(){
                try{
                    while(true){
                        Thread.sleep(millis 500);
                        counter++;
                        System.out.println("t1"+counter);
                    }
                } catch (InterruptedExeption e){
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run(){
                try{
                    while(true){
                        Thread.sleep(millis: 500);
                        counter++;
                        System.out.println("t2"+counter);
                    }
                } catch (InterruptedExeption e){
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
    }
}