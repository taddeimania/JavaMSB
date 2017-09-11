package io.joel.model;

import javax.persistence.*;

/**
 * Created by taddeimania on 9/8/17.
 */
@Entity
@Table(name = "airplanes")
public class Airplane {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String Manufacturer;
    private int EngineCount;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public int getEngineCount() {
        return EngineCount;
    }

    public void setEngineCount(int engineCount) {
        EngineCount = engineCount;
    }
}
