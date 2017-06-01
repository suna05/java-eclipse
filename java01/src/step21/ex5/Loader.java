package step21.ex5;

public abstract class Loader extends Car { //abstract추가
  Object storage;

  public Loader() {
    super();
  }

  public Loader(String model, String maker, int cc) {
    super(model, maker, cc);
  }

  public void load(Object obj) {
    this.storage = obj;
    System.out.printf("%s를(을) 실었습니다.\n", obj);
  }

}