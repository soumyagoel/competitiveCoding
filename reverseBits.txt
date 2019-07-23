import java.util.*;

public class Solution {
    public long reverse(long a) {
          int i=31;
          long a1=0,rem;
          while(a!=0 && i>=0)
          {
              rem = a%2;
              if(rem==1)
              a1 = a1 + (long)(Math.pow(2,i));
              a=a/2;
              i--;
          }
          return a1;
    }
}
