package hu.training360.horvathaj.Webshop;

public class KedvezmenyMegapack {

   public int megapackSzamol(ShopItem oneItem) {

       int szamoltKedv;
       szamoltKedv = 0;

       if (oneItem.isMegapack() )
       {
           szamoltKedv = oneItem.getCount() / 12;
       }
        return szamoltKedv;
   }

}
