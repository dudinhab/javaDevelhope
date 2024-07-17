public class ShapeFactory {
    public static Shape getShape(tipoShape tipo) {
        Shape shape = null;
        if (tipo.equals(tipoShape.CERCHIO)) {
            shape = new Cerchio();
        } else if (tipo.equals(tipoShape.RETTANGOLO)) {
            shape = new Rettangolo();
        }
        return shape;
    }
}
