//import java.util.ArrayList;
//import java.util.List;
//
//public class TreeFromArray {
//    public static MultiwayTreeNode<Integer> buildTreeFrom2DArray(int[][] array) {
//        if (array == null || array.length == 0 || array[0].length == 0) {
//            return null;
//        }
//
//        int rootValue = array[0][0];
//        MultiwayTreeNode<Integer> root = new MultiwayTreeNode<>(rootValue);
//
//        List<MultiwayTreeNode<Integer>> currentLevel = new ArrayList<>();
//        currentLevel.add(root);
//
//        for (int i = 1; i < array.length; i++) {
//            List<MultiwayTreeNode<Integer>> nextLevel = new ArrayList<>();
//
//            for (int j = 0; j < array[i].length; j++) {
//                MultiwayTreeNode<Integer> node = new MultiwayTreeNode<>(array[i][j]);
//
//                // Thêm nút vào danh sách con của nút cha tương ứng
//                MultiwayTreeNode<Integer> parent = currentLevel.get(j / 2);
//                parent.addChild(node);
//
//                nextLevel.add(node);
//            }
//
//            currentLevel = nextLevel;
//        }
//
//        return root;
//    }
//
//    public static void main(String[] args) {
//        int[][] array = {
//            {1},
//            {2, 3},
//            {4, 5, 6},
//            {7, 8, 9, 10}
//        };
//
//        MultiwayTreeNode<Integer> root = buildTreeFrom2DArray(array);
//
//        // In cây theo kiểu tiền thứ tự để kiểm tra
//        preorderTraversal(root);
//    }
//
//    public static <T> void preorderTraversal(MultiwayTreeNode<T> root) {
//        if (root != null) {
//            System.out.print(root.getData() + " ");
//            for (MultiwayTreeNode<T> child : root.getChildren()) {
//                preorderTraversal(child);
//            }
//        }
//    }
//}
