// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.LinkedList;
// import java.util.List;
// import java.util.Queue;

// class Node {
//     int value;
//     int layer;
//     List<Node> child;

//     public Node(int value, int layer) {
//         this.value = value;
//         this.layer = layer;
//         this.child = new ArrayList<>();
//     }
// }

// public class TreeBuilder {
//     public static void buildTree(Node root, int layer, int rr[][]) {
//         int rows = rr.length;
//         int cols = rr[0].length;

//         Queue<Node> queue = new LinkedList<>();
//         queue.add(root);

//         while (!queue.isEmpty()) {
//             Node currentNode = queue.poll();

//             for (int i = 0; i < cols; i++) {
//                 if (rr[currentNode.layer][i] > 0 && data[currentNode.layer][i] != -1) {
//                     Node n = new Node(data[currentNode.layer][i], currentNode.layer + 1);
//                     currentNode.child.add(n);

//                     int[][] _rr = Arrays.copyOf(rr, rr.length);
//                     _rr[n.layer][i] = _rr[n.layer][i] - 1;

//                     if (n.layer < rows - 1) {
//                         queue.add(n);
//                     }
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int rows = 3; // Đổi giá trị rows nếu cần
//         int cols = 4; // Đổi giá trị cols nếu cần
//         int[][] rr = new int[rows][cols]; // Thay thế rr bằng mảng rr thực tế của bạn
//         int startLayer = 0; // Đổi giá trị startLayer nếu cần

//         Node root = new Node(data[startLayer][0], startLayer);
//         buildTree(root, startLayer, rr);
//     }
// }
