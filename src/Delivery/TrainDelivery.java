package Delivery;

public class TrainDelivery extends Delivery {

    public TrainDelivery()
    {
        super();
        techs.add(new ByTrain());
    }
}
