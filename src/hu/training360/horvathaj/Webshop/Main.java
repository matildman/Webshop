package hu.training360.horvathaj.Webshop;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*Készíts egy Java konzol alkalmazást, ami egy webshop kedvezménykezelését szimulálja.
        Az alábbi kedvezmény típusok léteznek:

        * 2=3: kettőt fizet, hármat kap. Ha a kosárban van legalább 3 egyforma termék, akkor 3
        termékenként 1 termék árát kedvezményként jóvá kell írni.

        * megapack ­6000: vannak nagy kiszerelésű, megapack típusú termékek. Ha ilyen termékből
        egy teljes kartonnal (12 db) vásárol, akkor 6000 Ft kedvezményt kap kartononként.

        A kedvezménytípusok nem összevonhatóak, mindig a legnagyobb kedvezményt nyújtót kell
        figyelembe venni az egész kosárra. Egy kedvezménytípus ugyanakkor több kedvezményt is
        nyújthat. Pl. ha vesz 7 gumicsirkét és 4 téliszalámit, akkor 2 gumicsirke és 1 téliszalámi
        értéke a kedvezmény a 2=3 kedvezménytípus esetén. Hasonlóan, ha megapack uborkából
        vesz 12­őt, megapack gesztenyéből pedig 24­et, akkor 3­szor 6000 Ft a kedvezmény a
        megapack ­6000 kedvezménytípus esetén. A kedvezénytípusok könnyen bővíthetőek
        legyenek.
                A terméklista fix, az alábbi termékek léteznek (a kódban legyen beégetve):
        * név: téliszalámi, ár: 2000, megapack: nem
        * név: gumikacsa, ár: 3000, megapack: nem
        * név: megapack uborka, ár: 2800, megapack: igen
        * név: megapack gesztenye, ár: 1000, megapack: igen

        Az alkalmazás kérje be a konzolon termékenként a termékek darabszámát. A válaszban
        jelenítse meg az eredeti bekért adatokat a megadott darabszámokkal, ez alá írja ki a kosár eredeti
        árát, kedvezményes árát és a kedvezmény típus nevét*/


        ShopItem TeliSzalami = new ShopItem("Téliszalámi", 2000, false);
        ShopItem GumiKacsa   = new ShopItem("Gumikacsa", 3000, false);
        ShopItem Uborka = new ShopItem("Uborka", 2800, true);
        ShopItem Gesztenye = new ShopItem("Gesztenye", 1000, true);

        int darab;
        int kosarErtek = 0;
        Scanner reader= new Scanner(System.in);

        System.out.println("Téliszalámi mennyiség: ");
        darab = reader.nextInt();
        TeliSzalami.setCount(darab);
        kosarErtek += darab*TeliSzalami.getPrice();

        System.out.println("Gumikacsa mennyiség: ");
        darab = reader.nextInt();
        GumiKacsa.setCount(darab);
        kosarErtek += darab*GumiKacsa.getPrice();

        System.out.println("Uborka mennyiség: ");
        darab = reader.nextInt();
        Uborka.setCount(darab);
        kosarErtek += darab*Uborka.getPrice();

        System.out.println("Gesztenye mennyiség: ");
        darab = reader.nextInt();
        Gesztenye.setCount(darab);
        kosarErtek += darab*Gesztenye.getPrice();

        System.out.println(TeliSzalami.getItemData());

        System.out.println(GumiKacsa.getItemData());

        System.out.println(Uborka.getItemData());

        System.out.println(Gesztenye.getItemData());

        KedvezmenyMegapack KedvMega = new KedvezmenyMegapack();
        int sumMegapack = 0;
        sumMegapack += KedvMega.MegapackSzamol(TeliSzalami);
        System.out.println("Halmozott Megapack kedvezmény: "+sumMegapack);
        sumMegapack += KedvMega.MegapackSzamol(GumiKacsa);
        System.out.println("Halmozott Megapack kedvezmény: "+sumMegapack);
        sumMegapack += KedvMega.MegapackSzamol(Uborka);
        System.out.println("Halmozott Megapack kedvezmény: "+sumMegapack);
        sumMegapack += KedvMega.MegapackSzamol(Gesztenye);
        System.out.println("Halmozott Megapack kedvezmény: "+sumMegapack);

        //System.out.println("Megapack kedvezmény darab összesen: "+sumMegapack);
        //System.out.println("Megapack kedvezmény érték összesen: "+sumMegapack*6000);

        KedvezmenyKettoHarom KedvKettoHarom = new KedvezmenyKettoHarom();
        int sumKettoHarom = 0;
        sumKettoHarom += KedvKettoHarom.KettoHaromSzamol(TeliSzalami);
        System.out.println("Halmozott kettő=három kedvezmény: "+sumKettoHarom);
        sumKettoHarom += KedvKettoHarom.KettoHaromSzamol(GumiKacsa);
        System.out.println("Halmozott kettő=három kedvezmény: "+sumKettoHarom);
        sumKettoHarom += KedvKettoHarom.KettoHaromSzamol(Uborka);
        System.out.println("Halmozott kettő=három kedvezmény: "+sumKettoHarom);
        sumKettoHarom += KedvKettoHarom.KettoHaromSzamol(Gesztenye);
        System.out.println("Halmozott kettő=három kedvezmény: "+sumKettoHarom);

        //System.out.println("Kettő=három kedvezmény összesen: "+sumKettoHarom);

        System.out.println("Kettő=három kedvezmény összesen: "+sumKettoHarom);
        System.out.println("Megapack kedvezmény érték összesen: "+sumMegapack*6000);

        System.out.println("Kosár kedvezmény néklüli értéke: "+ kosarErtek);
        if (sumMegapack*6000 > sumKettoHarom) {
            System.out.println("Megapack kedvezmény érvényesítés: "+ sumMegapack*6000);
            System.out.println("Kosár kedvezményes értéke: "+ (kosarErtek-sumMegapack*6000) );
        }
        else {
            System.out.println("Kettő=három kedvezmény érvényesítés: "+ sumKettoHarom);
            System.out.println("Kosár kedvezményes értéke: "+ (kosarErtek-sumKettoHarom) );
        }


    }
}
