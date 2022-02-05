public class Main {
    public static void main(String[] args) {

        // входные данные

        int wallet = 350;
        int putMoney = 2300;

        // логика

        int bonus;
        if (putMoney >= 1000) {
            bonus = putMoney / 100;
        } else {
            bonus = 0;
        }
        int withoutBonus = wallet + putMoney;
        int total = wallet + putMoney + bonus;
        System.out.println("Ваш счёт: " + withoutBonus);
        System.out.println("Бонусные рубли: " + bonus);
        System.out.println("Итоговый счёт с бонусными рублями: " + total);
    }
}
