public class Caine {
    int pret;
    String rasa;
    String culoare;
    static String A;

//constructor+MainCaine
    public Caine(){

    }

    public Caine(int pretCaine,String rasaCaine, String culoareCaine){
        pret=pretCaine;
        rasa=rasaCaine;
        culoare=culoareCaine;
    }
//setter
    public void setRasa(String rasa) {
        this.rasa = rasa;
    }
//getter
    public int getPret() {
        return pret;
    }
//metode
    void alegeRasa (String newRasa){
        rasa=newRasa;
    }

    void alegeculoare(String newCuloare){
        culoare=newCuloare;
    }

    void pret(int newPret){
        pret=newPret;
    }
}
