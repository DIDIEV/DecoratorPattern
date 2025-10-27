package Vehicles;

public class Arrastre extends CarDecorator {
    public Arrastre(KiaPicanto kiaPicanto){
        super(kiaPicanto);
    }
    public String getDescription(){
        return this.kiaPicanto.getDescription() + " + Tiro de arrastre";
    }
    @Override
    public long cost() {
        return this.kiaPicanto.cost() + 810000;
    }
    
}
