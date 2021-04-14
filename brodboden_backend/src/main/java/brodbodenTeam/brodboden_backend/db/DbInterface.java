package brodbodenTeam.brodboden_backend.db;

import brodbodenTeam.brodboden_backend.objects.Desert;
import brodbodenTeam.brodboden_backend.objects.Drink;
import brodbodenTeam.brodboden_backend.objects.Food;
import brodbodenTeam.brodboden_backend.objects.Salad;

public interface DbInterface {
    Iterable<Drink> getAllDrinks();
    Iterable<Food> getAllFoods();
    Iterable<Salad>getAllSalads();
    Iterable<Desert>getAllDeserts();
}
