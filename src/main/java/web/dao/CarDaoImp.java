package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao{

    private List<Car> listCar = new ArrayList<>();

    {
        listCar.add(new Car("model1", 1, 1));
        listCar.add(new Car("model2", 2, 2));
        listCar.add(new Car("model3", 31, 33));
        listCar.add(new Car("model44", 4, 4));
        listCar.add(new Car("model555", 555, 55));
    }

    @Override
    public List<Car> getListCars(int count) {

        List<Car> listCarSecond = new ArrayList<>();

        if (count >= 5)  listCarSecond = listCar;
        else {
            for (int i = 0; i < count; i++) {
                listCarSecond.add(listCar.get(i));
            }
        }
        return listCarSecond;
    }
}
