import java.util.Arrays;
public class Sorts{

  public static void bubbleSort(int[] data){
    for (int i = 0; i < data.length; i++){
      int swaps = 0;
      for (int j = 0; j < data.length - i - 1; j++){
        if (data[j + 1] < data[j]){
          int temp = data[j];
          data[j] = data[j + 1];
          data[j + 1] = temp;
          swaps++;
        }
      }
      if (swaps == 0) break;
    }
  }

}
