package web.services;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Service
public class CarServiceImpl implements CarService {

    public static List<Car> carsList = new ArrayList<>();

    {
        carsList.add(new Car("VW", "Polo", 2018));
        carsList.add(new Car("Honda", "Pilot", 2010));
        carsList.add(new Car("KIA", "RIO", 2019));
        carsList.add(new Car("VAZ", "2106", 2022));
        carsList.add(new Car("Renault", "Laguna", 2001));
    }

    @Override
    public List<Car> getSomeCars(List<Car> cars, int count) {
        if (count > carsList.size()) {
            count = carsList.size();
        }
        List<Car> someCars = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Car c = cars.get(i);
            someCars.add(c);
        }
        return someCars;
    }
}
