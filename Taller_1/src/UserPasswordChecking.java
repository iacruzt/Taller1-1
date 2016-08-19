public class UserPasswordChecking
{
    public static void main (String [] args)
    {
        String username,password;

        TextIO.put("Type your username: ");
        username = TextIO.getlnString();
        TextIO.put("\nType your password: ");
        password = TextIO.getlnString();

        if( (username.equals("alex") && password.equals("mightyducks")) || (username.equals("emily") && password.equals("cat")) )
        {
            TextIO.putln("\nYou are now logged into the system!");
        }
        else
        {
            TextIO.putln("\nYour username or password was invalid!");
        }

    }
}
