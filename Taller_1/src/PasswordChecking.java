public class PasswordChecking
{
    public static void main (String [] args)
    {
        String actualPassword, enteredPassword;
        actualPassword = "carrot";

        while(true)
        {
            TextIO.putln("Type the password.");
            enteredPassword = TextIO.getlnString();
            if (enteredPassword.equals(actualPassword))
            {
                TextIO.putln("Correct.");
                break;
            }
            else
            {
                TextIO.putln("Wrong.\n");
                continue;
            }
        }
        TextIO.putln("The secret is: A good joke. The programmer's wife sent him to the grocery store, and her instructions were: \n\"Buy butter. See if they"
                     + " have eggs. If the do, buy ten\". So he bought ten.");
    }
}
