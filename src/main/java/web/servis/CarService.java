package web.servis;

import web.model.Car;

import java.util.List;

public interface CarService {

    List<Car> getListCars(int count);
}
