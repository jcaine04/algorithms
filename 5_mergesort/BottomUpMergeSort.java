public class BottomUpMergeSort {
    
    private static Comparable aux[];

    private static void merge(Comparable a[], lo, mid, hi)
    {
        int i = lo, j = mid + 1;

        for (int k = lo; k <= hi; k++)
        {
            aux[k] = a[k];
        }

        for (int k = lo; k <= hi; k++)
        {
            if (i > mid)            a[k] = aux[j++];
            else if (j > hi)        a[k] = aux[i++];
            else if (less(aux[j], aux[i]))  a[k] = aux[j++];
            else                    a[k] = aux[i++];
        }
    }
    
    private static boolean less(Comparable v, Comparable)
    {
        return v.compareTo(w) < 0;
    }
}