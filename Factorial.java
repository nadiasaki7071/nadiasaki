public class Factorial {
    public static void main(String[] args) {
        System.out.println(Fac(4));
    }
    public static int Fac(int x){
        int i=1;
        int fact=1;
        while (i<=x){
            fact=fact* i;
            i++;
        }
        return fact;
    }

}
