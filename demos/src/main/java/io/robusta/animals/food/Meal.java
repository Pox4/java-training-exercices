package io.robusta.animals.food;

import io.robusta.HasPrice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Meal extends ArrayList<Ingredient> implements Collection<Ingredient> {


    public Meal(Ingredient ... nutriments){

        for (Ingredient current : nutriments){

            this.add(current);
        }
    }



    public int getNutriments(){

        List<Ingredient> meal = this;

        int nutriments = 0;
        for (Ingredient ingredient : this ){
            nutriments =  nutriments + ingredient.getNutriment();
        }

        return nutriments;

    }

    public int getPrice(){

        int price = 0;
        for (HasPrice ingredient : this ){
            price =  price + ingredient.getPrice();
        }

        return price;
        }

}
