package Vehicles;

public class AlarmasMatrix extends CarDecorator {
    public AlarmasMatrix(KiaPicanto kiaPicanto){
        super(kiaPicanto);
    }
    public String getDescription(){
        return this.kiaPicanto.getDescription() + " + 2 alarmas matrix";
    }
    @Override
    public long cost() {
        return this.kiaPicanto.cost() + 205000;
    }
}
