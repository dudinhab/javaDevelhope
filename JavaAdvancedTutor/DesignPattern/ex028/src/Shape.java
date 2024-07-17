public interface Shape {
    public default Shape draw(){
        return this;
    };
}
