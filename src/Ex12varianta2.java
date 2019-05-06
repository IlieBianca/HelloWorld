public class Ex12varianta2 {
    public static void main(String[] args){
        int n=2;
        String anotimp=null;

        switch(n){
            case 12:
            case 1:
            case 2:
                anotimp="Iarna";
                break;
            case 3:
            case 4:
            case 5:
                anotimp="Primavara";
                break;
            case 6:
            case 7:
            case 8:
                anotimp="Vara";
                break;
            case 9:
            case 10:
            case 11:
                anotimp="Toamna";
                break;
            default:
                anotimp="Nu exista";
                break;
        }
        System.out.println(anotimp);
    }
}
