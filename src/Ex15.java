public class Ex15 {
    public static void main(String[] args) {
        int n=123;
        int m=323;
        int i=0;

        while(n!=0){
            i=i*10+n%10;
            n=n/10;
        }
        if(m==i)
            System.out.println("true");
        else{
            System.out.println("false");
        }


    }
}
