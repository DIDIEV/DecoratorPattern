package Vehicles;

public class BotonDeArranque extends CarDecorator {
    
    public BotonDeArranque(KiaPicanto kiaPicanto){
        super(kiaPicanto);
    }

    public String getDescription(){
        return this.kiaPicanto.getDescription() + " + Botón de arranque";
    }
    @Override
    public long cost() {
        return this.kiaPicanto.cost() + 1500000;
    }
}
