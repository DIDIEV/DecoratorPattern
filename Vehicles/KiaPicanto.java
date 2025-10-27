package Vehicles;

public abstract class KiaPicanto {
    protected String description = "Default placeholder";

    public String getDescription(){
        return description;
    }

    public abstract long cost();
}
