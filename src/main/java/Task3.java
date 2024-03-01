import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] += i;
        }
        for (int i = 0; i < array.length; i++) {
            if (i % 3 == 0) {
            System.out.println(array[i]);
            }
        }
    }
}



