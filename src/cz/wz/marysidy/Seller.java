package cz.wz.marysidy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Seller {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private List<Contract> contracts;
    private Car car;

    // Constructors
    public Seller(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.contracts = new ArrayList<>();
    }

    public Seller(String firstName, String lastName, LocalDate birthDate, Car car) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.contracts = new ArrayList<>();
        this.car = car;
    }

    // Getters & Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    // Methods
    public void addContract(Contract contract){
        contracts.add(contract);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = contract.getSigningDate().format(formatter);
        System.out.printf("The contract %s from %s has been added.\n", contract.getContractNumber(), formattedDate);
    }

    @Override
    public String toString() {
        return "Seller{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", contracts=" + contracts +
                ", car=" + car +
                '}';
    }
}
