public class Client {
    private FurnitureFactory factory;

    public Client(FurnitureFactory factory) {
        this.factory = factory;
    }
    public void getInfoAboutChair() {
        Chair chair = factory.createChair();
        chair.aboutChair();
    }

    public void getInfoAboutSofa() {
        Sofa sofa = factory.createSofa();
        sofa.aboutSofa();
    }

    public void getInfoAboutCoffeeTable() {
        CoffeeTable coffeeTable = factory.createCoffeeTable();
        coffeeTable.aboutCoffeeTable();
    }
}
