package hu.training360.horvathaj.Webshop;

public class KedvezmenyKettoHarom {

    private int sumKettoHarom = 0;

    public int getSumKettoHarom() {
        return sumKettoHarom;
    }

    public void setSumKettoHarom(int sumKettoHarom) {
        this.sumKettoHarom = sumKettoHarom;
    }

    public void kettoHaromSzamol(ShopItem oneItem) {

        int szamoltKedv;
        szamoltKedv = 0;

        if (!oneItem.isMegapack() )
            szamoltKedv = (oneItem.getCount() / 3) * oneItem.getPrice();
        this.sumKettoHarom += szamoltKedv;
    }
}
