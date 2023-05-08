public class freightTrain implements Train {
    private MediatorInterface mediator;

    public freightTrain(MediatorInterface mediator) {
        this.mediator = mediator;
    }

    @Override
    public void arrive(){
        if(!this.mediator.canArrive(this)) {
            System.out.println("Freight Train: Arrival blocked, waiting");
            return;
        }

        System.out.println("Freight Train: Arrived");
    }

    @Override
    public void depart(){
        System.out.println("Freight Train: Leaving");
        this.mediator.notifyAboutDeparture();
    }

    @Override
    public void permitArrival(){
        System.out.println("Freight Train: Arrival permited, arriving");
        this.arrive();
    }
}
