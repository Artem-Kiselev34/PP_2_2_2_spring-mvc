package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars = Arrays.asList(
            new Car("Toyota", "Camry", 2020),
            new Car("Honda", "Accord", 2019),
            new Car("Ford", "Mustang", 2021),
            new Car("Chevrolet", "Malibu", 2018),
            new Car("Nissan", "Altima", 2022)
    );

    @Override
    public List<Car> getCars(int count) {
        return count < 0 || count > cars.size() ? cars : cars.subList(0, count);
    }
}
