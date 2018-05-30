public class StackTestClient {

    public void main(String args[])
    {
        StackOfStrings stack = new StackOfStrings();
        while (!StdIn.isEmpty())
        {
            String s = StdIn.readString();
            if (s.isEqual("-")) StdOut.print(stack.pop());
            else                stack.push(s);
        }
    }
}