import java.util.Arrays;

public class DebugAcademie {
    public static void main(String[] args) {
//        int n = 7;
//
//        boolean isSpring = n > 2 && n < 6;
//        boolean isSummer = n >= 6 && n < 9;
//        boolean isWinter = n < 13 && n > 0;
//
//        if (isSpring) {
//            System.out.println("primavara");
//        } else if (isSummer) {
//            System.out.println("vara");
//        } else if (n >= 9 && n < 12){
//            System.out.println("toamna");
//        } else if (isWinter){
//            System.out.println("iarna");
//        } else {
//        System.out.println("incorect");
//        }
//-------------------------------------------------------------------
//
//        int[] numere = {3,4,5,6,7,8};
//        //            0   1   2   3
//        //numerele care au indexul par
//
//        for (int i = 0; i < numere.length; i++) { //fara if si scriem aici i=i+2
//            //sa le afisez
//            // sa le dublez
//            //le afisez iar
//            if (i % 2 == 1) {
//                continue;
//            }
//            int nrIndexPar = numere[i];
//            System.out.println(nrIndexPar);
//            int nrDublat = nrIndexPar * 2;
//            numere[i] = nrDublat;
//            System.out.println(nrDublat);
//        }
//         int j=0;
//        while(j<numere.length){
//            int nrIndexPar = numere[j];
//            System.out.println(nrIndexPar);
//            int nrDublat = nrIndexPar * 2;
//            numere[j] = nrDublat;
//            System.out.println(nrDublat);
//
//            j=j+2;
//        }
//        System.out.println(Arrays.toString(numere));
//    }
//
//
//}

//---------------------------------------------
        int[] listaMica = {5, 1};
        int[] listaMare = {3, 4, 5};

        int max= Integer.MIN_VALUE;//declaram cu opusul
        for (int i = 0; i < listaMica.length; i++) {
            int nrListaMica = listaMica[i];
            for (int j = 0; j < listaMare.length; j++) {
                if (listaMare[j] != nrListaMica) {
                    continue;
                }
                //max=max>=nrListaMica? max: nrListaMica;
                if (nrListaMica > max) {
                    max = nrListaMica;

                }
                System.out.println(nrListaMica);
                break;//actioneaza pt for ul cu j
                }
            }
            System.out.println();

//1.Vreau sa se printeze nr care sunt in ambele liste


        }
        System.out.println(max);
    }
}
