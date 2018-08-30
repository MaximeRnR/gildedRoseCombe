package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            Quality quality = Quality.of(item.quality);
            SellIn sellIn = SellIn.of(item.sellIn);
            UpdateStrategy updateStrategy = UpdateStrategy.of(item);

            updateStrategy.manageDay(sellIn);
            updateStrategy.manageQuality(sellIn, quality);

            item.quality = quality.value;
            item.sellIn = sellIn.value;
        }
    }
}