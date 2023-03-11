public class FurnitureShopSimulator {
    public static void main(String[] args) {
        FurnitureFactory modernFactory = new ModernFurnitureFactory();

        Client modernClient = new Client(modernFactory);
        modernClient.getInfoAboutChair();
        modernClient.getInfoAboutSofa();
        modernClient.getInfoAboutCoffeeTable();

        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Client victorianClient = new Client(victorianFactory);
        victorianClient.getInfoAboutChair();
        victorianClient.getInfoAboutSofa();
        victorianClient.getInfoAboutCoffeeTable();

        FurnitureFactory artDecoFactory = new ArtDecoFurnitureFactory();
        Client artDecoClient = new Client(artDecoFactory);
        artDecoClient.getInfoAboutChair();
        artDecoClient.getInfoAboutSofa();
        artDecoClient.getInfoAboutCoffeeTable();
    }
}
