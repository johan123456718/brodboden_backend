package brodbodenTeam.brodboden_backend.controller;

import brodbodenTeam.brodboden_backend.db.DbInterface;
import brodbodenTeam.brodboden_backend.db.DbManager;
import brodbodenTeam.brodboden_backend.objects.Desert;
import brodbodenTeam.brodboden_backend.objects.Drink;
import brodbodenTeam.brodboden_backend.objects.Food;
import brodbodenTeam.brodboden_backend.objects.Salad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path="/demo", method = {RequestMethod.GET, RequestMethod.PUT, RequestMethod.POST}, produces = { "application/json; charset=utf-8" })

public class RestController {

    @Autowired
    DbInterface DbManager = new DbManager();

    @GetMapping(path="/allDrinks")
    public @ResponseBody
    Iterable<Drink> getAllDrinks() {
        return DbManager.getAllDrinks();
    }

    @GetMapping(path="/allFoods")
    public @ResponseBody
    Iterable<Food> getAllFoods() {
        return DbManager.getAllFoods();
    }

    @GetMapping(path="/allDeserts")
    public @ResponseBody
    Iterable<Desert> getAllDeserts() {
        return DbManager.getAllDeserts();
    }

    @GetMapping(path="/allSalads")
    public @ResponseBody
    Iterable<Salad> getAllSalads() {
        return DbManager.getAllSalads();
    }
}
