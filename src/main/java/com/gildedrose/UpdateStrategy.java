package com.gildedrose;

interface UpdateStrategy {

    static UpdateStrategy of(Item item){
        if(Sulfuras.doesMatch(item)){
            return new Sulfuras();
        }
        if(AgedBrie.doesMatch(item)){
            return new AgedBrie();
        }
        if(BackStage.doesMatch(item)){
            return new BackStage();
        }
        return new Default();

    }

    void manageQuality(SellIn sellIn, Quality quality);

    void manageDay(SellIn sellIn);

    void manageExpiration(SellIn sellIn, Quality quality);
}
