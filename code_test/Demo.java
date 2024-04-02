public class Demo {

  public static Nodee createTree(int[][] array) {
    if (array == null || array.length == 0 || array[0].length == 0) {
      return null;
    }

    Nodee root = new Nodee(array[0][0]);
    for (int i = 1; i < array.length; i++) {
      root.addChild(new Nodee(array[i][0]));
      for (int j = 1; j < array[i].length; j++) {
        root.getChildren().get(i - 1).addChild(new Nodee(array[i][j]));
      }
    }
    return root;
  }

  public static void printTree(Nodee root) {
    if (root == null) {
      return;
    }

    System.out.println(root.getValue());
    for (Nodee child : root.getChildren()) {
      printTree(child);
    }
  }

  public static void main(String[] args) {
    int[][] array = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };

    Nodee root = createTree(array);
    printTree(root);
  }
}
