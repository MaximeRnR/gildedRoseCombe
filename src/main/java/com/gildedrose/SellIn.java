package com.gildedrose;

class SellIn {

    public int value;

    private SellIn(int sellIn) {
        value = sellIn;
    }

    public static SellIn of(int sellIn) {
                return new SellIn(sellIn);
    }

    public void decrease() {
        value -= 1;
    }
}
