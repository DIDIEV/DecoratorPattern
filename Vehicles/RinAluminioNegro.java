package Vehicles;

public class RinAluminioNegro extends CarDecorator {
    public RinAluminioNegro(KiaPicanto kiaPicanto){
        super(kiaPicanto);
    }
    public String getDescription(){
        return this.kiaPicanto.getDescription() + " + Rin de aliminio 14'' negro";
    }
    @Override
    public long cost() {
        return this.kiaPicanto.cost() + 500000;
    }
}
