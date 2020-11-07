import java.lang.reflect.Array;

public class ArrayFilter<T> implements Filter<T> {



    public boolean accept(T x) {

        if(x instanceof String)
        {
           String str = (String) x;
           if (str.length() >= 9)
           {
               return true;
           }
           else
           {
               return false;
           }

        }

        else if (x instanceof Integer)
        {
          int numb = (int) x;
          if(numb > 0)
          {
              return true;
          }

          else
          {
              return false;
          }

        }

        else
        {
            return false;
        }




    }




}
