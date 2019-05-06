public class Ex12 {
    public static void main(String[] args){
        int n = 7;

        boolean isSpring = n > 2 && n < 6;
        boolean isSummer = n >= 6 && n < 9;
        boolean isAutumn = n >= 9 && n<12;
        boolean isWinter = n < 13 && n >0;


        if (isSpring) {
            System.out.println("primavara");
        } else if (isSummer) {
            System.out.println("vara");
        } else if (isAutumn){
            System.out.println("toamna");
        } else if (isWinter){
            System.out.println("iarna");
        } else {
            System.out.println("incorect");
        }
    }
}
