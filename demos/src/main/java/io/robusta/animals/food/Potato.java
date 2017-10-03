package io.robusta.animals.food;

import io.robusta.HasPrice;

/**
 * Created by Nicolas on 22/11/2016.
 */
public class Potato extends Vegetal implements Ingredient {

int thickness = 3;

    public Potato(int calorie, int nutriment) {

       super(calorie, nutriment);
    }


    @Override
    public String toString() {
        return "Potato{" +
                "thickness=" + thickness +
                ", calorie=" + calorie +
                ", nutriment=" + nutriment +
                '}';
    }

    @Override
    public int getPrice() {
        return this.calorie/3;
    }
}

