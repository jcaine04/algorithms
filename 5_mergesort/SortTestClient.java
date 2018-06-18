import java.io.*;

public class SortTestClient
{
    public static void main(String[] args)
    {
        String[] a = new String[2];
        int N = 0;

        while (!StdIn.isEmpty())
        {
            if (N == a.length)
            {
                a = resize(a, a.length + 1);
            }
            String s = StdIn.readString();
            a[N] = s;
            N++;
        }

        System.out.println("Text read in: ");
        TopDownMergeSort.show(a);
        System.out.println();

        System.out.println("Sorting text...");
        TopDownMergeSort.sort(a);
        System.out.println();

        System.out.println("Sorted text...");
        TopDownMergeSort.show(a);
    }

    private static String[] resize(String[] a, int size)
    {
        StdOut.println("Resizing to " + size);
        String[] newArray = new String[size];

        for (int i = 0; i < a.length; i++)
        {
            newArray[i] = a[i];
        }

        return newArray;
    }
}