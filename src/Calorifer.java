public class Calorifer {
    int pret;
    String marca;
    String culoare;
    static String A;

    //constructor+MainCalorifer
    public Calorifer (){

    }

    public Calorifer(int pretCalorifer,String marcaCalorifer, String culoareCalorifer){
        pret=pretCalorifer;
        marca=marcaCalorifer;
        culoare=culoareCalorifer;
    }
    //setter
    public void setMarca(String marca) {

        this.marca= marca;
    }
    //getter
    public int getPret() {

        return pret;
    }
    //metode
    void alegeMarca (String newMarca){

        marca=newMarca;
    }

    void alegeCuloare(String newCuloare){

        culoare=newCuloare;
    }

    void pret(int newPret){

        pret=newPret;
    }
}
