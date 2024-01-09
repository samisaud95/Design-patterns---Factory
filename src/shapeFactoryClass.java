public class shapeFactoryClass {

    public static Shape TipeOfShape(TipeOfShape tipeOfShape){
      return   switch (tipeOfShape.getCaratteristiche()){
            case  "Cerchio" -> new Cerchio();
            case  "Triangolo" -> new Triangolo();
            case "Rettangolo" -> new Rettangolo();
            case "Cilindro" -> new Cilindro();
            default -> null;
            };
      }
    }


