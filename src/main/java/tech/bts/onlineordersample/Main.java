package tech.bts.onlineordersample;

import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        OrdersManager ordersManager = new OrdersManager();
        List orders = ordersManager.readOrders("src/main/resources/online-order-sample.csv");
        List dishes = ordersManager.createDishes("src/main/resources/online-order-sample.csv");


        System.out.println("------------------Welcome to the Restaurant-------------------" + "\n");
        System.out.println("The total number of orders is: " + ordersManager.getNumberOrders(orders) + "\n");

        System.out.println("# Order: ");
        System.out.println("    "+ ordersManager.getOrder(orders,1));

        System.out.println("# All Orders: ");
        System.out.println(ordersManager.getAllOrdersToString(orders) + "\n" );

        System.out.println("# Dish: ");
        System.out.println(ordersManager.getDish(dishes, 0)+ "\n");

        System.out.println("# All dishes: ");
        System.out.println(ordersManager.getAllDishToString(dishes)+ "\n");

        System.out.println("# Dish by Dessert type: ");
        System.out.println(ordersManager.getDishesByType(dishes, "ds") + "\n");

        System.out.println("# Dish by vgd feature: ");
        System.out.println(ordersManager.getDishesByFeature(dishes, "vgd")+ "\n");


        System.out.println("------------------Thanks and have a nice day!-------------------");








    }
}
