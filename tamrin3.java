import java.util.Locale;

public class tamrin3 {
    public static void main(String[] args) {

        String str1=String .format ("hello to %s my age  %d","nadia",32);
        String str3=str1.toUpperCase(Locale.ROOT);
        System.out.println(str3.replace("NADIA","fanap"));

    }
}