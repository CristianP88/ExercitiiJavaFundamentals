public class Trainee {
   private String nume;                 //definim (initializam) variabila 1
   private int stamina = 500;          //definim (initializam) variabila 2
   private int strength = 50;           //definim variabila 3

    public Trainee(String ion){                   // acesta este constructor-ul default
        this.nume = nume;

    }
    public void cardio(){
        System.out.println("Am inceput cardio");
        System.out.println("Ard 300 de calorii");
        stamina-=30;
        strength+=10;
    }
    public void bodyPump(){
        System.out.println("Am inceput bodyPump");
        System.out.println("Ard 500 de calorii");
        stamina-=50;
        strength+=10;
    }
    public void box(){
        System.out.println("Am inceput box");
        System.out.println("Ard 250 calorii");
        stamina-=70;
        strength+=10;
    }
    public String getNume(){
        return nume;
    }
    public int getStamina(){
        return stamina;
    }
    public int getStrength(){
        return strength;
    }
}
