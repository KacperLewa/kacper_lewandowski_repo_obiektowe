import java.util.ArrayList;

public class Zad_Numbers{
    public static void main(String[] args){
        Numbers n1 = new Numbers(1);
        Numbers n2 = new Numbers(2);
        Numbers n3 = new Numbers(3);
        Numbers n4 = new Numbers(4);
        Numbers n5 = new Numbers(5);
        Numbers n6 = new Numbers(6);
        Numbers n7 = new Numbers(7);
        Numbers n8 = new Numbers(8);
        Numbers n9 = new Numbers(9);
        Numbers n10 = new Numbers(10);
        ArrayList<Numbers> list = new ArrayList();
        list.add(n1);
        list.add(n2);
        list.add(n3);
        list.add(n4);
        list.add(n5);
        list.add(n6);
        list.add(n7);
        list.add(n8);
        list.add(n9);
        list.add(n10);
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i).showMultiply());
        }
        n1.setL1(3);
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i).showMultiply());
        }
        n1.setL1(7);
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i).showMultiply());
        }
    }
}