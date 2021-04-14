package brodbodenTeam.brodboden_backend.repositories;

import brodbodenTeam.brodboden_backend.objects.Food;
import org.springframework.data.repository.CrudRepository;

public interface FoodRepository extends CrudRepository<Food, Integer> {
}
