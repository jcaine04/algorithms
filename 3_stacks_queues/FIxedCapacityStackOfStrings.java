public class FixedCapacityStackOfStrings 
{
    String[] s;
    int N = 0;

    public FixedCapacityStackOfStrings(int capcity)
    {
        s = new String[capcity];
    }

    public boolean isEmpty()
    {
        return N == 0;
    }

    public void push(String item)
    {
        s[N++] = item;
    }

    public String pop()
    {
        return s[--N];  // implementation is subject to loitering

        /* 
        // implementation to avoid loitering
        String item = s[--N];
        s[N] = null;
        return item;
        */
    }
}