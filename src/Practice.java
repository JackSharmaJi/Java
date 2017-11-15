import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice {
    public static void main(String... strings) throws Exception {

        String input = "abcdefg10235#@!$!#@%$#^  123abcDSAF";
        String pattern = "\\D";
        Matcher m = Pattern.compile(pattern).matcher(input);
        while(m.find()){
            System.out.println(m.start()+"   "+m.group());
        }

    }
}
