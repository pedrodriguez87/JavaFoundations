package tech.bts.onlineordersample.model;

public class Dessert extends DishNew {

    public Dessert(String dishName, boolean glutenFree, boolean vegetarian, boolean halalMeat, boolean seafoodFree, String extras){
        super(dishName);
        this.setTypeOfDish(typeOfDish.DS);
    }

    public Dessert(String dishName) {
        super(dishName);
        this.setTypeOfDish(typeOfDish.DS);
    }

    @Override
    public String toString() {
        return this.dishName +", " + "DESSERT, " + "Gluten free: " +  this.glutenFree + ", Vegetarian: " + this.vegetarian + ", Halal-meat: " + this.halalMeat+ " ,Seafood: " + this.seafoodFree + ", Extras: " + this.extras;
    }
}

