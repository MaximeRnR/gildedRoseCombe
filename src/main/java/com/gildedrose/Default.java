package com.gildedrose;

class Default implements UpdateStrategy {

    @Override
    public void manageQuality(SellIn sellIn, Quality quality) {
        quality.decrease();
        manageExpiration(sellIn, quality);
    }

    @Override
    public void manageDay(SellIn sellIn) {
        sellIn.decrease();
    }

    @Override
    public void manageExpiration(SellIn sellIn, Quality quality) {
        if (sellIn.value < 0) {
            quality.decrease();
        }
    }
}
