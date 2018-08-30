package com.gildedrose;

class Quality {

    public int value;

    private Quality(int quality) {
        value = quality;
    }

    public static Quality of(int quality) {
        return new Quality(quality);
    }

    void setToZero() {
        this.value = 0;
    }

    void increase() {
        if (this.value < 50) {
            this.value += 1;
        }
    }

    void decrease() {
        if (this.value > 0) {
            this.value -= 1;
        }
    }
}
