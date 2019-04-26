package tech.bts.onlineordersample;

import tech.bts.onlineordersample.model.Dish;
import tech.bts.onlineordersample.model.TypeOfDish;

import java.util.ArrayList;
import java.util.List;

public class Order extends Dish{

    private String customerName;
    private String dishName;
    private String type;
    private TypeOfDish typeOfDish;
    private boolean gfd;
    private boolean vgd;
    private boolean hmd;
    private boolean sfd;
    private Object extras;
    private Dish dish;
    private static List<Order> orders = new ArrayList<Order>();

    public Order(){
    }


    public Order(String customerName, String dishName, TypeOfDish typeOfDish, boolean gfd, boolean vgd, boolean hmd, boolean sfd, Object extras) {
        this.customerName = customerName;
        this.dishName = dishName;
        this.typeOfDish = typeOfDish;
        this.gfd = gfd;
        this.vgd = vgd;
        this.hmd = hmd;
        this.sfd = sfd;
        this.extras = extras;

        orders.add(this);
    }

    public TypeOfDish getTypeOfDish() {
        return typeOfDish;
    }

    public void setTypeOfDish(TypeOfDish typeOfDish) {
        this.typeOfDish = typeOfDish;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public static List<Order> getOrders() {
        return orders;
    }

    public static void setOrders(List<Order> orders) {
        Order.orders = orders;
    }

    @Override
    public String toString() {
        return customerName;
    }
}