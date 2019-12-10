public class runner {
    public static void main(String[] args)
    {

        try
        {
            double dfd=1;
            if(dfd <2)
            {
                throw new myException();
            }
        }
        catch (myException ex)
        {
            System.out.println("Not a valid number");
        }
    }
}
