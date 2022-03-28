package main.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //wir lesen die Array von Noten
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length of arrays: ");
        n = s.nextInt();
        int[] m = new int[n];
        System.out.println("Enter elements of the first array: ");
        for (int i = 0; i < n; i++) {
            m[i] = s.nextInt();
        }

        //hier sind die Aufrufe der Methoden
        System.out.println(pr1(m));
        System.out.println(pr2(m));
        System.out.println(pr3(m));
        System.out.println(pr4(m));
    }

    //Ruckgabewert: Array mit nicht ausreichende Note liefern
    private static ArrayList<Integer> pr1(int[] noten) {
        ArrayList<Integer> newarray = new ArrayList<Integer>();
        for (int i : noten) {
            if (i < 40) {
                newarray.add(i);
            }
        }
        return newarray;
    }

    //Ruckgabewert: Durchschnittswert liefern indem wir die Summe der Noten berechenen und dann zur Anzahl der Noten teilen
    private static double pr2(int[] noten) {
        double durchschnitt;
        int summe = 0;
        for (int i : noten) {
            summe = summe + i;
        }
        durchschnitt = (double) summe / noten.length;
        return durchschnitt;
    }

    //Ruckgabewert: eine Array mit die abgerundete Noten liefern indem wir die Regeln in der Hypthese anschauen
    private static ArrayList<Integer> pr3(int[] noten){
        ArrayList<Integer> newarray = new ArrayList<Integer>();
        for (int i : noten) {
            if (i < 38 | ((i/5+1)*5-i)>=3 | i%5==0) {
                newarray.add(i);
            }
            else
            {
                newarray.add((i/5+1)*5);
            }
        }
        return newarray;
    }

    //Ruckgabewert: die maximale abgerundete Note liefern indem wir die vorige Methode benutzen um den abgerundeten Noten zu finden
    private static int pr4(int[] noten){
        ArrayList<Integer> newarray = pr3(noten);
        int max = newarray.get(0); //die max abgerundete Note finden
        for(int i:newarray){
            if(i > max){
                max = i;
            }
        }
        return max;
    }
}
