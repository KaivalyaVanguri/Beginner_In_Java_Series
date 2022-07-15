import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patterns {
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile(args[1]);//p
    Matcher matcher = pattern.matcher(args[0]);//s
    boolean matchFound = matcher.find();
    if(matchFound) {
      System.out.println("Match found");
    } else {
      System.out.println("Match not found");
    }
  }
}