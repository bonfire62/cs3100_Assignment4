

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part2
{
    /**
     * Capitalizes the first letter of every word.
     */
    public static void main (String[] args) throws IOException
    {
        try (Scanner s = new Scanner(System.in))
        {
            // This regex matches words.
            Pattern p = Pattern.compile("\\/\\/(.*)\\n");

            // Pull the entire document into a string
            String document = "";
            while (s.hasNextLine())
            {
                document += s.nextLine() + "\n";
            }

            // Match on the entire document
            Matcher m = p.matcher(document);

            // The modified text will be accumulated into the StringBuffer
            StringBuffer sb = new StringBuffer();

            // Replace every substring that matches the pattern with
            // a capitalized version.
            while (m.find())
            {
                m.appendReplacement(sb, m.group().toUpperCase());
            	//System.out.println(m.group());
            }

            // Copy over any remaining text into the StringBuffer, then print it out.
            m.appendTail(sb);
            System.out.println(sb);
        }
    }
}


