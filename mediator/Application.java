public class Application {
    public static void main(String[] args) {
        stationMediator station = new stationMediator();
        passengerTrain passengers = new passengerTrain(station);
        freightTrain freight = new freightTrain(station);

        passengers.arrive();
        freight.arrive();
        passengers.depart();
    };
}
