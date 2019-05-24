public class CaloriferMain {
    public static void main(String[] args) {

        Calorifer calorifer = new Calorifer(331, "Ferroli", "Alb");
        Calorifer altCalorifer = new Calorifer(559, "Cambridge", "Gri");
        System.out.println(altCalorifer.marca);
        System.out.println(altCalorifer.pret);
        System.out.println(calorifer.marca);
        System.out.println(calorifer.pret);

    }
}
