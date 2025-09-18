package lab6.prob3;

import java.util.*;

public class OrderTest {
    public static void main(String[] args) {
        // a) through i) here, print after each step (use for-each)
        Order o1 = new Order("id4", "customer4", 67.4);
        ArrayList<Order> arr = new ArrayList<>(){
            {
                add(new Order("id2", "customer2", 33.2));
                add(new Order("id3", "customer3", 55.3));
                add(o1);
                add(new Order("id7", "customer7", 123.5));
                add(new Order("id77", "customer7", 123.5));
                add(new Order("id1", "customer1", 26.1));
            }
        };

        arr.remove(o1);

        System.out.println(arr.size());
        System.out.println(arr.get(1));
        arr.set(1, new Order("id6", "customer6", 77.6));

        arr.sort(Comparator.comparing(Order::getTotalAmount));
        System.out.println(arr);

        List<Order> _new = listMoreThan50(arr);
        _new.sort(Comparator.comparing(Order::getCustomerName)
                .thenComparing(Order::getTotalAmount)
                .thenComparing(Comparator.comparing(Order::getOrderId).reversed()));
        System.out.println(_new);
    }

    public static List<Order> listMoreThan50(List<Order> list) {
        // return new ArrayList<>(...) with totalAmount > 50.0
        if(list.isEmpty()) return  null;
        List<Order> answer = new ArrayList<>();
        for(Order o : list){
            if(o.getTotalAmount() > 50.0) answer.add(o);
        }
        return answer;
    }
}
