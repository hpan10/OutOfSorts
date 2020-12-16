import java.util.Random;
import java.util.Arrays;

public class sortsTester{
  public static void main(String[] args) {
    int[] sortThis = new int[10];
    Random rng = new Random(16);
    for (int i = 0; i < 10; i++){
      sortThis[i] = rng.nextInt() % 1000;
    }

    System.out.println(Arrays.toString(sortThis));
    Sorts.bubbleSort(sortThis);

    int[] a = new int[10];
    for (int i = 0; i < 10; i++){
      a[i] = 10 - i;
    }

    System.out.println(Arrays.toString(a));
    Sorts.bubbleSort(a);
  }
}
