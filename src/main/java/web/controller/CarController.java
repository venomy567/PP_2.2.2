package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.servis.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam (value = "count", required = false, defaultValue = "5") int count, Model model) {

        model.addAttribute("messages", carService.getListCars(count));
        return "cars";
    }
}
