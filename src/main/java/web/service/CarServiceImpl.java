package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCarList(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Dodge", "Challenger", 1970));
        cars.add(new Car("Ford", "Mustang-GT", 2018));
        cars.add(new Car("Nissan", "Skyline-GTR", 2003));
        cars.add(new Car("Audi", "R8", 2012));
        cars.add(new Car("Toyota", "Supra", 1996));
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}

