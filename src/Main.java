import backend.Store;
import backend.StoreFiller;
import backend.flower.category.Flower;

public class Main {

    private Store store;

    public Main(Store store) {
        this.store = store;
    }

    public static void main(String[] args) {
        StoreFiller filler = new StoreFiller();
        Main main = new Main(filler.createStore(100, 50, 10));
        main.showAvailableActions();
        main.excecute(4);
    }

    public void showAvailableActions() {
        System.out.println("Choose action?\n" +
                "1 Show all products,\n" +
                "2 Show flowers,\n" +
                "3 Show trees,\n" +
                "4 Show bushes");

    }

    public void excecute(int actionNumber) {
        switch (actionNumber) {
            case 1:
                store.getAllProducts();
                break;
            case 2:
                store.getPlants(false);
                break;
            case 3:
                store.getPlantsByType("tree");
                break;
            case 4:
                store.getPlantsByCategory(Flower.JASMINE.name());
                break;
        }
    }
}
