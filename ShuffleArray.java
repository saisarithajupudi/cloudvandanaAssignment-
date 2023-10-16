import java.util.*;

public class ShuffleArray
{
 public static void main(String[]args)
 {
  int[] arr={1,2,3,4,5,6,7};
  Random r = new Random();
  for(int i=0; i<arr.length;i++)
  {
   int x= r.nextInt(arr.length);
   int temp = arr[x];
   arr[x] = arr[i];
   arr[i] = temp;
  }
System.out.println(Arrays.toString(arr));
}
}
