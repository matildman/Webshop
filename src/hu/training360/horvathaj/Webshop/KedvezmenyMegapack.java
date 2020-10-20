package hu.training360.horvathaj.Webshop;

public class KedvezmenyMegapack {

   public int MegapackSzamol(ShopItem OneItem) {

       int szamoltKedv;
       szamoltKedv = 0;

       if (OneItem.isMegapack() )
       {
           szamoltKedv = OneItem.getCount() / 12;
       }
        return szamoltKedv;
   }

}
