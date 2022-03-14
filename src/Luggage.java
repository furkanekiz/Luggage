
public class Luggage {

    int luggage_ID;
    String belongsTo;
    int weight_kilo;
    double capacity_lt;
    static int lastUsedID = 500;

    public Luggage(String belongsTo, int weight_kilo, double capacity_lt) {
        this.belongsTo = belongsTo;
        this.weight_kilo = weight_kilo;
        this.capacity_lt = capacity_lt;
        this.luggage_ID = lastUsedID;
        lastUsedID++;
    }

    public int getLuggage_ID() {
        return luggage_ID;
    }

    public String getBelongsTo() {
        return belongsTo;
    }

    public int getWeight_kilo() {
        return weight_kilo;
    }

    public double getCapacity_lt() {
        return capacity_lt;
    }

    public String toString() {
        return "ID: " + luggage_ID + "\nBelongs to: " + belongsTo + "\nWeight of the luggage: "
                + weight_kilo + "\nCapacity of luggage: " + capacity_lt + " Liters\n";
    }

    
    

}
