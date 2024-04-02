import java.util.ArrayList;
import java.util.List;

public class Node {
    public int layer;
    public int data;
    public List<Node> child;
    public Node(int data, int layer) {
        this.data = data;
        this.layer = layer;
        this.child = new ArrayList<>();
    }
}
