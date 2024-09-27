package cz.wz.marysidy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static <T> void printList(List<T> list){
        for(T item : list){
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<Contract> contracts = new ArrayList<>();
        Contract firstContract = new Contract("1/2024", LocalDate.of(2024,5,15), 7);
        Contract secondContract = new Contract("2/2024", LocalDate.now(), 20.17);
        contracts.add(firstContract);
        contracts.add(secondContract);

        Car car1 = new Car("Škoda","green", "12JJ4563", 9.2);
        Car car2 = new Car("BMW","green", "32JJ7413", 11.3);


        printList(contracts);
        System.out.println(car1);

    }
}



