public abstract class Strumento implements Informazione{
    protected String marca;
    protected String modelo;
    protected double prezzo;


    @Override
    public String mostraInformazione(){
        return "marca: "+marca+" modelo: "+modelo+" prezzo: "+prezzo;
    };

    @Override
    public abstract double calcoloPrezo();
}
