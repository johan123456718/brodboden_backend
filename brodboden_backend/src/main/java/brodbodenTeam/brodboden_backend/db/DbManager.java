package brodbodenTeam.brodboden_backend.db;

import brodbodenTeam.brodboden_backend.objects.Desert;
import brodbodenTeam.brodboden_backend.objects.Drink;
import brodbodenTeam.brodboden_backend.objects.Food;
import brodbodenTeam.brodboden_backend.objects.Salad;
import brodbodenTeam.brodboden_backend.repositories.DesertRepository;
import brodbodenTeam.brodboden_backend.repositories.DrinkRepository;
import brodbodenTeam.brodboden_backend.repositories.FoodRepository;
import brodbodenTeam.brodboden_backend.repositories.SaladRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DbManager implements DbInterface {

    @Autowired
    private DrinkRepository drinkRepository;
    @Autowired
    private FoodRepository foodRepository;
    @Autowired
    private SaladRepository saladRepository;
    @Autowired
    private DesertRepository desertRepository;

    public DbManager(){

    }

    @Override
    public Iterable<Drink> getAllDrinks() {
        return drinkRepository.findAll();
    }

    @Override
    public Iterable<Food> getAllFoods() {
        return foodRepository.findAll();
    }

    @Override
    public Iterable<Salad> getAllSalads() {
        return saladRepository.findAll();
    }

    @Override
    public Iterable<Desert> getAllDeserts() {
        return desertRepository.findAll();
    }
}
