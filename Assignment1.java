public class Assignment1 {

    public static void main(String[] args) {
        int M = 15;
        String good="Good Number";
      String bad="Bad Number";
      String poor="Poor Number";
      String anknown="Good Number";
        if (M % 3 == 0 && M % 5 == 0) {
            System.out.println(good);
        } else if (M % 3 == 0 && M % 5 != 0) {
            System.out.println(bad);
        } else if (M % 3 != 0 && M % 5 == 0) {
            System.out.println(poor);
        } else {
            System.out.println(anknown);
        }
    }

}
