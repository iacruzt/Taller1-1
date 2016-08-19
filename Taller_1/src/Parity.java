public class Parity
{
    public static void main (String [] args)
    {
        int number;

        TextIO.putln("Hello. Please, enter a number (integer) and I'll tell you if it's even or odd.");
        number = TextIO.getlnInt();

        if (number % 2 == 0)
        {
            TextIO.putln("That number is even!");
        }
        else
        {
            TextIO.putln("That number is odd!");
        }
    }
}
