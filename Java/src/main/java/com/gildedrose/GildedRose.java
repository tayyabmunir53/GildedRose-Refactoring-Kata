package com.gildedrose;

import static com.gildedrose.ProductNames.AGED_BERRIE;
import static com.gildedrose.ProductNames.BACKSTAGE_PASSES;
import static com.gildedrose.ProductNames.CONJURED_ITEMS;
import static com.gildedrose.ProductNames.SULFURUS;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            updateQuality1(i);
        }
    }

    private void updateSellin(int i) {
        if (!items[i].name.equals(SULFURUS)) {
            items[i].sellIn = items[i].sellIn - 1;
        }
    }


    private void updateQuality1(int i) {

        switch (items[i].name){
            case BACKSTAGE_PASSES:
                // before sell in
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;
                }
                if (items[i].sellIn < 11) {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                }

                if (items[i].sellIn < 6) {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
                //
                updateSellin(i);
                // after sell in update
                if (items[i].sellIn < 0) {
                    items[i].quality = 0;
                }
                //
                break;
            case SULFURUS:
                break;
            case AGED_BERRIE:
                //before sellin
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;
                }
                //
                updateSellin(i);
                // after sell in update
                if (items[i].sellIn < 0) {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
                //
               break;
            case CONJURED_ITEMS:
                //before sell in
                if (items[i].quality > 0) {
                    items[i].quality = items[i].quality - 1;
                    items[i].quality = items[i].quality - 1;
                }
                //
                updateSellin(i);
                // after sell in update
                if (items[i].sellIn < 0) {
                    items[i].quality = items[i].quality - 1;
                    items[i].quality = items[i].quality - 1;
                }
                //
                break ;
            default:
                //before sell in
                if (items[i].quality > 0) {
                    items[i].quality = items[i].quality - 1;
                }
                //
                updateSellin(i);
                // after sell in update
                if (items[i].sellIn < 0) {
                    items[i].quality = items[i].quality - 1;
                }
                //
                break;


        }


    }


}
