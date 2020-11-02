package hu.training360.horvathaj.Webshop;

public class KedvezmenyMegapack {

    private int sumMegapack = 0;

    public int getSumMegapack() {
        return sumMegapack*6000;
    }

    public void setSumMegapack(int sumMegapack) {
        this.sumMegapack = sumMegapack;
    }

    public void megapackSzamol(ShopItem oneItem) {

       int szamoltKedv = 0;

       if (oneItem.isMegapack() )
       {
           szamoltKedv = oneItem.getCount() / 12;
       }
       this.sumMegapack += szamoltKedv;
   }

}
