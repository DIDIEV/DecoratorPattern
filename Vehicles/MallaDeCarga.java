package Vehicles;

public class MallaDeCarga extends CarDecorator{

    public MallaDeCarga(KiaPicanto kiaPicanto){
        super(kiaPicanto);
    }
    
    public String getDescription(){
        return this.kiaPicanto.getDescription() + " + Malla de carga";
    }
    @Override
    public long cost() {
        return this.kiaPicanto.cost() + 110000;
    }
}
