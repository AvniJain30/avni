import java.util.Random;

public class random
{
    public static void main(String args[])
    {
       // Generating random numbers
        Random r = new Random();
        r.ints(5, 1,50).forEach(System.out::println);
    }
}