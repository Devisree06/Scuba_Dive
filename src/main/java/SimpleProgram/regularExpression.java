package SimpleProgram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExpression {
	    public static void main(String[] args) {
	        // The string to be searched
	        String text = "The quick brown fox jumps over the lazy dog1 a12132";
	        
	        // The regular expression pattern to search for
	        String pattern = "\\b[A-Za-z]+\\b";
	        
	        String pattern1="\\b[a-z1-10]+\\b";
	        Pattern p1=Pattern.compile(pattern1);
	        Matcher m1=p1.matcher(text);
	        
	        
	        // Compile the pattern into a Pattern object
	        Pattern p = Pattern.compile(pattern);
	        
	        // Create a Matcher object and apply the pattern to the text
	        Matcher m = p.matcher(text);
	        
	        // Search for matches in the text
	        while (m.find()) {
	            System.out.println("Matched: " + m.group());
	        }
	        while (m1.find()) {
	            System.out.println("Matched: " + m1.group());
	        }
	    }
	}


