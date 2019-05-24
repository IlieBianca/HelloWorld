public class MainCaine {
    public static void main(String[] args) {
        Caine dog =new Caine(1000,"Bichon","alb");
        Caine anotherDog = new Caine(200,"Buldog","negru");
        System.out.println(anotherDog.culoare);
        System.out.println(dog.culoare);
        System.out.println(anotherDog.rasa);

    }

}
