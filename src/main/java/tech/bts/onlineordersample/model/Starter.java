package tech.bts.onlineordersample.model;

public class Starter extends DishNew {

    public Starter(String dishName, boolean glutenFree, boolean vegetarian, boolean halalMeat, boolean seafoodFree, String extras){
        super(dishName);
        this.setTypeOfDish(typeOfDish.ST);
    }

    public Starter(String dishName) {
        super(dishName);
        this.setTypeOfDish(typeOfDish.ST);
    }

    @Override
    public String toString() {
        return this.dishName +", " + "STARTER, " + "Gluten free: " +  this.glutenFree + ", Vegetarian: " + this.vegetarian + ", Halal-meat: " + this.halalMeat+ " ,Seafood: " + this.seafoodFree + ", Extras: " + this.extras;
    }
}
