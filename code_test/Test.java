import java.util.ArrayList;
import java.util.List;

public class Test {

    // static int data[][] = { { 12001, 81001, 81001 },
    // { 8001, 54001, 54001 },
    // { 16001, 108001, 108001 }
    // };
    static int data[][] = { { 200, 220, 210 },
            { 180, 230, 190 },
            { 300, 400, 500 },
            { 500, 460, 400 } };

    // static int resource[] = { 200, 100, 100 };
    static int resource[] = { 2, 1, 1 };
    // static int resource[] = { 2, 2, 2 };

    static List<Integer> listRs;

    static int rs = -1;

    public static void main(String[] args) {
        // System.out.println();

        long start = System.currentTimeMillis();
        Node rootNode = new Node(0, -1);
        // for (int i = 0; i < cols; i++) {
        // Node n = new Node(data[0][i], 0);
        // root.child.add(n);
        // }
        buildTree(rootNode, 0, resource);
        List<Integer> ar = new ArrayList<>();
        solution(rootNode, ar);
        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");
        listRs.forEach(g -> {
            System.out.print(g + " ");
        });
        System.out.println(" :" + rs);
        System.out.println(rootNode);

    }

    static int rows = 4;
    static int cols = 3;

    public static void buildTree(Node root, int layer, int rr[]) {
        for (int i = 0; i < cols; i++) {
            if (rr[i] > 0 && data[layer][i] != -1) {
                Node n = new Node(data[layer][i], layer);
                root.child.add(n);
                // resource[i] = resource[i] - 1;
                // int _rr[] = Arrays.copyOf(rr, rr.length);
                // _rr[i] = _rr[i] - 1;
                if (layer < rows - 1) {
                    rr[i] = rr[i] - 1;
                    // System.out.println("Layer:: " + layer);
                    buildTree(n, layer + 1, rr);
                    rr[i] = rr[i] + 1;
                    // resource[i] = resource[i] + 1;
                }
            }
        }

        return;
    }

    public static void solution(Node root, List<Integer> ar) {
        ar.add(root.data);
        if (root.layer == rows - 1) {
            int rss = 0;
            for (int d = 0; d < ar.size(); d++) {
                rss = rss + ar.get(d);
                // System.out.print(ar.get(d) + " ");
            }
            if (rs == -1) {
                rs = rss;
                listRs = new ArrayList<>(ar);
            } else if (rs > rss) {
                rs = rss;
                listRs = new ArrayList<>(ar);
            }
            // System.out.println("rs:: " + rss);
        } else {
            root.child.forEach(n -> {
                if (n.child.size() >= 0) {
                    // System.out.println("n1:: " + n.data);
                    solution(n, ar);
                    // System.out.println("After: " + n.data);
                    ar.remove(ar.size() - 1);
                }
            });
        }
    }

}
