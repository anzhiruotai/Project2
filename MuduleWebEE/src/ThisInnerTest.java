/**
 * @author tomjack
 * @create 2020-07-01 13:52
 */
public class ThisInnerTest {
    private String name;

    class InnerClass {
        public InnerClass() {
            ThisInnerTest thisInnerTest = ThisInnerTest.this;
            String outerName = thisInnerTest.name;
        }
    }
}
