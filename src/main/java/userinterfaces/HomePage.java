package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target LINK_TRANSPARENCIA = Target.the("LINK TRANSPARENCIA").located(By.xpath("/html/body/form/div[13]/div[1]/div[2]/div[4]/nav/div[2]/div/div[1]/div/div/ul/li[7]/a"));

    public static final Target LINK_PRESUPUESTO = Target.the("LINK PRESUPUESTO").located(By.xpath("/html/body/form/div[13]/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div/div[2]/div[2]/table[2]/tbody/tr[5]/td/a"));

    public static final Target LINK_ESTADOS_FINANCIEROS = Target.the("LINK ESTADOS FINANCIEROS").located(By.xpath("/html/body/form/div[13]/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/ul/li[3]/a"));

    public static final Target LINK_BALANCES = Target.the("LINK BALANCES").located(By.xpath("/html/body/form/div[13]/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/h3/div/div"));

    public static final Target LINK_PDF = Target.the("LINK PDF").located(By.xpath("/html/body/form/div[13]/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div/div[1]/div/ul/li[1]/div/div/div/a[1]"));


}
