import Vehicles.*;

public class Main {
    public static void main(String[] args) {

        KiaPicanto gtLineKiaPicanto = new GTLine();
        gtLineKiaPicanto = new MallaDeCarga(gtLineKiaPicanto);
        gtLineKiaPicanto = new PortaBicicletas(gtLineKiaPicanto);
        System.out.println(gtLineKiaPicanto.getDescription() + ": $" + gtLineKiaPicanto.cost());

    }
}
