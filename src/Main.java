public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(10000, 20); // должно получиться 500
        System.out.println(miles);
    }
}