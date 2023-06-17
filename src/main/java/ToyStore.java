import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ToyStore {
    private ArrayList<Toy> toysList = new ArrayList<Toy>();
    private ArrayList<Toy> prizeList = new ArrayList<Toy>();
    private String toysFile;
    private String prizeFile;

    public ToyStore(String toysFile, String prizeFile) {
        this.toysFile = toysFile;
        this.prizeFile = prizeFile;

        File file = new File(toysFile);

        try {
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String[] tokens = scanner.nextLine().split(";");

                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                int count = Integer.parseInt(tokens[2]);
                int frequency = Integer.parseInt(tokens[3]);

                toysList.add(new Toy(id, name, count, frequency));
            }

            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void addToy(int id, String name, int count) {
        toysList.add(new Toy(id, name, count, 0));

        try {
            FileWriter writer = new FileWriter(toysFile, true);

            writer.write(id + ";" + name + ";" + count + ";0\n");

            writer.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void changeFrequency(int id, int frequency) {
        for (Toy toy : toysList) {
            if (toy.getId() == id) {
                toy.setFrequency(frequency);

                try {
                    FileWriter writer = new FileWriter(toysFile, false);

                    for (Toy toy1 : toysList) {
                        writer.write(toy1.getId() + ";" + toy1.getName() + ";" + toy1.getCount() + ";" + toy1.getFrequency() + "\n");
                    }

                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                break;
            }
        }
    }

    public Toy play() {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int sum = 0;

        for (Toy toy : toysList) {
            sum += toy.getFrequency();

            if (number <= sum) {
                prizeList.add(toy);
                return toy;
            }
        }

        return null;
    }

    public Toy getPrizeToy() {
        Toy toy = prizeList.get(0);

        try {
            FileWriter writer = new FileWriter(prizeFile, true);

            writer.write(toy.getId() + ";" + toy.getName() + ";" + toy.getCount() + ";" + toy.getFrequency() + "\n");

            writer.close();
        }catch (IOException e) {
            e.printStackTrace();
        }

        prizeList.remove(0);

        for (Toy toy1 : toysList) {
            if (toy1.getId() == toy.getId()) {
                toy1.setCount(toy1.getCount() - 1);

                try {
                    FileWriter writer = new FileWriter(toysFile, false);

                    for (Toy toy2 : toysList) {
                        writer.write(toy2.getId() + ";" + toy2.getName() + ";" + toy2.getCount() + ";" + toy2.getFrequency() + "\n");
                    }

                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                break;
            }
        }

        return toy;
    }
}
