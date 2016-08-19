public class BiggerNumber
{
    public static void main(String[] args)
    {
        double numberA, numberB;

        TextIO.putln("Hello. Please enter two numbers.");
        numberA = TextIO.getDouble();                                                                                     /* TextIO.getDouble():
                                                                                                                             Receives an unlimited number of double-type
                                                                                                                             numbers (separated from each other by a space)
                                                                                                                             and then, takes the value of the first one.
                                                                                                                             The others are stored on somewhere so that
                                                                                                                             the n-th value is assigned to the n-th
                                                                                                                             double-input-method the program contains. */
        numberB = TextIO.getlnDouble();

        if (numberA > numberB)
        {
            TextIO.putln("Right! So " + numberA + " is bigger than " + numberB + "...");
        }
        else if (numberA < numberB)
        {
            TextIO.putln("Right! So " + numberB + " is bigger than " + numberA + "...");
        }
        else
        {
            TextIO.putln("Right! So " + numberA + " is equal to " + numberB + "...");
        }
    }
}
