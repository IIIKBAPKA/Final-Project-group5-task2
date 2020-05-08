import java.util.Scanner;

import static com.codeborne.selenide.Selenide.$;

public class AkinatorGames {
    public static void main(String[] args) {
        DriverWrapper driverWrapper = new DriverWrapper();
        Dialog dialog = driverWrapper.setUp();
        Scanner scanner = new Scanner(System.in);
        for(;$("p.question-text").exists();){
            dialog.question();
            dialog.answer(scanner.nextInt());
        }
    }
}
