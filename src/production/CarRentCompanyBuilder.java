package production;

public class CarRentCompanyBuilder {

    private int numberOfCars;

    public CarRentCompanyBuilder withCarNumberOf(int cars) {
        this.numberOfCars = cars;
        return this;
    }

    public CarRentCompany build() {
        return new CarRentCompany(numberOfCars);
    }

}
