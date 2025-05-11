import java.time.LocalDate;

public class SellersOfCarrot {

    private String name;
    private LocalDate dateOfBirth;
    private int contracts;
    private double soldCarrot;
    private boolean seniorOrNot;

    public SellersOfCarrot(String name, int contracts, LocalDate dateOfBirth, double soldCarrot, boolean seniorOrNot) {
        this.name = name;
        this.contracts = contracts;
        this.dateOfBirth = dateOfBirth;
        this.soldCarrot = soldCarrot;
        this.seniorOrNot = seniorOrNot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getContracts() {
        return contracts;
    }

    public void setContracts(int contracts) {
        this.contracts = contracts;
    }

    public boolean isSeniorOrNot() {
        return seniorOrNot;
    }

    public void setSeniorOrNot(boolean seniorOrNot) {
        this.seniorOrNot = seniorOrNot;
    }

    public double getSoldCarrot() {
        return soldCarrot;
    }

    public void setSoldCarrot(double soldCarrot) {
        this.soldCarrot = soldCarrot;
    }
}
