package cz.wz.marysidy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static <T> void printList(List<T> list){
        for(T item : list){
            System.out.println(item);
        }
        System.out.println("*-".repeat(20));
    }

    public static void main(String[] args) {
        List<Contract> contracts = new ArrayList<>();
        List<Seller> sellers = new ArrayList<>();
        List<Car> cars = new ArrayList<>();

        Contract contract1 = new Contract("1/2024", LocalDate.of(2024,5,15), 7);
        Contract contract2 = new Contract("2/2024", LocalDate.now(), 20.17);
        contracts.add(contract1);
        contracts.add(contract2);

//        try{
            Car car1 = new Car("Škoda", "wet asphalt", "1J4563", 9.2);
            cars.add(car1);
//        } catch (IllegalArgumentException e) {
//            System.out.println("Caution: The car was not added." + e.getMessage());
//        }

//        try {
            Car car2 = new Car("BMW", "green", "32J7413", 11.3);
            cars.add(car2);
//        } catch (IllegalArgumentException e) {
//            System.out.println("Caution: The car was not added." + e.getMessage());
//        }

//        try {
            // car3, impossible to create an object
            Car car3 = new Car("Tesla", "light grey", "3WJ7413", 11.3);
            cars.add(car3);
//        }  catch (IllegalArgumentException e)  {
//            System.out.println("Caution: The car was not added." + e.getMessage());
//        }


        System.out.println(car1);

            Seller seller1 = new Seller("Bob", "Black", LocalDate.of(2024, 12, 12));
            seller1.setCar(car1);
            seller1.addContract(contract1);
            seller1.addContract(contract2);

            Seller seller2 = new Seller("Tom", "White", LocalDate.of(1955, 2,14), car2);
            sellers.add(seller1);
            sellers.add(seller2);

            printList(contracts);
            System.out.println(car1);
            System.out.println("*-".repeat(20));

            System.out.println(seller1);
            System.out.println("*-".repeat(20));

            printList(sellers);

            printList(cars);
    }
}



