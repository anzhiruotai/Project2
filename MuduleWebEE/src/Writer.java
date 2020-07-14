/**
 * @author tomjack
 * @create 2020-07-01 13:50
 */
public class Writer {
    private int age;
    private String name;
    private String bookName;

    public Writer(WriterBuilder builder) {
        this.age = builder.age;
        this.name = builder.name;
        this.bookName = builder.bookName;
    }

    public static class WriterBuilder {
        public String bookName;
        private int age;
        private String name;

        public WriterBuilder(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public WriterBuilder writeBook(String bookName) {
            this.bookName = bookName;
            return this;
        }

        public Writer build() {
            return new Writer(this);
        }
    }

    public static void main(String[] args) {
        Writer writer = new Writer.WriterBuilder(18,"沉默王二")
                .writeBook("《Web全栈开发进阶之路》")
                .build();
    }
}
