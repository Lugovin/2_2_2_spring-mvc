package web.services;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiseImpl implements CarServise {

    @Override
    public List<Car> getSomeCars(List<Car> cars, int count) {
        List<Car> someCars = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Car c = cars.get(i);
            someCars.add(c);
        }
        return someCars;
    }
}
