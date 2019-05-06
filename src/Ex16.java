public class Ex16 {
    public static void main(String[] args) {

        int  x=1234, c, suma=0, i=0;

        while(x!=0){
            c=x%10;
            i++;
            if(i%2==0) suma=suma+c;
            x=x/10;
        }

        System.out.println(suma);
    }
}
