package by.jonline.grow.programmingwithclass.exercise15;

public class Tour {

    private String type;
    private String vehicle;
    private String food;
    private int day;
    private double cost;

    public Tour(String type, String vehicle, String food, int day, double cost) {
        this.type = type;
        this.vehicle = vehicle;
        this.food = food;
        this.day = day;
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [type=" + type + ", vehicle=" + vehicle + ", food=" + food + ", day=" + day + ", cost=" + cost
                + "]";
    }


}
