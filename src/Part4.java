

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part4
{
    /**
     * Capitalizes the first letter of every word.
     */
    public static void main (String[] args) throws IOException
    {
        try (Scanner s = new Scanner(System.in))
        {
            // This regex matches words.
        	String new_string = "";
        	String x = "";
            Pattern p = Pattern.compile("\"(.*?\\w)\"");
            while(s.hasNextLine())
            {
            	new_string = s.nextLine();
            	Matcher m = p.matcher(new_string);
            	while(m.find())
            	{
            		String temp = m.group();
            		System.out.println(temp.substring(1, temp.length()-1));
            	}
            }
            

            
           
            
            
            
        }
    }
}


