public class Main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();

        Toy toy1 = new Toy(1, "Puzzle", 10, 20);
        toyStore.addToy(toy1);

        Toy toy2 = new Toy(2, "Ball", 15, 20);
        toyStore.addToy(toy2);

        Toy toy3 = new Toy(3, "LEGO", 20, 60);
        toyStore.addToy(toy3);

        toyStore.showAvailableToys();

        toyStore.updateToyWeight(2, 50);

        toyStore.playToys();

        toyStore.showAvailableToys();
    }
}