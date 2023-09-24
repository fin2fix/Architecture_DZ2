import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // ItemFabric generator = new GoldGenerator();
        // generator.openReward();
        // generator = new GemGenerator();
        // generator.openReward();

        Random rnd = new Random();
        List<ItemFabric> fabricList = new ArrayList<>();

        fabricList.add(new GoldGenerator());
        fabricList.add(new GemGenerator());
        fabricList.add(new SilverGenerator());

        for (int i = 0; i < 11; i++) {
            int index = rnd.nextInt(0, 20) % fabricList.size();
            ItemFabric fabric = fabricList.get(index);
            fabric.openReward();
        }
  
  // Singleton new1 = new Singleton(); // напрямую создать нельзя, конструктор не виден
  Singleton test = Singleton.getInstance();
  test.Method1();
  System.out.println("\n" + test);
    }
}
