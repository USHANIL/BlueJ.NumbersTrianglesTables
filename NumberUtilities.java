


public class NumberUtilities {

    public static String getRange(int stop) 
    {
        String conString = "";
        for (int i = 0 ; i< stop ; i++)
        {
        conString = conString + i;
        //conString = String.format(conString,i);
        
        }
        return conString;
    }

    public static String getRange(int start, int stop) {
        String conString = "";
        for (int i = start ; i< stop ; i++)
        {
        conString = conString + i;
        //conString = String.format(conString,i);
        
        }
        return conString;
    }


    public static String getRange(int start, int stop, int step) {
        String conString = "";
        for (int i = start ; i< stop ;)
        {
        conString = conString + i;
        //conString = String.format(conString,i);
        i = i + step;
        }
        return conString;
    }

    public static String getEvenNumbers(int start, int stop) {
        String conString = "";
        if (start%2 != 0 )
        {
            start = start + 1;
        }
        for (int i = start ; i< stop ;)
        {
        conString = conString + i;
        //conString = String.format(conString,i);
        i = i + 2;
        }
        return conString;
    }


    public static String getOddNumbers(int start, int stop) {
        String conString = "";
        if (start%2 == 0 )
        {
            start = start + 1;
        }
        for (int i = start ; i< stop ;)
        {
        conString = conString + i;
       
        i = i + 2;
        }
        return conString;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String conString = "";
        
        for (int i = start ; i<= stop ; i++)
        {
            int expValue = (int) Math.pow(i, exponent);
            conString = conString + expValue;
            //conString = String.format("%s, %.2f",conString , expValue );
        //conString = String.format(conString,i);
        
        
        }
        return conString;
    }
}
