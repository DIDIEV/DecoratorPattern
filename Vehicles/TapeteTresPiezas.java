package Vehicles;

public class TapeteTresPiezas extends CarDecorator{
    public TapeteTresPiezas(KiaPicanto kiaPicanto){
        super(kiaPicanto);
    }
    public String getDescription(){
        return this.kiaPicanto.getDescription() + " + Tapete tres piezas"; 
    }
    @Override
    public long cost() {
        return this.kiaPicanto.cost() + 92000;
    }
}
