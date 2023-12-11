public class Report5 {
    public static void main(String[] args) {
        String str = "壱百満";
        try {
            int value = Integer.parseInt(str);
            System.out.println("変換成功: " + value);
        } catch (NumberFormatException e) {
            System.out.println("変換失敗: " + e.getMessage());
        }
    }
}