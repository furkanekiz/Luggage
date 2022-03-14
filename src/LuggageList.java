
public class LuggageList {

    static final int MAX_COUNT = 5;
    static final int MAX_KILOS = 50;
    Luggage[] myLuggages = new Luggage[MAX_COUNT];
    int total_LuggageCount = 0;
    int total_Kilo = 0;

    public boolean addLuggage(Luggage luggage) {
        if (total_LuggageCount < 5) {

            if (luggage.getWeight_kilo() <= (MAX_KILOS - total_Kilo)) {

                myLuggages[total_LuggageCount] = luggage;
                total_Kilo += luggage.getWeight_kilo();
                total_LuggageCount++;
                return true;
            }

        }
        
        return false;
    }

    public boolean removeLuggage(String luggage_ID) {
        for (int i = 0; i < total_LuggageCount; i++) {

            if (myLuggages[i].getLuggage_ID() == Integer.parseInt(luggage_ID)) {

                total_Kilo -= myLuggages[i].getWeight_kilo();
                total_LuggageCount--;
                System.out.println("The Luggage belonging to: " + myLuggages[i].belongsTo + " is removed.");
                myLuggages[i] = myLuggages[total_LuggageCount];

                return true;
            }

        }

        return false;
    }

    public Luggage getLuggage(String belongsTo) {
        for (int i = 0; i < total_LuggageCount; i++) {

            if (myLuggages[i].getBelongsTo().equals(belongsTo)) {

                return myLuggages[i];
            }

        }

        return null;
    }

    public Luggage[] getAll() {
        return myLuggages;
    }

    public Luggage getHighestCapacityLuggage() {
        double highest = 0.0;
        for (int i = 0; i < total_LuggageCount; i++) {

            if (myLuggages[i].getCapacity_lt() > highest) {

                highest = myLuggages[i].getCapacity_lt();
            }
        }

        for (int i = 0; i < total_LuggageCount; i++) {

            if (myLuggages[i].getCapacity_lt() == highest) {

                return myLuggages[i];
            }
        }

        return null;
    }

    public void display() {
        String result = "";
        for (int i = 0; i < total_LuggageCount; i++) {
            result += myLuggages[i].toString();
        }

        System.out.println(result);
    }
}
