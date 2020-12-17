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

  public static void selectionSort(int[] data){
    for (int i = 0; i < data.length; i++){
      int min = data[i];
      int minPosition = i;
      for (int j = i + 1; j < data.length; j++){
        if (data[j] < min){
          min = data[j];
          minPosition = j;
        }
      }
      data[minPosition] = data[i];
      data[i] = min;
    }
  }

  public static void insertionSort(int[] data){
    for (int i = 1; i < data.length; i++){
      int value = data[i];
      for (int j = i - 1; j >= 0; j--){
        if (data[j] > value) data[j + 1] = data[j];
        else data[j + 1] = value;
      }
      System.out.println(Arrays.toString(data));
    }
  }

}
