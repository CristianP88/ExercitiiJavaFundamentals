import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //sa se modeleze o sedinta de training
        //Vom avea:
             //Trainee(student)
             //Nume
             //Stamina
             //Strength
             //O sa se antreneze lunea, miercurea, si vinerea
             //O sa porneasca cu stamina 1000
             //De fiecare data stamina o sa-i scada
             //De fiecare data puterea o sa ii creasca
             //porneste cu puterea 50
             //Lunea - cardio;
             //Ati ars 300 de calorii
             //Miercurea - body pump
             //Ati ars 500 de calorii
             //Vinerea - box
             //Ati ars 250 de calorii
             //Cardio scade stamina cu 30
             //Body pump scade stamina cu 50
             //Box scade stamina cu 70
             //Stamina > 0
             //Puterea va creste de fiecare data cu 10
        Scanner name = new Scanner(System.in);                                                                                     //vrem ca sa nu-l cheme de fiecare data la fel si sa-i dam un alt nume
        System.out.println("Va rugam introduceti numele trainee-ului");
        String nume=name.nextLine();
        Trainee ion = new Trainee(nume);

        Scanner zi = new Scanner(System.in);
        System.out.println("Introduceti ziua curenta");
        String ziCurenta = zi.nextLine();
        while((ziCurenta.equals("Luni") || ziCurenta.equals("Miercuri") || ziCurenta.equals("Vineri")) && ion.getStamina()>0){           //aici verificam daca ziua curenta este (cutare);
            switch (ziCurenta){
                case "Luni":
                    ion.cardio();
                    System.out.println("Stamina a ajuns la: "+ion.getStamina());
                    break;
                case "Miercuri":
                    ion.bodyPump();
                    System.out.println("Stamina a ajuns la: "+ion.getStamina());
                    break;
                case "Vineri":
                    ion.box();
                    System.out.println("Stamina a ajuns la: "+ion.getStamina());
                    break;
                default:
                    System.out.println("Nu am gasit ziua curenta"); break;
            }
            ziCurenta = zi.nextLine();
        }
        if(!ziCurenta.equals("Luni") || (!ziCurenta.equals("Miercuri")) || (!ziCurenta.equals("Vineri"))){                                                                                                  // semnul "!" in interiorul conditiei, inseamna not equals
            System.out.println("Ati introdus o zi in care nu se antreneaza: " +ziCurenta);
        }
        if(ion.getStamina() <= 0){
            System.out.println("Trainee-ul" +ion.getNume() + " a obosit");                                                              //concatenam numele trainee-ului ca sa-l introducem de la tastatura
        }
        System.out.println("Puterea trainee-ului " +ion.getNume() + " a ajuns la " +ion.getStrength());

    }
}
