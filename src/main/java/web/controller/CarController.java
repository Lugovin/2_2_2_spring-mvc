package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.services.CarServise;
import web.services.CarServiseImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    CarServise carServise;

    public static List<Car> carsList = new ArrayList<>();

    {
        carServise = new CarServiseImpl();
        carsList.add(new Car("VW", "Polo", 2018));
        carsList.add(new Car("Honda", "Pilot", 2010));
        carsList.add(new Car("KIA", "RIO", 2019));
        carsList.add(new Car("VAZ", "2106", 2022));
        carsList.add(new Car("Renault", "Laguna", 2001));
    }

    @GetMapping(value = "/cars")
    public String printSomeCars(@RequestParam(value = "count", defaultValue = "5") int n, ModelMap model) {
        if (n > carsList.size()) {
            n = carsList.size();
        }
        List<Car> someCars = carServise.getSomeCars(carsList, n);
        model.addAttribute("someCars", someCars);
        return "cars";
    }
}
