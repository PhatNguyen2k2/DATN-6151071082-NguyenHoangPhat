import java.util.ArrayList;
import java.util.List;

public class Nodee {
  private int value;
  private List<Nodee> children;

  public Nodee(int value) {
    this.value = value;
    this.children = new ArrayList<>();
  }

  public int getValue() {
    return value;
  }

  public List<Nodee> getChildren() {
    return children;
  }

  public void addChild(Nodee child) {
    children.add(child);
  }
}