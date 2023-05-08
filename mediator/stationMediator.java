import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class stationMediator implements MediatorInterface{

    private boolean isPlataformFree;
    private Queue<Train> trainQueue;

    public stationMediator(){
        this.isPlataformFree = true;
        this.trainQueue = new LinkedList<>();
    }
    
    @Override
    public boolean canArrive(Train train){
        if (this.isPlataformFree) {
            this.isPlataformFree = false;
            return true;
        }

        this.trainQueue.add(train);
        return false;
    }

    @Override
    public void notifyAboutDeparture() {
        if (!this.isPlataformFree) {
            this.isPlataformFree = true;
        }

        if (trainQueue.size() > 0) {
            Train firstTrain = trainQueue.remove();
            firstTrain.permitArrival();
        }
    }
    
}
