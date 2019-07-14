import java.util.ArrayList;
import java.util.Arrays;

public class Solution{

public static ArrayList<Integer> Numbers(int[] evenValue, int[] oddValue) {
      List<Integer> evenResult = new ArrayList<>();
      List<Integer> oddResult = new ArrayList<>();
      for (int i = 0; i < k.length; i++) {
          if (k[i] % 2 == 0) {
              evenResult.add(Numbers);
          } else {
              oddResult.add(Numbers);
          }
      }
      int[] result = new int[evenResult.size() + oddResult.size()];
      int i = 0;
      for (int evenValue : evenResult) {
          result[i] = evenValue;
          i++;
      }
      for (int oddValue : oddResult) {
          result[i] = oddValue;
          i++;
      }
      return result;
  }
}


u need two lists to collect into
use a list, it will make ur life easier
so u need List<Integer> evenResult and List<Integer> oddResult

hen collect into those two
evenResult.add(number)
oddResult.add(number)
depending on if its odd or even
and in the end u need to merge both lists together into an array
u can do so by just iterating them

// Merging
int[] result = new int[evenResult.size() + oddResult.size()];
int i = 0;
for (int evenValue : evenResult) {
    result[i] = evenValue;
    i++;
}
for (int oddValue : oddResult) {
    result[i] = oddValue;
    i++;
}
return result;
