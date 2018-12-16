package Delivery;

public class CarDelivery extends Delivery {

    public CarDelivery(){
        super();
        techs.add(new ByCar());
    }
}
