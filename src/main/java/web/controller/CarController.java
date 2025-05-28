package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.services.CarService;

import java.util.List;

import static web.services.CarServiceImpl.carsList;

@Controller
public class CarController {
    @Autowired
    CarService carService;

    @GetMapping(value = "/cars")
    public String printSomeCars(@RequestParam(value = "count", defaultValue = "5") int n, ModelMap model) {
        List<Car> someCars = carService.getSomeCars(carsList, n);
        model.addAttribute("someCars", someCars);
        return "cars";
    }
}
