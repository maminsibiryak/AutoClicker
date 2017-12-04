import java.awt.event.InputEvent;
import java.awt.event.ItemEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AutoClickerMain {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("---AutoClicker---");
        System.out.println("Введите количество кликов");
        int clicks = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Введите сколько ждать между кликами");
        int delay = Integer.parseInt(bufferedReader.readLine());

        for (int i = 3; i>0 ; i--) {

            try {
                System.out.println("Программа выолнится через "+ i+" секунд");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        AutoClicker clicker = new AutoClicker();
        clicker.setDelay(delay);
        for (int i = 0; i <clicks ; i++) {
            clicker.mousePress(InputEvent.BUTTON1_MASK);
        }

        System.out.println("Конец программы");
    }
}
