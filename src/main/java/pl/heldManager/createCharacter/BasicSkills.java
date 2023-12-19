package pl.heldManager.createCharacter;

import javax.persistence.*;

@Entity
@Table(name = "skills")
public class BasicSkills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int antropologia = 1;
    private int archeologia = 1;
    private int bronPalnaDluga = 25;
    private int charakteryzacja = 5;
    private int bronPalnaKrótka = 20;
    private int elektronika = 1;
    private int elektryka = 10;
    private int gadanina = 5;
    private int historia = 5;
    private int jezykObcy = 1;
    private int jezykOjczysty = 1;
    private int korzystanieZBibliotek = 20;
    private int korzystanieZKomputerów = 5;
    private int księgowość = 5;
    private int mechanika = 10;
    private int majętność = 0;
    private int medycyna = 1;
    private int mityCthulhu = 0;
    private int nasłuchiwanie = 20;
    private int nauka = 1;
    private int nawigacja = 10;
    private int obsługaCiezkiegoSprzetu = 1;
    private int okultyzm = 5;
    private int perswazja = 10;
    private int pierwszaPomoc = 30;
    private int pilotowanie = 1;
    private int pływanie = 20;
    private int prawo = 5;
    private int prowadzenieSamochodu = 20;
    private int psychoanaliza = 1;
    private int psychologia = 10;
    private int rzucanie = 20;
    private int skakanie = 20;
    private int spostrzegawczość = 25;
    private int sztukaRzemiosło = 5;
    private int sztukaPrzetrwania = 10;
    private int slusarstwo = 1;
    private int tropienie = 10;
    private int ukrywanie = 20;
    private int unik = 1;
    private int urokOsobisty = 15;
    private int walkaWręczBijatyka = 25;
    private int wiedzaONaturze = 10;
    private int wspinaczka = 20;
    private int wycena = 5;
    private int zastraszanie = 15;
    private int zrecznePalce = 10;

    public BasicSkills() {
    }
}
