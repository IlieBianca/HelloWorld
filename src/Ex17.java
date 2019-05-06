public class Ex17 {
    public static void main(String[] args) {

        int  x=1234, c, suma=0,suma1=0, i=0,m=0;

        while(x!=0) {
            c = x % 10;
            i++;
            if (i % 2 == 0) {
                suma = suma + c;
            } else {suma1 = suma1 + c;
            }
            x=x/10;
        }
        m=suma-suma1;

        System.out.println(m);
    }
}
