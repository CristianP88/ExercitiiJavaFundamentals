import org.w3c.dom.ls.LSOutput;

import java.util.Date;
import java.util.Scanner;

public class Main {

    //Sa se modeleze cosul de cumparaturi dintr-un supermarket
    //Fiecare produs sa fie reprezentat de un obiect care sa contina nume si pret: ex. mere 5 lei, pere 7 lei, cirese 100 lei
    //Cosul de cumparaturi va fi reprezentat de un array de produse
    //Sa se afiseze un meniu cu produsele dorite
    //Bazat pe ce se introduce la tastatura adaugam in cosul de cumparaturi
    //Sa se calculeze costul total al cosului de cumparaturi
    //Simulam plata pentru cosul de cumparaturi

    public static void main(String[] args) {

        Produs[] cosCumparaturi = new Produs[5];
        System.out.println("Meniu cumparaturi");
        System.out.println("1. Mere");
        System.out.println("2. Matura");
        System.out.println("3. Set de farfurii");
        System.out.println("4. Mustar");
        System.out.println("5. Apa");
        System.out.println("6. Bere");
        System.out.println("7. Suc");
        System.out.println("Va rugam alegeti produsele dorite: ");

        Scanner scanner = new Scanner(System.in);
        int optiune = scanner.nextInt();

        while (optiune != 0) {
            if (optiune == 1) {
                System.out.println("Ati adaugat in cosul de cumparaturi: mere");
                Produs mere = new Produs("mere", 5);
                cosCumparaturi[0] = mere;
                System.out.println("Afisam adaugarea: " + cosCumparaturi[0].getNume() + " si " + cosCumparaturi[0].getPret());
            } else if (optiune == 2) {
                System.out.println("Ati adaugat in cosul de cumparaturi: o matura");
                Produs matura = new Produs("matura", 6);
                cosCumparaturi[1] = matura;
                System.out.println("Afisam adaugarea: " + cosCumparaturi[1].getNume() + " si " + cosCumparaturi[1].getPret());
            } else if (optiune == 3) {
                System.out.println("Ati adaugat in cosul de cumparaturi: un set de farfurii");
                Produs farfurii = new Produs("farfurii", 10);
                cosCumparaturi[2] = farfurii;
                System.out.println("Afisam adaugarea: " + cosCumparaturi[2].getNume() + " si " + cosCumparaturi[2].getPret());
            } else if (optiune == 4) {
                System.out.println("Ati adaugat in cosul de cumparaturi: un mustar");
                Produs mustar = new Produs("mustar", 2);
                cosCumparaturi[3] = mustar;
                System.out.println("Afisam adaugarea: " + cosCumparaturi[3].getNume() + " si " + cosCumparaturi[3].getPret());
            } else if (optiune == 5) {
                System.out.println("Ati adaugat in cosul de cumparaturi: o apa");
                Produs apa = new Produs("apa", 3);
                cosCumparaturi[4] = apa;
                System.out.println("Afisam adaugarea: " + cosCumparaturi[4].getNume() + " si " + cosCumparaturi[4].getPret());
            } else if (optiune == 6) {
                System.out.println("Ati adaugat in cosul de cumparaturi: o bere");
                Produs bere = new Produs("bere", 8);
                cosCumparaturi[5] = bere;
                System.out.println("Afisam adaugarea: " + cosCumparaturi[5].getNume() + " si " + cosCumparaturi[5].getPret());
            } else if (optiune == 7) {
                System.out.println("Ati adaugat in cosul de cumparaturi: un suc");
                Produs suc = new Produs("suc", 5);
                cosCumparaturi[6] = suc;
                System.out.println("Afisam adaugarea: " + cosCumparaturi[6].getNume() + " si " + cosCumparaturi[6].getPret());
            }
            optiune = scanner.nextInt();
        }
        System.out.println("Ati apasat tasta 0. Programul a luat sfarsit. O zi buna !");

        System.out.println("Lungimea cosului de cumparaturi este: " + cosCumparaturi.length);

        System.out.println("Ati cumparat: ");

        for (int cursor = 0; cursor < cosCumparaturi.length; cursor++) {

            if (cosCumparaturi[cursor] != null) {

                //In acest fel afisam numele si pretul fiecarui produs din array
                System.out.println("Produsul este: " + cosCumparaturi[cursor].getNume() + " la pretul de " + cosCumparaturi[cursor].getPret());
            }
        }
        //declaram variabila pentru stocarea pretului in afara buclei FOR deoarece nu dorim resetarea variabilei
        int pretTotal = 0;

        for (int cursor = 0; cursor < cosCumparaturi.length; cursor++) {
            if (cosCumparaturi[cursor] != null) {
                //In acest fel adunam pretul produselor
                pretTotal += cosCumparaturi[cursor].getPret();
            }
        }
        System.out.println("Pretul total este: " + pretTotal);

        System.out.println("S-a platit suma necesara.");
        pretTotal = 0;

        //Sa se reprezinte si produse perisabile, acestea vor avea in plus data expirarii
        //Sa se simuleze din nou un cos de cumparaturi
        //Daca utilizatorul cumpara un produs perisabil si data de expirare este depasita, se va afisa un mesaj "Produs expirat" si nu il vom mai adauga in cos
        //Adaugam alergeni si cand afisam cosul de cumparaturi sa afisam si alergenii
        //Un cos de cumparaturi pentru produsele non-alimentare
        //Un cos de cumparaturi pentru produsele alimentare

        Date dataAstazi = new Date(2020,5,9);
        int pretTotalAlimente = 0;
        int pretTotalNonAlimente = 0;

        ProduseAlimentare[] cosAlimentare = new ProduseAlimentare[10];
        Produs[] cosNonAlimentare = new Produs[10];

        System.out.println("Meniu produse");
        System.out.println("1. Mere");
        System.out.println("2. Carne");
        System.out.println("3. Lapte");
        System.out.println("4. Bec");
        System.out.println("5. Matura");
        System.out.println("6. Pronto");

        optiune = scanner.nextInt();

        while (optiune != 0) {
            if (optiune == 1) {
                System.out.println("Ati ales mere");
                ProduseAlimentare mere = new ProduseAlimentare("mere", 5, "zaharoza, viermi", null);
                cosAlimentare[0] = mere;
            } else if (optiune == 2) {
                System.out.println("Ati ales carne");
                ProduseAlimentare carne = new ProduseAlimentare("Carne", 11, "condimente", new Date(2020, 3, 1));
                cosAlimentare[1] = carne;
            } else if (optiune == 3) {
                System.out.println("Ati  ales lapte");
                ProduseAlimentare lapte = new ProduseAlimentare("Lapte", 4, "lactoza", new Date(2020, 6, 1));
                cosAlimentare[2] = lapte;
            } else if (optiune == 4) {
                System.out.println("Ati ales matura");
                Produs matura = new Produs("matura", 11);
                cosNonAlimentare[0] = matura;
            } else if (optiune == 5) {
                System.out.println("Ati ales becul");
                Produs bec = new Produs("bec", 3);
                cosNonAlimentare[1] = bec;
            } else if (optiune == 6) {
                System.out.println("Ati ales Pronto");
                Produs Pronto = new Produs("Pronto", 8);
                cosNonAlimentare[2] = Pronto;
            } else {
                System.out.println("Optiunea introdusa nu este valida");
            }
            optiune = scanner.nextInt();
        }
        System.out.println("Acestea sunt produsele non alimentare din cos: ");
        for (int cursor = 0; cursor < cosNonAlimentare.length; cursor++) {
            if (cosNonAlimentare[cursor] != null) {
                System.out.println("Produsul este: " + cosNonAlimentare[cursor].getNume() + " iar pretul este: " + cosNonAlimentare[cursor].getPret());
            }
        }
        System.out.println("Acestea sunt produsele alimentare din cos: ");
        for(int cursor = 0; cursor <cosAlimentare.length; cursor++){
            if(cosAlimentare[cursor] != null){
                System.out.println("Produsul este: " +cosAlimentare[cursor].getNume() + " cu pretul de " +cosAlimentare[cursor].getPret() + " Alergeni: " +cosAlimentare[cursor].getAlergeni() + "Data Expirare: " +cosAlimentare[cursor].getDataExpirare());
            if(cosAlimentare[cursor].getDataExpirare().before(dataAstazi)){
                System.out.println("Produsul este expirat si va fi scos din cos");
                cosAlimentare[cursor] = null;
            }
            }
        }
        for(int cursor = 0; cursor < cosAlimentare.length; cursor++){
            if(cosAlimentare[cursor] != null){
                pretTotalAlimente += cosAlimentare[cursor].getPret();
            }
        }
        System.out.println("Pretul total pentru alimente este: " +pretTotalAlimente);

        for(int cursor = 0; cursor < cosNonAlimentare.length; cursor++){
            if(cosNonAlimentare[cursor] != null){
                pretTotalNonAlimente += cosNonAlimentare[cursor].getPret();
            }
        }
        System.out.println("Pretul total pentru non-alimentare este: " +pretTotalNonAlimente);
        System.out.println("Pretul total este: " +(pretTotalAlimente +pretTotalNonAlimente));
    }
    // Sa se reprezinte un calculator care face operatii simple (aduunare, scadere, ...), operatiile stiintifice dar si urmatoarele operatii cu stringuri;
    // -concateneaza 2 stringuri
    // -verifica daca stringul contine un anumit caracter
    // -aduna lungimea a 2 stringuri
    // -verifica daca lungimea unui string este numar par sau impar
    // -transforma un string dintr-un string de caractere
    // -verifica daca stringul incepe cu o vocala
    // -numara spatiile dintr-un string
}