import java.util.Scanner;

public class Main {

    //Vrem sa se modeleze comportamentul unui calculator simplu (adunare, scadere, inmultire si impartire)
    //Calculatorul sa fie reprezentat folosind programarea orientata obiect.

    public static void main(String[] args) {
        //daca avem o metoda de tip static nu mai avem nevoie sa instantiem
        Calculator calculator = new Calculator();

        System.out.println(" Rezultatul adunarii este: " + calculator.adunare(5, 10));

        System.out.println(" Rezultatul scaderii este: " + calculator.scadere(10, 5));

        int inmultire = calculator.inmultire(2, 2);
        System.out.println("Rezultatul inmultirii este: " + inmultire);

        int impartire = calculator.impartire(10, 2);
        System.out.println("Rezultatul impartirii este: " + impartire);

        //De aici citim valorile de la tastatura
        //Obiectul care ne ajuta sa facem acest lucru se numeste "Scanner"

        Scanner scanner = new Scanner(System.in);
        //Citeste primul numar de la tastatura
        System.out.println("Va rugam introduceti primul numar: ");
        int primulNumar = scanner.nextInt();
        //Citeste al doilea numar de la tastatura
        System.out.println("Va rugam introduceti al doilea numar: ");
        int alDoileaNumar = scanner.nextInt();

        System.out.println("Numerele introduse de dumneavoastra sunt: " + primulNumar + " si " + alDoileaNumar);

        int adunare = calculator.adunare(primulNumar, alDoileaNumar);
        System.out.println("Rezultatul adunarii este: " + adunare);

        int scadere = calculator.scadere(primulNumar, alDoileaNumar);
        System.out.println("Rezultatul scaderii este: " + scadere);
        inmultire = calculator.inmultire(primulNumar, alDoileaNumar);
        System.out.println("Rezultatul inmultirii este: " + inmultire);
        impartire = calculator.impartire(primulNumar, alDoileaNumar);
        System.out.println("rezultatul impartirii este: " + impartire);

        //Sa se modele un calculator stiintific care sa permita operatiile calculatorului simplu si pe langa asta urmatoarele operatii:
        // - un numar ridicat la puterea altui numar;
        // - radical dintr-un numar;
        // - logaritm in baza 10 dintr-un numar;
        // - logaritm dintr-un numar;

        CalculatorStiintific calculatorStiintific = new CalculatorStiintific();

        System.out.println("Rezultatul adunarii este: " + calculatorStiintific.adunare(10, 10));
        System.out.println("Rezultatul scaderii este: " + calculatorStiintific.scadere(40, 20));
        System.out.println("Rezultatul inmultirii este: " + calculatorStiintific.inmultire(5, 10));
        System.out.println("Rezultatul impartirii este: " + calculatorStiintific.impartire(10, 5));

        // - un numar ridicat la puterea altui numar
        double ridicareLaPutere = calculatorStiintific.ridicareLaPutere(4, 5);
        System.out.println("Rezultatul ridicarii la putere este: " + ridicareLaPutere);

        // - radical dintr-un numar
        double radicalDinNumar = calculatorStiintific.radicalDinNumar(9);
        System.out.println("Rezultatul radicalului este: " + radicalDinNumar);

        // - logaritm in baza 10 dintr-un numar

        double logaritBaza10 = calculatorStiintific.logaritBaza10(50);
        System.out.println("Rezultatul logaritmului in baza 10 este: " + logaritBaza10);

        // - logaritm dintr-un numar

        double logaritmNumar = calculatorStiintific.logaritmNumar(20);
        System.out.println("Rezultatul logaritmului dintr-un numar este: " + logaritmNumar);

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Va rugam introduceti primul numar pentru ridicarea la putere");
        primulNumar = scanner1.nextInt();

        System.out.println("Va rugam introduceti al doilea numar pentru ridicarea la putere");
        alDoileaNumar = scanner1.nextInt();

        ridicareLaPutere = calculatorStiintific.ridicareLaPutere(primulNumar, alDoileaNumar);
        System.out.println("Rezultatul ridicarii la putere al numerelor " + primulNumar + " si " + alDoileaNumar + " este: " + ridicareLaPutere);

        System.out.println("Va rugam introduceti primul numar pentru calcularea radicalului");
        primulNumar = scanner1.nextInt();
        System.out.println("Rezultatul calcularii radicalului numarului " + primulNumar + " este: " + calculatorStiintific.radicalDinNumar(primulNumar));

        System.out.println("Va rugam introduceti numarul pentru calcularea logaritmului in baza 10");
        primulNumar = scanner1.nextInt();
        System.out.println("Rezultatul calcularii logaritmului in baza 10 a numarului " + primulNumar + "este: " + calculatorStiintific.logaritBaza10(primulNumar));

        System.out.println("Va rugam introduceti numarul pentru calcularea logaritmului");
        primulNumar = scanner1.nextInt();
        System.out.println("Rezultatul calcularii logaritmului " + primulNumar + " este: " + calculatorStiintific.logaritmNumar(primulNumar));

        //Sa se introduca 2 numere
        //Afisam numerele
        // Sa se afiseze meniul
        //1. Adunare
        //2. Inmultire
        //3. Radical
        //4. Scadere
        //Afisam mesajul: "Va rugam alegeti o optiune"
        //In functie de optiunea aleasa se realizeaza operatia respectiva, daca operatia presupune folosirea unui singur numar,
        //  --facem operatia si pentru al doilea nuamr
        //Afisam rezultatul

        int optiune = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Va rugam introduceti cele 2 numere");
        primulNumar = sc.nextInt();
        alDoileaNumar = sc.nextInt();
        System.out.println("Numerele introduse sunt: " + primulNumar + " si " + alDoileaNumar);
        System.out.println("Meniu");
        System.out.println("1. Adunare");
        System.out.println("2. Inmultire");
        System.out.println("3. Radical");
        System.out.println("4. Scadere");
        System.out.println("Va rugam alegeti o optiune");
        optiune = sc.nextInt(); //Utilizatorul introduce o optiune de la tastatura

        while (optiune != 9) {  //daca utilizatorul introduce orice al numar in afara de 9, programul scaneaza pana se introduce numarul 9
            if (optiune == 1) {
                System.out.println("S-a ales optiunea adunare");
                System.out.println("Rezultatul adunarii este: " + calculatorStiintific.adunare(primulNumar, alDoileaNumar));
            } else if (optiune == 2) {
                System.out.println("S-a ales optiunea 2");
                System.out.println("Rezultatul inmultirii este: " + calculatorStiintific.impartire(primulNumar, alDoileaNumar));
            } else if (optiune == 3) {
                System.out.println("S-a ales optiunea 3");
                System.out.println("Rezultatul calcularii radicalului primului numar este: " + calculatorStiintific.radicalDinNumar(primulNumar));
                System.out.println("Rezultatul calcularii radicalului celui de-al doilea numar este: " + calculatorStiintific.radicalDinNumar(alDoileaNumar));
            } else if (optiune == 4) {
                System.out.println("S-a ales optiunea 4");
                System.out.println("Rezultatul scaderii este: " + calculatorStiintific.scadere(primulNumar, alDoileaNumar));
            } else {
                System.out.println("Nu gasim optiunea aleasa de dumneavoastra !");
            }
            optiune = sc.nextInt();
        }
        System.out.println("Ne pare rau. Ati apasat tasta 9. Am iesit din program; O zi buna !");

        Scanner string = new Scanner(System.in);
        System.out.println("Va rugam introduceti primul String");
        String primulString = string.nextLine();
        System.out.println("Ati introdus primul string: " +primulString);
        System.out.println("Va rugam introduceti al doilea string");
        String alDoileaString = string.nextLine();
        System.out.println("Ati introdus al doilea string: " +alDoileaString);

        CalculatorString calculatorString = new CalculatorString();
        System.out.println("Concatenarea stringurilor este: " +calculatorString.concatenare(primulString, alDoileaString));

        System.out.println("Verificam daca stringul contiune un anumit caracter: " +calculatorString.contineCaracter(primulString, 'v'));

        System.out.println("Adunarea celor doua stringuri este: " +calculatorString.adunareStringuri(primulString, alDoileaString));

        System.out.println("Verificam daca lungimea unui string este par sau impar: " +calculatorString.stringParImpar(primulString));

        char[] sirCaractere = calculatorString.sirCaractere(primulString);
        for(int cursor = 0; cursor < sirCaractere.length; cursor++){
            System.out.println("Afisam caracterele stringului " +sirCaractere[cursor]);
        }

        System.out.println("Verificam daca stringul incepe cu o vocala: " +calculatorString.vocala(primulString));

        System.out.println("Numaram spatiile dintr-un string: " +calculatorString.spatiiString(alDoileaString));
    }
    }

          //TEMA (rezolvat in clasa main - mai sus + clasa CalculatorString)
          //sa se reprezinte un calculator care face operatiile simple (adunare, scadere, inmultire, impartire), operatiile stiintifice (ridicare la putere, radical, logaritm in baza 10, logaritm) dar si urmatorele operatii cu stringuri:
          //concateneaza 2 stringuri
          //verifica daca stringul contine un anumit caracter
          //aduna lungimea a 2 stringuri
          //verifica daca lungimea unui string este numar par sau impar
          //transforma un string intr-un sir de caractere
          //verifica daca stringul incepe cu o vocala
          //numara spatiile dintr-un string
