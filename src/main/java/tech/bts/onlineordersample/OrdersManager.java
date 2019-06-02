package tech.bts.onlineordersample;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import tech.bts.onlineordersample.model.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class OrdersManager implements OnlineOrderOps {

    public List readOrders(String csvfile) throws Exception {
        List orders = new ArrayList<Order>();

        BufferedReader reader = new BufferedReader(new FileReader(csvfile));
        CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
        List<String[]> items = csvReader.readAll();


        for (String[] item: items) {
            Order order = new Order();
            if (item[2].equals("st")) {
                Starter dish = new Starter(item[1]);
                readDishes(dish, item);
                order.setStarter(dish);
                order.setCustomerName(item[0]);
            }else if (item[2].equals("mc")) {
                MainDish dish = new MainDish(item[1]);
                readDishes(dish, item);
                order.setMainCourse(dish);
                order.setCustomerName(item[0]);
            }else if (item[2].equals("ds")) {
                Dessert dish = new Dessert(item[1]);
                readDishes(dish, item);
                order.setDessert(dish);
                order.setCustomerName(item[0]);
            }
            orders.add(order);
        }
        return orders;
    }

    public void readDishes(DishNew dish, String[] item) {

        dish.setGlutenFree(Boolean.parseBoolean(item[3]));
        dish.setVegetarian(Boolean.parseBoolean(item[4]));
        dish.setHalalMeat(Boolean.parseBoolean(item[5]));
        dish.setSeafoodFree(Boolean.parseBoolean(item[6]));
        dish.setExtras(item[7]);

    }

    public List createDishes(String csvfile) throws Exception {
        List<DishNew> dishes = new ArrayList();

        BufferedReader reader = new BufferedReader(new FileReader(csvfile));
        CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
        List<String[]> elements = csvReader.readAll();


        for (String[] element : elements) {
            DishNew dish = new DishNew();
            dish.setDishName(String.valueOf(element[1]));
            dish.setType(String.valueOf(element[2]));
            dish.setGlutenFree(Boolean.parseBoolean(element[3]));
            dish.setVegetarian(Boolean.parseBoolean(element[4]));
            dish.setHalalMeat(Boolean.parseBoolean(element[5]));
            dish.setSeafoodFree(Boolean.parseBoolean(element[6]));
            dish.setExtras(element[7]);

            dishes.add(dish);

        }
        return dishes;

    }



    @Override
    public int getNumberOrders(List orderList) {

        return orderList.size();
    }

    @Override
    public Object getOrder(List orderList, int orderIndex) {

        return orderList.get(orderIndex);
    }

    @Override
    public String getAllOrdersToString(List orderList) {

        return String.valueOf(orderList);
    }

    @Override
    public Dish getDish(List dishList, int dishIndex) {

        return (Dish) dishList.get(dishIndex);
    }

    @Override
    public String getAllDishToString(List dishList) {

        return String.valueOf(dishList);
    }

    @Override
    public List getDishesByType(List dishList, String dishType) {

        List result = new ArrayList<>();

        for (int i = 0; i <= dishList.size() - 1; i++) {
            String verify = dishList.get(i).toString();
            if (verify.contains(dishType)) {
                result.add(dishList.get(i));
            }
        }
        return result;
    }

    @Override
    public List getDishesByFeature(List dishList, String feature) {

        List result = new ArrayList<>();

        for(Object verify : dishList){
            DishNew dishNew = (DishNew) verify;
            if(dishNew.isGlutenFree() && feature.equals("gfd")){
                result.add(dishNew);
            } else if (dishNew.isVegetarian() && feature.equals("vgd")){
                result.add(dishNew);
            } else if(dishNew.isHalalMeat() && feature.equals("hmd")){
                result.add(dishNew);
            } else if (dishNew.isSeafoodFree() && feature.equals("sfd")){
                result.add(dishNew);
            }
        }
        return result;
    }

    @Override
    public String getStatsByDishType(List dishList, String dishType) {
        return null;
    }
}
