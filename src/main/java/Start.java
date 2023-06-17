public class Start {
    public static void main(String[] args) {

        ToyStore store = new ToyStore("toysFile.txt", "prizeFile.txt");

        store.addToy(1, "Bear", 10);
        store.addToy(2, "Car", 12);
        store.addToy(3, "Watercolor", 25);
        store.addToy(4, "Notebook", 30);
        store.addToy(5, "Pyramid", 20);
        store.addToy(6, "Memories", 18);
        store.addToy(7, "Book", 15);

        store.changeFrequency(1, 30);
        store.changeFrequency(2, 20);
        store.changeFrequency(3, 50);
        store.changeFrequency(4, 60);
        store.changeFrequency(5, 40);
        store.changeFrequency(6, 35);
        store.changeFrequency(7, 25);

        for (int i = 0; i <10; i++) {
            Toy toy = store.play();

            System.out.println("Your prize: " + toy.getName());

            store.getPrizeToy();
        }

    }
}
