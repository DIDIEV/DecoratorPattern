package Vehicles;

public class SensorDeParqueo extends CarDecorator{
    public SensorDeParqueo(KiaPicanto kiaPicanto){
        super(kiaPicanto);
    }
    public String getDescription(){
        return this.kiaPicanto.getDescription() + " + Sensor de parqueo";
    }
    @Override
    public long cost() {
        return this.kiaPicanto.cost() + 150000;
    }
}
