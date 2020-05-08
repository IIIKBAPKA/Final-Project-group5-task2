import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Selenide.$;

public class Dialog {
    private WebDriver driver;
    private int i = 1;

    public Dialog(WebDriver driver) { this.driver=driver;}
    public void question(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(driver1 -> (Integer.parseInt($(".question-number").getText())==i));
        System.out.println($("p.question-text").getText()+"(Input your answer)");
        System.out.println("1. Yes\n2. No\n3. Don't know\n4. Probably\n5. Probably not");
        i++;
    }
    public void answer(int x){
        switch (x){
            case 1:
                $("#a_yes").click();
                break;
            case 2:
                $("#a_no").click();
                break;
            case 3:
                $("#a_dont_know").click();
                break;
            case 4:
                $("#a_probably").click();
                break;
            case 5:
                $("#a_probably_not").click();
                break;
            default:
                System.out.println("This number is incorrect");
                return;
        }
    }
}
