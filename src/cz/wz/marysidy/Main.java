package cz.wz.marysidy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contract> allContracts = new ArrayList<>();

        Contract firstContract = new Contract("1/2024", LocalDate.of(2024,5,15), 7);
        Contract secondContract = new Contract("2/2024", LocalDate.now(), 20.17);
        allContracts.add(firstContract);
        allContracts.add(secondContract);

        System.out.println(allContracts);

    }
}
