package brodbodenTeam.brodboden_backend.objects;

import javax.persistence.*;

@Entity
public class Drink {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int drink_id;
    private String title;
    private int price;
    private String description;
    @Lob
    private String picture_data;

    public int getDrink_id() {
        return drink_id;
    }

    public void setDrink_id(int drink_id) {
        this.drink_id = drink_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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


    public String getPicture_data() {
        return picture_data;
    }

    public void setPicture_data(String picture_data) {
        this.picture_data = picture_data;
    }
}
