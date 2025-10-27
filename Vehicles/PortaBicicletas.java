package Vehicles;

public class PortaBicicletas extends CarDecorator {
    public PortaBicicletas(KiaPicanto kiaPicanto){
        super(kiaPicanto);
    }
    public String getDescription(){
        return this.kiaPicanto.getDescription() + " + PortaBicicletas";
    }
    @Override
    public long cost() {
        return this.kiaPicanto.cost() + 910000;
    }
}
