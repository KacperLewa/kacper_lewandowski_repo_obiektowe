import java.util.Random;
public class Zad2{
    public static void main(String[] args){
        Random r = new Random();
        int q = 0;
        int x = r.nextInt(10);
        int y = r.nextInt(10);
        int z = r.nextInt(6)+1;
        int[][] tab = new int[10][10];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                tab[i][j] = 0;
            }
        }

        
        for(int j=0;j<10;j++){
            tab[x][y] = z;
            x = r.nextInt(10);
            y = r.nextInt(10);
            z = r.nextInt(6)+1;
        }
        
        
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(j%10==0){
                    System.out.println(tab[i][j]+" ");
                } else {
                    System.out.print(tab[i][j]+" ");
                }
                
            }
        }
        
    }
}