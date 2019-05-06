public class Ex11varianta2 {
    public static void main(String[] args){
        int n = 8;
        String numar = null;
        switch (n) {
            case 1:  numar = "unu";
                break;
            case 2:  numar = "doi";
                break;
            case 3:  numar = "trei";
                break;
            case 4:  numar = "patru";
                break;
            case 5:  numar = "cinci";
                break;
            case 6:  numar = "sase";
                break;
            case 7:  numar = "sapte";
                break;
            case 8:  numar = "opt";
                break;
            case 9:  numar = "noua";
                break;

            default : numar = "Invalid number";
                break;
        }


        System.out.println(numar);

    }
}



