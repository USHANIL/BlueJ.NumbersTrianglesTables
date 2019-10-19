 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String conString = "";
        for (int i = 0 ; i< numberOfStars ; i++)
        {
        conString = conString + "*";
        //conString = String.format(conString,i);
        
        }
        return conString;
    }
    
    public static String getTriangle(int numberOfRows) {
        String conString = "";
        for (int i = 0 ; i< numberOfRows ; i++)
        {
            String noOfStars = "";
            
                for ( int j=0 ; j <= i ; j++)
                {
                    noOfStars = noOfStars + "*" ;
                }
            
            conString = conString + noOfStars + "\n";
            
        //conString = String.format(conString,i);
        
        }
        //System.out.println(conString);
        return conString;
    }


    public static String getSmallTriangle() {
        String conString = "";
        for (int i = 0 ; i< 4 ; i++)
        {
            String noOfStars = "";
            
                for ( int j=0 ; j <= i ; j++)
                {
                    noOfStars = noOfStars + "*" ;
                }
            
            conString = conString + noOfStars + "\n";
            
        //conString = String.format(conString,i);
        
        }
        return conString;
    }

    public static String getLargeTriangle() {
        String conString = "";
        for (int i = 0 ; i< 9 ; i++)
        {
            String noOfStars = "";
            
                for ( int j=0 ; j <= i ; j++)
                {
                    noOfStars = noOfStars + "*" ;
                }
            
            conString = conString + noOfStars + "\n";
            
        //conString = String.format(conString,i);
        
        }
        return conString;
    }
}
