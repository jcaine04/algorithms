public class TopDownMergeSort {
    private static Comparable[] aux;

    public static void sort(Comparable[] a)
    {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }
    
    private static void sort(Comparable a[], int lo, int hi)
    {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    private static void merge(Comparable a[], int lo, int mid, int hi)
    {
        int i = lo, j = mid;

        for (int k = lo; k <= hi; k++)
        {
            aux[k] = a[k];
        }

        for (int k = lo; k <= hi; k++)
        {
            if (i > mid)                    a[k] = aux[j++];  // left side is exhausted
            else if (j > hi)                a[k] = aux[i++];  // right side is exhaused
            else if (less(aux[j], aux[i]))  a[k] = aux[j++];  // right key is less
            else                            a[k] = aux[i++];  // left key is less or equal
        }
    }

    private static boolean less(Comparable v, Comparable w)
    {
        return v.compareTo(w) < 0;
    }

    public static void show(String[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            StdOut.print(a[i] + " ");
            StdOut.println();
        }
    }
}