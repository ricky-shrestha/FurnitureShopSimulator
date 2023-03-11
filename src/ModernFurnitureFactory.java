public class ModernFurnitureFactory extends FurnitureFactory{
    public Chair createChair() {
        return new ModernChair();
    }

    public Sofa createSofa() {
        return new ModernSofa();
    }

    public  CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }

}
