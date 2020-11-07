import java.lang.reflect.Array;

public class Main {


    public static void main(String[] args) {

        int[] testArray1 = {3, 4, -2, 1};
        String[] testArray2 = {"abcdefghi", "abcdefghijk", "abcd", "asjdkejdklskd"};
        ArrayFilter filterOne = new ArrayFilter();

        filter(testArray1,filterOne);
        filter(testArray2, filterOne);




    }

    public static String[] filter(String[] a, Filter<String> f)
    {
        String[] filteredArray = new String[a.length];
        int filterCount = 0;


       for (int i = 0; i < a.length; i++)
       {
           if (f.accept(a[i]))
           {
               filteredArray[filterCount] = a[i];
               System.out.println(filteredArray[filterCount++]);
           }

       }

       return filteredArray;



    }


    public static int[] filter(int[] a, Filter<Integer> f)
    {

        int[] filteredArray = new int[a.length];
        int filterCount = 0;

        for (int i = 0; i < a.length; i++)
        {
            if(f.accept(a[i]))
            {
                filteredArray[filterCount] = a[i];
                System.out.println(filteredArray[filterCount++]);
            }

        }

        return filteredArray;

    }
}
