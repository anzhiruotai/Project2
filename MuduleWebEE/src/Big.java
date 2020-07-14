/**
 * @author tomjack
 * @create 2020-06-21 20:07
 */
public class Big {
    public static void main(String[] args) {
        System.out.println("big");
        int a = 0;
        getPrintln(a);



        getPrintln(a);
        try {
            System.out.println(b);
        } catch (Exception e) {
            try {
                e.printStackTrace();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }


    }

    private static void getPrintln(int a) {
        System.out.println(a);
    }
}
