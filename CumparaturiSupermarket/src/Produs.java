public class Produs {

     //Atribuim de fiecare data un parametru atributelor
     //atribute si comportament
    protected String nume;
    protected int pret;

    public Produs(){ //introducem de fiecare data un parametru default

    }

    public Produs(String nume, int pret){

        //asignarea valorilor

        this.nume = nume;
        this.pret = pret;
    }

     //metode care te lasa sa le scoti inafara altor metode (getter si setter)
    public int getPret(){
        return pret;
    }

    public String getNume(){
        return nume;
    }
}
