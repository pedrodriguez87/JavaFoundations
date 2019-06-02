package tech.bts.onlineordersample;

import tech.bts.onlineordersample.model.Dessert;
import tech.bts.onlineordersample.model.DishNew;
import tech.bts.onlineordersample.model.MainDish;
import tech.bts.onlineordersample.model.Starter;

import java.util.Arrays;
import java.util.List;

public class Order {

    private String customerName;
    private Starter starter;
    private MainDish mainDish;
    private Dessert dessert;


    public Order() {
    }

    public Order(String customerName) {
        this.customerName = customerName;
    }

    //constructor with all parameters
    public Order(String customerName, Starter starter, MainDish mainDish, Dessert dessert) {
        this.customerName = customerName;
        this.starter = starter;
        this.mainDish = mainDish;
        this.dessert = dessert;
    }


    public List<DishNew> getAllDishes() { return Arrays.asList(starter, mainDish, dessert); }

    public String getCustomerName() { return customerName; }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Order getOrder() { return this; }

    public Starter getStarter() { return starter; }

    public void setStarter(DishNew starter) {
        this.starter = (Starter) starter;
    }

    public MainDish getMainCourse() { return mainDish; }

    public void setMainCourse(DishNew mainDish) {
        this.mainDish = (MainDish) mainDish;
    }

    public Dessert getDessert() { return dessert; }

    public void setDessert(DishNew dessert) {
        this.dessert = (Dessert) dessert;
    }

    @Override
    public String toString() {
        String result = " Customer: " + customerName + ".   ";
        if(starter != null) {
            result += "Dish :" + starter.toString() + "\n";
        }
        if(mainDish != null) {
            result += "Dish :" + mainDish.toString() + "\n";
        }
        if(dessert != null) {
            result += "Dish :" + dessert.toString() + "\n";
        }
        return result;
    }
}
