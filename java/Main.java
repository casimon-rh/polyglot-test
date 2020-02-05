public class Main {
  static void funn(int n) {
    int c = 0;
    for (int x = 0; x < n * n * 2; x++) {
      int a = (int) Math.floor(x / n);
      int b = n * (a + 1);
      int p = b - x;
      int q = x - b + n + 1;
      if (a % 2 > 0) {
        System.out.print(q > c ? q : " ");
      } else {
        System.out.print(p > c ? p : " ");
      }
      if ((x + 1) % (n * 2) == 0) {
        System.out.println();
        c++;
      }
    }
  }
  public static void main(String[] args) {
    funn(5);
  }
}