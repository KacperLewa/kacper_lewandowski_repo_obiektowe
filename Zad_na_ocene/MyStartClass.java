import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.*;
public class MyStartClass{
    public static void main(String[] args){
        ArrayList<Person> list = new ArrayList();
        list.add(new Person("Kacper","Lewandowski"));
        list.add(new Person("Jakub","Drzała"));
        list.add(new Person("Wojciech","Grabski"));
        list.add(new Person("Dominik","Mańczak"));
        list.add(new Person("Kamil","Hamerliński"));
        list.add(new Person("Damian","Łuczak"));
        list.add(new Person("Szymon","Kurzyński"));
        list.add(new Person("Krystian","Jackiewicz"));
        list.add(new Person("Jakub","Kostrzewa"));
        list.add(new Person("Paweł","Kozłowski"));
        list.add(new Person("Antoni","Musiał"));
        list.add(new Person("Dawid","Gwazdacz"));
        list.add(new Person("Mateusz","Grześków"));
        Menu m = new Menu();
        PersonTools pt = new PersonTools();
        Scanner sc = new Scanner(System.in);
        String alf = "";
        System.out.println(m.menu());
        int a = sc.nextInt();
        if(a==1){
            for(int i=0; i<list.size(); i++){
                System.out.println(pt.getCharI(list.get(i).getName(), list.get(i).getLastname()));
            }
        }else if(a==2){
            System.out.println(m.menu2());
            a = sc.nextInt();
            if(a==1){
                for(int i=0; i<list.size(); i++){
                    System.out.println(list.get(i).getName() +" "+ list.get(i).getLastname());
                }
            }else if(a==2){
                Collections.sort(list);
                Collections.sort(list);
                for(int i=0; i<list.size(); i++){
                    System.out.println(list.get(i).getName() +" "+ list.get(i).getLastname());
                }
            }else if(a==3){

            }else if(a==4){
                
            }
        }else if(a==3){
            
        }
    }
}