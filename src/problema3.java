public class problema3 {
    public static void main(String[] args) {


        int[] lista = {8,4,9,1,2,222};
        int key=4,low=0,high=5,index=0;
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[i] > lista[j]) {

                    int temp = lista[i];
                    lista[i] = lista[j];
                    lista[j] = temp;
                }
            }
        }
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i]+" ");
        }
        while (low <= high) {
           int mid = (low + high) / 2;
            if (mid < key) {
                low = mid + 1;
            } else if (mid > key) {
                high = mid - 1;
            } else if (mid == key) {
                index = mid;
                break;
            }
        }
        System.out.println(index);
    }
}


