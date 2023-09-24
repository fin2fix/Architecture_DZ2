public class SilverGenerator extends ItemFabric {

  @Override
  public iGameItem createItem() {
    System.out.println("Создал новый сундук с серебром");
    return new SilverReward();
  }
}
