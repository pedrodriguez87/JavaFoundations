package tech.bts.onlineordersample.model;

import tech.bts.onlineordersample.OrdersManager;

public class DishNew extends Dish {

    protected String dishName;
    protected TypeOfDish typeOfDish;
    protected String type;
    protected boolean glutenFree;
    protected boolean vegetarian;
    protected boolean halalMeat;
    protected boolean seafoodFree;
    protected String extras;

    protected enum TypeOfDish {ST, MC, DS}

    public DishNew() {
    }

    public DishNew(String dishName, boolean glutenFree, boolean vegetarian, boolean halalMeat, boolean seafoodFree, String extras) {
        this.dishName = dishName;
        this.type = type;
        this.glutenFree = glutenFree;
        this.vegetarian = vegetarian;
        this.halalMeat = halalMeat;
        this.seafoodFree = seafoodFree;
        this.extras = extras;

    }



    public DishNew(String dishName) {
        this.dishName = dishName;
    }

    @Override
    public String getDishName() {
        return dishName;
    }

    @Override
    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public TypeOfDish getTypeOfDish() {
        return typeOfDish;
    }

    public void setTypeOfDish(TypeOfDish typeOfDish) {
        this.typeOfDish = typeOfDish;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        this.glutenFree = glutenFree;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public boolean isHalalMeat() {
        return halalMeat;
    }

    public void setHalalMeat(boolean halalMeat) {
        this.halalMeat = halalMeat;
    }

    public boolean isSeafoodFree() {
        return seafoodFree;
    }

    public void setSeafoodFree(boolean seafoodFree) {
        this.seafoodFree = seafoodFree;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    @Override
    public String toString() {
        return "  Dish:" + this.dishName +", " + this.type + ", Gluten free: " +  this.glutenFree + ", Vegetarian: " + this.vegetarian + ", Halal-meat: " + this.halalMeat+ " ,Seafood: " + this.seafoodFree + ", Extras: " + this.extras + "\n";
    }
}
