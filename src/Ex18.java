public class Ex18 {
    public static void main(String[] args) {
        char n = 'C';
        String pcardinal = null;
        if (n == 'N') {
            pcardinal = "Nord";
        } else if (n == 'V') {
            pcardinal = "Vest";
        } else if (n == 'S') {
            pcardinal = "Sud";
        } else if (n == 'E') {
            pcardinal = "Est";
        } else {
            pcardinal = "Nu exista";
        }
        System.out.println(pcardinal);


    }
}
