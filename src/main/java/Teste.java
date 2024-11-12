import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teste {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        // Cria uma instância do WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Acesse o site da WEG
            driver.get("https://www.weg.net/institutional/BR/pt/");

            // buscar um elemento (como um botão ou link) na página
            WebElement searchButton = driver.findElement(By.linkText("Saiba mais"));
            searchButton.click(); // Clica no botão de "Nossos Produtos"

            // Outra ação: pegar o título da página e imprimir
            System.out.println("Título da nova página: " + driver.getTitle());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Feche o navegador
            driver.quit();
        }
    }
}