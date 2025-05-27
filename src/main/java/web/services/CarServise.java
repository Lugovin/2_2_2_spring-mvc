package web.services;

import web.model.Car;

import java.util.List;

public interface CarServise {

    public List<Car> getSomeCars(List<Car> cars, int count);
}
