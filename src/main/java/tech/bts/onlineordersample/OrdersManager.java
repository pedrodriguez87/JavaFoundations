package tech.bts.onlineordersample;

import tech.bts.onlineordersample.model.Dish;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OrdersManager implements OnlineOrderOps {

    public OrdersManager(){
    }


    public List<String> readDocument() throws IOException {

        BufferedReader reader = null;
        List<String> orders = new ArrayList<String>();
        try
        {
            File file = new File("/Users/Absolutt87/Documents/onlineordersample/src/main/resources/online-order-sample.csv");
            reader = new BufferedReader(new FileReader(file));

            // In this way im skipping the first line of the csv file
            reader.readLine();

            String line;
            while ((line = reader.readLine()) != null) {

                String[] items = line.split(",");
                    System.out.println(line);
                }
        } catch(
        IOException e)

        {
            e.printStackTrace();
        } finally

        {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return orders;
    }

    public int getNumberOrders(List orderList) {
        return 0;
    }

    public Object getOrder(List orderList, int orderIndex) {
        return null;
    }

    public String getAllOrdersToString(List orderList) {
        return null;
    }

    public Dish getDish(List dishList, int dishIndex) {
        return null;
    }

    public String getAllDishToString(List dishList) {
        return null;
    }

    public List getDishesByType(List dishList, String dishType) {
        return null;
    }

    public List getDishesByFeature(List dishList, String feature) {
        return null;
    }

    public String getStatsByDishType(List dishList, String dishType) {
        return null;
    }
}
