package brodbodenTeam.brodboden_backend.objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Salad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int salad_id;
    private String salad_title;
    private int price;
    private String description;

    public int getSalad_id() {
        return salad_id;
    }

    public void setSalad_id(int salad_id) {
        this.salad_id = salad_id;
    }

    public String getSalad_title() {
        return salad_title;
    }

    public void setSalad_title(String salad_title) {
        this.salad_title = salad_title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
