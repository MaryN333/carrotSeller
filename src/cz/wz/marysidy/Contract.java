package cz.wz.marysidy;

import java.time.LocalDate;

public class Contract {
    private String contractNumber;
    private LocalDate signingDate;
    private double weightInTons;

    // Constructor
    public Contract(String contractNumber, LocalDate signingDate, double weightInTons) {
        this.contractNumber = contractNumber;
        this.signingDate = signingDate;
        this.weightInTons = weightInTons;
    }

    // Getters and Setters
    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public LocalDate getSigningDate() {
        return signingDate;
    }

    public void setSigningDate(LocalDate signingDate) {
        this.signingDate = signingDate;
    }

    public double getWeightInTons() {
        return weightInTons;
    }

    public void setWeightInTons(double weightInTons) {
        this.weightInTons = weightInTons;
    }

    // Methods
    @Override
    public String toString() {
        return "Contract{" +
                "contract number='" + contractNumber + '\'' +
                ", signing date=" + signingDate +
                ", weight in tons=" + weightInTons +
                '}';
    }
}
