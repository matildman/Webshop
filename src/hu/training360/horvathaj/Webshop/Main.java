package hu.training360.horvathaj.Webshop;

import java.util.Random;
import java.util.Scanner;
import java.util.List;

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

        ShopItems items = new ShopItems();

        //ShopItem teliSzalami = new ShopItem("Téliszalámi", 2000, false);

        items.addItem( "Téliszalámi", 2000, false );
        items.addItem("Gumikacsa", 3000, false);
        items.addItem("Uborka", 2800, true);
        items.addItem("Gesztenye", 1000, true);

        int kosarErtek = 0;

        for (ShopItem currentItem : items.getItems() ) {
            kosarErtek += currentItem.setCount();
        }

        for (ShopItem currentItem : items.getItems() ) {
            System.out.println(currentItem.getItemData());
        }

        KedvezmenyMegapack kedvMega = new KedvezmenyMegapack();
        for (ShopItem currentItem : items.getItems() ) {
            kedvMega.megapackSzamol(currentItem);
            System.out.println("Halmozott Megapack kedvezmény: "+kedvMega.getSumMegapack());
        }

        KedvezmenyKettoHarom kedvKettoHarom = new KedvezmenyKettoHarom();
        for (ShopItem currentItem : items.getItems() ) {
            kedvKettoHarom.kettoHaromSzamol(currentItem);
            System.out.println("Halmozott kettő=három kedvezmény: "+kedvKettoHarom.getSumKettoHarom());
        }

        System.out.println("Kettő=három kedvezmény összesen: "+kedvKettoHarom.getSumKettoHarom());
        System.out.println("Megapack kedvezmény érték összesen: "+kedvMega.getSumMegapack());

        System.out.println("Kosár kedvezmény néklüli értéke: "+ kosarErtek);
        if (kedvMega.getSumMegapack() > kedvKettoHarom.getSumKettoHarom()) {
            System.out.println("Megapack kedvezmény érvényesítés: "+ kedvMega.getSumMegapack());
            System.out.println("Kosár kedvezményes értéke: "+ (kosarErtek-kedvMega.getSumMegapack()) );
        }
        else {
            System.out.println("Kettő=három kedvezmény érvényesítés: "+ kedvKettoHarom.getSumKettoHarom());
            System.out.println("Kosár kedvezményes értéke: "+ (kosarErtek-kedvKettoHarom.getSumKettoHarom()) );
        }

    }
}
