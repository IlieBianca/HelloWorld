public class BubbleSort {
    public static void main(String[] args) {


        int[] lista = {8, 4, 9, 1, 2, 222};
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = i + 1; j < lista.length; j++)
                if (lista[i] > lista[j]) {

                    int temp = lista[i];
                    lista[i] = lista[j];
                    lista[j] = temp;
                }
        }
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i]+" ");
        }
    }
}

