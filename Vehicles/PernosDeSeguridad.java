package Vehicles;

public class PernosDeSeguridad extends CarDecorator{
    public PernosDeSeguridad(KiaPicanto kiaPicanto){
        super(kiaPicanto);
    }
    public String getDescription(){
        return this.kiaPicanto.getDescription() + " + Pernos de seguridad";
    }
    @Override
    public long cost() {
        return this.kiaPicanto.cost() + 156100;
    }
}
