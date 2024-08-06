import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Сколько Жабьих глаз у вас есть?");
        int toadEyesCount = new Scanner(System.in).nextInt();
        System.out.println("Сколько Костей ворона у вас есть?");
        int ravenBonesCount = new Scanner(System.in).nextInt();

        if (toadEyesCount / 3 >= 1 && ravenBonesCount >= 1) {
            if (toadEyesCount / 3 >= ravenBonesCount) {
                System.out.println("Вам хватает на " + ravenBonesCount  + " элексиров зоркости");
            } else {
                System.out.println("Вам хватает на " + toadEyesCount / 3 + " элексиров зоркости");
            }
        }
        else  {
                    System.out.println("Вам не хватает на элексир зоркости");
        }
    }
}

//public class Main {
//    public static void main(String[] args) {
//        //todo Тут увольняем айтишников
//    }
//}