package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("fixme", app.items[0].name);
    }

    @Test
    void sulphur() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 10, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].quality);
        assertEquals(10, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].quality);
        assertEquals(10, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].quality);
        assertEquals(10, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].quality);
        assertEquals(10, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].quality);
        assertEquals(10, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].quality);
        assertEquals(10, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].quality);
        assertEquals(10, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].quality);
        assertEquals(10, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].quality);
        assertEquals(10, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].quality);
        assertEquals(10, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].quality);
        assertEquals(10, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].quality);
        assertEquals(10, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].quality);
        assertEquals(10, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].quality);
        assertEquals(10, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].quality);
        assertEquals(10, app.items[0].sellIn);
    }


    @Test
    void backstagePasses() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 30) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(32, app.items[0].quality);
        assertEquals(9, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(34, app.items[0].quality);
        assertEquals(8, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(36, app.items[0].quality);
        assertEquals(7, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(38, app.items[0].quality);
        assertEquals(6, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(40, app.items[0].quality);
        assertEquals(5, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(43, app.items[0].quality);
        assertEquals(4, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(46, app.items[0].quality);
        assertEquals(3, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(49, app.items[0].quality);
        assertEquals(2, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(50, app.items[0].quality);
        assertEquals(1, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(50, app.items[0].quality);
        assertEquals(0, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(0, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(0, app.items[0].quality);
        assertEquals(-2, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(0, app.items[0].quality);
        assertEquals(-3, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(0, app.items[0].quality);
        assertEquals(-4, app.items[0].sellIn);
    }


    @Test
    void agedBrie() {
        Item[] items = new Item[] { new Item("Aged Brie", 10, 40) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(41, app.items[0].quality);
        assertEquals(9, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(42, app.items[0].quality);
        assertEquals(8, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(43, app.items[0].quality);
        assertEquals(7, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(44, app.items[0].quality);
        assertEquals(6, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(45, app.items[0].quality);
        assertEquals(5, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(46, app.items[0].quality);
        assertEquals(4, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(47, app.items[0].quality);
        assertEquals(3, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(48, app.items[0].quality);
        assertEquals(2, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(49, app.items[0].quality);
        assertEquals(1, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(50, app.items[0].quality);
        assertEquals(0, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(50, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(50, app.items[0].quality);
        assertEquals(-2, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(50, app.items[0].quality);
        assertEquals(-3, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(50, app.items[0].quality);
        assertEquals(-4, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(50, app.items[0].quality);
        assertEquals(-5, app.items[0].sellIn);
    }


    @Test
    void apples() {
        Item[] items = new Item[] { new Item("Apples", 10, 60) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Apples", app.items[0].name);
        assertEquals(59, app.items[0].quality);
        assertEquals(9, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Apples", app.items[0].name);
        assertEquals(58, app.items[0].quality);
        assertEquals(8, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Apples", app.items[0].name);
        assertEquals(57, app.items[0].quality);
        assertEquals(7, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Apples", app.items[0].name);
        assertEquals(56, app.items[0].quality);
        assertEquals(6, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Apples", app.items[0].name);
        assertEquals(55, app.items[0].quality);
        assertEquals(5, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Apples", app.items[0].name);
        assertEquals(54, app.items[0].quality);
        assertEquals(4, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Apples", app.items[0].name);
        assertEquals(53, app.items[0].quality);
        assertEquals(3, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Apples", app.items[0].name);
        assertEquals(52, app.items[0].quality);
        assertEquals(2, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Apples", app.items[0].name);
        assertEquals(51, app.items[0].quality);
        assertEquals(1, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Apples", app.items[0].name);
        assertEquals(50, app.items[0].quality);
        assertEquals(0, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Apples", app.items[0].name);
        assertEquals(48, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Apples", app.items[0].name);
        assertEquals(46, app.items[0].quality);
        assertEquals(-2, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Apples", app.items[0].name);
        assertEquals(44, app.items[0].quality);
        assertEquals(-3, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Apples", app.items[0].name);
        assertEquals(42, app.items[0].quality);
        assertEquals(-4, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("Apples", app.items[0].name);
        assertEquals(40, app.items[0].quality);
        assertEquals(-5, app.items[0].sellIn);
    }


}
