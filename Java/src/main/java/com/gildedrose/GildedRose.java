package com.gildedrose;

import static com.gildedrose.ProductNames.AGED_BERRIE;
import static com.gildedrose.ProductNames.BACKSTAGE_PASSES;
import static com.gildedrose.ProductNames.SULFURUS;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            updateQuality1(i);

            updateSellin(i);

            updateQualityWhenSellingDatePassed(i);
        }
    }

    private void updateQualityWhenSellingDatePassed(int i) {
        if (items[i].sellIn < 0) {
            if (!items[i].name.equals(AGED_BERRIE)) {
                if (!items[i].name.equals(BACKSTAGE_PASSES)) {
                    if (items[i].quality > 0) {
                        if (!items[i].name.equals(SULFURUS)) {
                            items[i].quality = items[i].quality - 1;
                        }
                    }
                } else {
                    items[i].quality = 0;
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;
                }
            }
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
                break;
            case SULFURUS:
                break;
            case AGED_BERRIE:
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;
                }
               break;
            default:
                if (items[i].quality > 0) {
                    items[i].quality = items[i].quality - 1;
                }
                break;


        }


    }


}
