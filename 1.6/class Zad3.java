import java.util.Scanner;
import java.util.Random;
class Zad3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int o = r.nextInt(10);
        String s = "";
        double points = 0;
        char star = '*';
        int l = 0;
        String [][] tab = new String[10][8];
        tab [0][0] = "Asd";
        tab [1][0] = "Rds";
        tab [2][0] = "Eds";
        tab [3][0] = "Wds";
        tab [4][0] = "Qds";
        tab [5][0] = "Lds";
        tab [6][0] = "Kds";
        tab [7][0] = "Jds";
        tab [8][0] = "Hds";
        tab [9][0] = "Gds";
            tab [0][1] = "A: 100";
            tab [1][1] = "A: 100";
            tab [2][1] = "A: 100";
            tab [3][1] = "A: 100";
            tab [4][1] = "A: 100";
            tab [5][1] = "A: 100";
            tab [6][1] = "A: 100";
            tab [7][1] = "A: 100";
            tab [8][1] = "A: 100";
            tab [9][1] = "A: 100";
                tab [0][2] = "B: 200";
                tab [1][2] = "B: 200";
                tab [2][2] = "B: 200";
                tab [3][2] = "B: 200";
                tab [4][2] = "B: 200";
                tab [5][2] = "B: 200";
                tab [6][2] = "B: 200";
                tab [7][2] = "B: 200";
                tab [8][2] = "B: 200";
                tab [9][2] = "B: 200";
                    tab [0][3] = "C: 300";
                    tab [1][3] = "C: 300";
                    tab [2][3] = "C: 300";
                    tab [3][3] = "C: 300";
                    tab [4][3] = "C: 300";
                    tab [5][3] = "C: 300";
                    tab [6][3] = "C: 300";
                    tab [7][3] = "C: 300";
                    tab [8][3] = "C: 300";
                    tab [9][3] = "C: 300";
                        tab [0][4] = "D: 400";
                        tab [1][4] = "D: 400";
                        tab [2][4] = "D: 400";
                        tab [3][4] = "D: 400";
                        tab [4][4] = "D: 400";
                        tab [5][4] = "D: 400";
                        tab [6][4] = "D: 400";
                        tab [7][4] = "D: 400";
                        tab [8][4] = "D: 400";
                        tab [9][4] = "D: 400";
                            tab [0][5] = "A";
                            tab [1][5] = "B";
                            tab [2][5] = "C";
                            tab [3][5] = "D";
                            tab [4][5] = "A";
                            tab [5][5] = "B";
                            tab [6][5] = "C";
                            tab [7][5] = "D";
                            tab [8][5] = "A";
                            tab [9][5] = "B";
                                tab [0][6] = "100";
                                tab [1][6] = "200";
                                tab [2][6] = "300";
                                tab [3][6] = "400";
                                tab [4][6] = "100";
                                tab [5][6] = "200";
                                tab [6][6] = "300";
                                tab [7][6] = "400";
                                tab [8][6] = "100";
                                tab [9][6] = "200";
                                    tab [0][7] = "1";
                                    tab [1][7] = "2";
                                    tab [2][7] = "3";
                                    tab [3][7] = "4";
                                    tab [4][7] = "5";
                                    tab [5][7] = "6";
                                    tab [6][7] = "7";
                                    tab [7][7] = "8";
                                    tab [8][7] = "9";
                                    tab [9][7] = "10";
        
        for(int i=0; i<tab[o][6].length(); i++){
            s = +star;}
        String a = sc.nextLine();
        
        while (!tab[o][6].equals(a) || l<tab[o][6].length()){
            String q = Character.toString(tab[o][6].charAt(l));
            String s2 = s.replaceFirst("*", tab[o][6]);
            a = sc.nextLine();
            if (tab[o][6].equals(a)){
                points=points+1;
            } else {
                points=points+0;
            }
            l++;
        }
        System.out.println(points);
        }
    }
