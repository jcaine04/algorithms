public class LinkedQueueOfStrings 
{
    Node first, last;

    private class Node
    {
        String item;
        Node next;
    }

    private boolean isEmpty()
    {
        return first == null;
    }

    public void enqueue(String item)
    {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        if (isEmpty())
        {
            first = last;
        }
        else
        {
            oldlast.next = last;
        }
    }

    public String dequeue()
    {
        String item = first.item;
        if (first.next == null)
        {
            
        }
    }
}
