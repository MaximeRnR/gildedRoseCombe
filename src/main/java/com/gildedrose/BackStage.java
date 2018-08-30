package com.gildedrose;

class BackStage implements UpdateStrategy {

    private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";

    @Override
    public void manageQuality(SellIn sellIn, Quality quality) {
       quality.increase();
        if (sellIn.value < 10) {
           quality.increase();
        }
        if (sellIn.value < 5) {
           quality.increase();
        }
        manageExpiration(sellIn, quality);
    }

    @Override
    public void manageDay(SellIn sellIn) {
        sellIn.value -= 1;
    }

    @Override
    public void manageExpiration(SellIn sellIn, Quality quality) {
        if (sellIn.value < 0) {
           quality.setToZero();
        }
    }

    static boolean doesMatch(Item item) {
        return BACKSTAGE_PASSES.equals(item.name);
    }
}
