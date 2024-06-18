import java.util.Locale;

public class app {
    public static void main(String[] args) {
        long age = 100;
        int height = 150;
        long birthyear = 1991;
        long max = Long.MAX_VALUE;
        float f3 = 12.36f;
        double f4 = 12.659876;
        boolean b1 = true;
        char c1 = 'a';
        String str = "salam";
        String s = new String("hello");
        System.out.println(str.length());
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(s.length() - 1));
        System.out.println(s + str);
        System.out.println(s.concat(str));
        System.out.println(str.equals(s));
        System.out.println(str.equalsIgnoreCase(s));
        System.out.println(str.replace('s', '2'));
        String str1=String .format ("hello to %s my age  %d","nadia",32);
        System.out.println(str1.toUpperCase(Locale.ROOT));
        String str3=str1.toUpperCase(Locale.ROOT);
        System.out.println(str3.replace("NADIA","fanap"));


//        String[] s1=str2.split("");
//        System.out.println(Arrays.toStrings(s1));


    }
}
