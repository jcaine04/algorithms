public class ResizingArrayStackOfStrings 
{
    String[] s = new String[1];
    int N = 0;

    public boolean isEmpty() 
    {
        return N == 0;
    }

    private resize(capacity) 
    {
        String[] copy = new String[capacity];
        for(int i = 0; i < N; i++)
        {
            copy[i] = s[i];
        }
        s = copy;
    }

    public void push(String item)
    {
        if (N == s.length)
        {
            resize(2 * s.length);
        }
        s[N++] = item;
    }

    public String pop()
    {
        String item = s[--N];
        s[N] = null;
        if (N > 0 && N == s.length / 4)
        {
            resize(s.length/2);
        }
        return item;
    }
}