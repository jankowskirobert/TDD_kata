package production;

import java.util.LinkedList;
import java.util.Set;


import org.joda.time.LocalDate;

public class CarRentCompany {

    public int numberOfCars;
    private LinkedList<Car> cars;

    public CarRentCompany(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    public Car getAvailableCar() {
        return cars.pop();
    }

    public Car borrowACar(LocalDate forNumberOfHours) {
        return getAvailableCar();
    }

}
