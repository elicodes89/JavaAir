public class Plane {

    private String type;
    private int capacity;
    private double totalWeight;

    public Plane(String type, int capacity, double totalWeight) {
        this.type = type;
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

}
