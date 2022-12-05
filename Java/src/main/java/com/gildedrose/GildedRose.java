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

            updateQualityWhenSellingDatePassed1(i);
        }
    }


    private void updateQualityWhenSellingDatePassed1(int i) {
        if (items[i].sellIn < 0) {
            switch (items[i].name) {
                case BACKSTAGE_PASSES:
                    items[i].quality = 0;
                    break;
                case SULFURUS:
                    break;
                case AGED_BERRIE:
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                    break;
                default:
                    items[i].quality = items[i].quality - 1;
                    break;
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
