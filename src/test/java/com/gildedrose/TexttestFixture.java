package com.gildedrose;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class TexttestFixture {

    @Test
    public void test() {

        assertThat(textTest()).isEqualTo(textTestLegacy());
    }

    private static List<String> textTest() {

        Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20), //
                new Item("Aged Brie", 2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                // this conjured item does not work properly yet
                new Item("Conjured Mana Cake", 3, 6) };

        GildedRose app = new GildedRose(items);

        int days = 40;

        List<String> list = new ArrayList<>();
        list.add("OMGHAI!");
        for (int i = 0; i < days; i++) {
            list.add("-------- day " + i + " --------");
            list.add("name, sellIn, quality");
            for (Item item : items) {
                list.add(item.toString());
            }
            list.add("");
            app.updateQuality();
        }
        return list;
    }

    private static List<String> textTestLegacy() {

        Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20), //
                new Item("Aged Brie", 2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                // this conjured item does not work properly yet
                new Item("Conjured Mana Cake", 3, 6) };

        GildedRoseLegacy app = new GildedRoseLegacy(items);

        int days =40;

        List<String> list = new ArrayList<>();
        list.add("OMGHAI!");
        for (int i = 0; i < days; i++) {
            list.add("-------- day " + i + " --------");
            list.add("name, sellIn, quality");
            for (Item item : items) {
                list.add(item.toString());
            }
            list.add("");
            app.updateQuality();
        }
        return list;
    }

}
