package brodbodenTeam.brodboden_backend.objects;

import javax.persistence.*;

@Entity
public class Desert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int desert_id;
    private String desert_title;
    private int price;
    private String description;

    @Lob
    private String picture_data;

    public int getDesert_id() {
        return desert_id;
    }

    public void setDesert_id(int desert_id) {
        this.desert_id = desert_id;
    }

    public String getDesert_title() {
        return desert_title;
    }

    public void setDesert_title(String desert_title) {
        this.desert_title = desert_title;
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
