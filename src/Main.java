import java.lang.reflect.Array;

public class Main {


    public static void main(String[] args) {

        int[] testArray1 = {3, 4, -2, 1};
        String[] testArray2 = {"abcdefghi", "abcdefghijk", "abcd", "asjdkejdklskd"};
        System.out.println("Unfiltered arrays:");

        for(int i = 0; i < testArray1.length; i++)
        {
            System.out.print(testArray1[i] + " ");
        }

        System.out.println();


        for(int i = 0; i < testArray1.length; i++)
        {
            System.out.print(testArray2[i] + " ");
        }



        ArrayFilter filterOne = new ArrayFilter();

        int[] filterArray1 = filter(testArray1,filterOne);
        String[] filterArray2 = filter(testArray2, filterOne);

        System.out.println("\n" +"Filtered arrays:" );
        for(int i = 0; i < testArray1.length; i++)
        {
            System.out.print(filterArray1[i] + " ");
        }

        System.out.println();

        for(int i = 0; i < testArray2.length; i++)
        {
            System.out.print(filterArray2[i] + " ");
        }





    }

    public static String[] filter(String[] a, Filter<String> f)
    {
        String[] filteredArray = new String[a.length];
        int filterCount = 0;


       for (int i = 0; i < a.length; i++)
       {
           if (f.accept(a[i]))
           {
               filteredArray[filterCount++] = a[i];
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
                filteredArray[filterCount++] = a[i];
            }

        }

        return filteredArray;

    }
}
