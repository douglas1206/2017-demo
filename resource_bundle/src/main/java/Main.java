
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException {
        Locale locale = new Locale("zh", "TW");
        ResourceBundle bundle = ResourceBundle.getBundle("ftguang", locale);


        byte[] bs = bundle.getString("name").getBytes();
        String ss = new String(bs,"ISO8859-1");
        System.out.println(ss);

        ResourceBundle usBundle = ResourceBundle.getBundle("ftguang", Locale.getDefault());
        System.out.println(usBundle.getString("name"));

        Locale locale1 = new Locale("en", "US");
        System.out.println(ResourceBundle.getBundle("ftguang", locale1).getString("name"));

        System.out.println(ResourceBundle.getBundle("ftguang").getString("name"));
    }
}
