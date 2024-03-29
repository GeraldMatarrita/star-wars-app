package tec.bd.starwars;

import java.util.ArrayList;

public class Planet {

    private String name;
    private double rotation_period;
    private double orbital_period;
    private double diameter;
    private String climate;
    private String gravity;
    private String terrain;
    private double surface_water;
    private double population;
    private ArrayList<String> residents;
    private ArrayList<String> films;
    private String created;
    private String edited;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRotation_period() {
        return rotation_period;
    }

    public void setRotation_period(double rotation_period) {
        this.rotation_period = rotation_period;
    }

    public double getOrbital_period() {
        return orbital_period;
    }

    public void setOrbital_period(double orbital_period) {
        this.orbital_period = orbital_period;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getGravity() {
        return gravity;
    }

    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public double getSurface_water() {
        return surface_water;
    }

    public void setSurface_water(double surface_water) {
        this.surface_water = surface_water;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public ArrayList<String> getResidents() {
        return residents;
    }

    public void setResidents(ArrayList<String> residents) {
        this.residents = residents;
    }

    public ArrayList<String> getFilms() {
        return films;
    }

    public void setFilms(ArrayList<String> films) {
        this.films = films;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", rotation period=" + rotation_period +
                ", orbital period=" + orbital_period +
                ", diameter=" + diameter +
                ", climate=" + climate +
                ", gravity=" + gravity +
                ", terrain=" + terrain +
                ", surface_water=" + surface_water +
                ", population=" + population +
                ", residents=" + residents +
                ", films=" + films +
                ", created=" + created +
                ", edited=" + edited +
                ", url=" + url +
                '}';
    }
}
