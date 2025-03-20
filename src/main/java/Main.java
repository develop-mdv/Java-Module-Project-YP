import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        for (int i = 0; i<3;i++){
            System.out.println(String.format("Введите название автомобиля №%d", i+1));
            String name = scanner.next();
            int speed;
            while (true) {
                System.out.println(String.format("Введите скорость автомобиля №%d", i + 1));
                if (scanner.hasNextInt()){
                    speed = scanner.nextInt();
                    if (speed>0 && speed<=250) {
                        break;
                    }
                    else {
                        System.out.println("Неправильная скорость(от 0 до 250 значение должно быть)");
                    }
                }
                else {
                    System.out.println("Неправильная скорость, должно быть число");
                }

            }
            Car car = new Car(name, speed);
            race.leader_cheak(car);

        }
        System.out.println(String.format("Самая быстрая машина: %s", race.leader.name));
    }
}