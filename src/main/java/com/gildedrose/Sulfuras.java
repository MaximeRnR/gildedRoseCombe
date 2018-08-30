package com.gildedrose;

class Sulfuras implements UpdateStrategy {

    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    @Override
    public void manageExpiration(SellIn sellIn, Quality quality) {

    }

    @Override
    public void manageDay(SellIn sellIn) {

    }

    @Override
    public void manageQuality(SellIn sellIn, Quality quality) {

    }

    static boolean doesMatch(Item item) {
        return SULFURAS.equals(item.name);
    }
}
