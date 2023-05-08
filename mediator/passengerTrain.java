import javax.xml.transform.Source;

public class passengerTrain implements Train{
    private MediatorInterface mediator;
    
    public passengerTrain(MediatorInterface mediator){
        this.mediator = mediator;
    }

    @Override
    public void arrive(){
        if(!this.mediator.canArrive(this)) {
            System.out.println("Passenger Train: Arrival blocked, waiting");
            return;
        }

        System.out.println("Passenger Train: Arrived");
    }

    @Override
    public void depart(){
        System.out.println("Passenger Train: Leaving");
        this.mediator.notifyAboutDeparture();
    }

    @Override
    public void permitArrival(){
        System.out.println("Passenger Train: Arrival permited, arriving");
        this.arrive();
    }
}
