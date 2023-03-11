public class ArtDecoFurnitureFactory extends FurnitureFactory {
    public Chair createChair() {
        return new ArtDecoChair();
    }

    public Sofa createSofa() {
        return new ArtDecoSofa();
    }

    public  CoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }
}
