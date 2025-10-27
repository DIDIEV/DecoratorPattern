import Vehicles.*;

public class Main {
    public static void main(String[] args) {

        //creation of a new GTLine picanto with some accesories
        KiaPicanto gtLineKiaPicanto = new GTLine();
        gtLineKiaPicanto = new MallaDeCarga(gtLineKiaPicanto);
        gtLineKiaPicanto = new PortaBicicletas(gtLineKiaPicanto);
        System.out.println( "\n" + gtLineKiaPicanto.getDescription() + ": $" + gtLineKiaPicanto.cost());
        
        //creation of a new Vibrant MT with some accesories
        KiaPicanto vibrantMT = new Vehicles.VibrantMT();
        vibrantMT = new SensorDeParqueo(vibrantMT);
        vibrantMT = new RinAluminioNegro(vibrantMT);
        vibrantMT = new PortaBicicletas(vibrantMT);
        System.out.println(vibrantMT.getDescription() + ": $" + vibrantMT.cost());

        //creation of a new Zenith AT with no accesories
        KiaPicanto zenithAT = new ZenithAT();
        System.out.println(zenithAT.getDescription() + ": $" + zenithAT.cost() + "\n");
    }
}
