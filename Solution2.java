import java.util.Arrays;

public class Solution2 {

  public int min(int[] arr) {
    return Arrays.stream(arr).min().getAsInt();
  }
  
  public int max(int[] arr) {
    return Arrays.stream(arr).max().getAsInt();
  }
}
