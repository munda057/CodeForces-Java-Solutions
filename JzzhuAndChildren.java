import java.util.*;

public class JzzhuAndChildren {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();

    Queue<Child> q = new LinkedList<>();
    for (int i = 1; i <= n; i++) {
      q.add(new Child(i, scanner.nextInt()));
    }
    int lastChild = 0;
    while (!q.isEmpty()) {
      Child child = q.poll();
      child.candies -= m;
      if (child.candies > 0) {
        q.add(child);
      } else {
        lastChild = child.index;
      }
    }
    System.out.println(lastChild);
  }

  static class Child {
    int index;
    int candies;

    public Child(int index, int candies) {
      this.index = index;
      this.candies = candies;
    }
  }
}
