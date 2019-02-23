package sda;

public class CountingSort {

    public static int [] sort (int [] array) {

        int [] tablica = new int[array.length];

        int min = array [0];
        int max = array [0];

        for (int i = 1; i < array.length; i++) {
            if (array [i] < min) {
                min = array [i];
            } else if (array [i] > max) {
                max = array [i];
            }
        }
        int [] count = new int[max - min + 1];

        for (int i = 0; i < array.length; i++) {
            count [array [i] - min]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] = count [i] + count [i - 1];
        }

        for (int i = array.length - 1; i >= 0; i--) {
            tablica [--count[array[i] - min]] = array [i];
        }
        return tablica;
    }



}
