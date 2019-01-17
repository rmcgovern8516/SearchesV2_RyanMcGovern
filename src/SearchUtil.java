import java.util.Scanner;

public class SearchUtil
{
    public static int binarySearch(int[] arr, int target){
        int min = 0;
        int max = arr.length;
        int index = max/2;
        int currentGuess;
        boolean test = false;
        boolean loop = true;

        for (int i=0; i<arr.length; i++)
        {
            if (arr[i]==target)
            {
                test = true;
            }
        }
        if (test==true)
        {
            while (loop==true)
            {
                currentGuess = arr[index];
                if (currentGuess>target)
                {
                    max = index;
                    index = (min+max)/2;
                }
                else if (currentGuess<target)
                {
                    min = index;
                    index = (min+max)/2;
                }
                else if (currentGuess==target)
                {
                    loop = false;
                }
            }
        }
        else if (test==false)
        {
            index = -1;
        }
        return index;
    }
}
