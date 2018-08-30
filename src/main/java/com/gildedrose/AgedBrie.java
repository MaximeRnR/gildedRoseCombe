package com.gildedrose;

class AgedBrie implements UpdateStrategy{

    private static final String AGED_BRIE = "Aged Brie";

    @Override
    public void manageQuality(SellIn sellIn, Quality quality) {
        quality.increase();
        manageExpiration(sellIn, quality);
    }

    @Override
    public void manageDay(SellIn sellIn) {
        sellIn.value -= 1;
    }

    @Override
    public void manageExpiration(SellIn sellIn, Quality quality) {
        if (sellIn.value < 0) {
            quality.increase();
        }
    }

    static boolean doesMatch(Item item) {
        return AGED_BRIE.equals(item.name);
    }
}
