public class Report5 {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            // 条件1
            System.out.println("NullPointerExceptionが発生しました。");

            // 条件3
            System.out.println("例外メッセージ: " + e.getMessage());
        }
    }
}