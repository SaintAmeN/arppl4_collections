package pl.sda.arp4.collections;

import java.util.Arrays;
import java.util.Random;

public class ZadanieGenerator3 {
    public static void main(String[] args) {
        int[] tablica = new int[1000];

        for (int i = 0; i < tablica.length; i++) {
            int wylosowanaLiczba = new Random().nextInt(5201) - 200;

            tablica[i] = wylosowanaLiczba;
        }

        System.out.println(Arrays.toString(tablica));
    }
}
