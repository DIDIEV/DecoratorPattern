package Vehicles;

public class RinAluminio extends CarDecorator {
    public RinAluminio(KiaPicanto kiaPicanto){
        super(kiaPicanto);
    }
    public String getDescription(){
        return this.kiaPicanto.getDescription() + " + Rin de aluminio 13''";
    }
    @Override
    public long cost() {
        return this.kiaPicanto.cost() + 350000;
    }
}
