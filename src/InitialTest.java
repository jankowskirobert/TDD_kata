import static org.junit.Assert.*;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matcher;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.junit.Test;

import production.Car;
import production.CarRentCompany;
import production.CarRentCompanyBuilder;


public class InitialTest {

    @Test
    public void test() {
        CarRentCompany theCompany = a(company().withCarNumberOf(8));
        assertEquals(theCompany.numberOfCars, 8);
        Car theCar = rentaCarFrom(theCompany, forNumberOfHours(10));
//        assertThat(availableCarsIn(theCompany), hasBeenDecreasedFrom(theCompany.allCars, toDecresed))
        
    }


    private Car rentaCarFrom(CarRentCompany theCompany, LocalDate forNumberOfHours) {
        return theCompany.borrowACar(forNumberOfHours);
    }

    private LocalDate forNumberOfHours(int i) {
        return new LocalDate(DateTime.now().plusHours(i));
    }

    private CarRentCompany a(CarRentCompanyBuilder withCarNumberOf) {
        return withCarNumberOf.build();
    }

    private CarRentCompanyBuilder company() {
        return new CarRentCompanyBuilder();
    }

}
