package ru.milandr.courses.farm.ozherelev;

public class Honey extends AnimalGoods {
    public Honey()
    {
        this.setRottenTime(3000);
    }

    @Override
    public String toString() {
        return "Honey";
    }
}
