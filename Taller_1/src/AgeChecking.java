public class AgeChecking
{
    public static void main (String [] args)
    {
        double age;

        TextIO.putln("Hello! How old are you (years)?");

        age = TextIO.getlnDouble();
        if ((age <= 120) && (age >= 0))
        {
            if (age < 4)
            {
                TextIO.putln("That's technically possible, but it's certainly suspicious...");
            }
            else
            {
                TextIO.putln("OK.");
            }
        }
        else
        {
            TextIO.putln("Bullshit! I don't wanna talk to you anymore :(");
        }

    }
}
