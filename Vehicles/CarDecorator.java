package Vehicles;

public abstract class CarDecorator extends KiaPicanto {
    KiaPicanto kiaPicanto;
    public CarDecorator(KiaPicanto kiaPicanto){
        this.kiaPicanto = kiaPicanto;
    }
    public abstract String getDescription();
}
