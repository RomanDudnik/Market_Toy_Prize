public class Toy {
    private int id;
    private String name;
    private int count;
    private int frequency;


    public Toy(int id, String name, int quantity, int weight) {
        this.id = id;
        this.name = name;
        this.count = quantity;
        this.frequency = weight;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public int getFrequency() {
        return frequency;
    }
    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}