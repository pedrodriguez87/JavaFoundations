package tech.bts.onlineordersample;

import java.io.*;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {


        System.out.println("-------------Welcome to BtsMdsd-Restaurant--------------");
        System.out.println();
        System.out.println("# Number of orders: ");
        System.out.println();
        System.out.println("# All orders");
        OrdersManager ordersManager = new OrdersManager();
        System.out.println( ordersManager.readDocument());
    }

}
