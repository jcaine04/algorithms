public class ArrayStuff
{
    String[] a = new String[2];

    public static void main(String[] args)
    {
        System.out.println("Size of a: " + a.length);
        makeBigger(a);
        System.out.println("Size of a: " + a.length);
    }

    public static void makeBigger(String[] a)
    {
        String[] newArray = new String[10];
        a = newArray;
    }

}