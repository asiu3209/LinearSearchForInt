import java.util.Arrays;
import java.util.ArrayList;

public class LinearSearchRunner
{
    public static void main(String[] args)
    {
        int[] numArray = {3, -2, 9, 38, -23, 100};
        System.out.println("Tests of linear search array:");
        System.out.println(Search.linearSearch(numArray, 3));
        System.out.println(Search.linearSearch(numArray, 9));
        System.out.println(Search.linearSearch(numArray, -23));
        System.out.println(Search.linearSearch(numArray, 99));
    }
}
