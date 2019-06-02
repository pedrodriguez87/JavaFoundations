package tech.bts.onlineordersample.model;

public class MainDish extends DishNew {

    public MainDish(String dishName, boolean glutenFree, boolean vegetarian, boolean halalMeat, boolean seafoodFree, String extras) {
        super(dishName, glutenFree, vegetarian, halalMeat, seafoodFree, extras);
        this.setTypeOfDish(TypeOfDish.MC);
    }

    public MainDish(String dishName) {
        super(dishName);
        this.setTypeOfDish(TypeOfDish.MC);
    }

    @Override
    public String toString() {
        return this.dishName +", " + "MAIN_COURSE, " + "Gluten free: " +  this.glutenFree + ", Vegetarian: " + this.vegetarian + ", Halal-meat: " + this.halalMeat+ " ,Seafood: " + this.seafoodFree + ", Extras: " + this.extras;
    }
}



