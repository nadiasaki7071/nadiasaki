public class tamirin5 {

    public static void main(String[] args) {
        String s = "salam nadia hastama";
        int length = lenghthchar(s);
        System.out.println("length : " + length);
    }

    public static Integer lenghthchar(String str) {
        int c = 0;
        for (int i = str.length() - 1; i > 0; i--) {
            String char1= str.substring(i, i + 1);
            if (char1.equals(" ")) {
                String s1 = str.substring(i + 1, str.length());
                c = s1.length();
                break;
            }
        }
        if (!str.contains(" ")){
            c=str.length();
        }
        return c;
    }

    /*public static void main(String[] args) {
        int num = 105;
        int calVar = calculate(num);
        if (calVar == 2) {
            System.out.println(num+ " aval ast  ");
        } else {
            System.out.println( num+ " aval nist ");
        }
    }
    private static Integer calculate(int num1) {
        int x = 0;
        for (int i = 1; i <= num1; i++) {
            if ((num1 % i) == 0) {
                x++;
            }
        }
        return x;
    }*/


    /*public static void main(String[] args) {
        int num = 123456789;
        String str = String.valueOf(num);
        Boolean i = survey(str);
        if (i) {
            System.out.println("متقارن");
        } else {
            System.out.println("نامنقارن");
        }
    }

    public static Boolean survey(String str1) {
        int mid = str1.length() / 2;
        Boolean bool = true;
        System.out.println(str1);
        for (int i = 0; i <= mid; i++) {
            String s = str1.substring(i, i + 1);
            String s1 = str1.substring(str1.length() - (i + 1), str1.length() - (i));
            int oneInt = Integer.valueOf(s);
            int twoInt = Integer.valueOf(s1);
            if (oneInt != twoInt) {
                bool= false;
                break;
            }
        }
        return bool;
    }
*/
}
