import java.util.Random;
import java.util.Arrays;

public class sortsTester{
  public static void main(String[] args) {
    int[] sortThis = new int[10];
    Random rng = new Random(166);
    for (int i = 0; i < 10; i++){
      sortThis[i] = rng.nextInt() % 1000;
    }

    System.out.println(Arrays.toString(sortThis));
    Sorts.insertionSort(sortThis);

    int[] a = new int[10];
    a[0] = 2; a[1] = 2; a[2] = 8; a[3] = 2; a[4] = 17; a[4] = -1; a[5] = -27; a[6] = 2; a[7] = 0; a[8] = -1; a[9] = 4;


    System.out.println(Arrays.toString(a));
    Sorts.insertionSort(a);

  }
}
