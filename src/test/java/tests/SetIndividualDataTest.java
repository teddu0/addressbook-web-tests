package tests;

import org.testng.annotations.Test;

public class SetIndividualDataTest extends BaseSeleniumTest {

    @Test
    public void setPaymentInfoForIndividualUser() throws InterruptedException {
        // Переход в раздел заполнения данныех для выплат
        app.setIndividualInfo();
        // Заполнение данных для физ лица
        app.enterParamsForIndividual("Anriano Smoke", "Iron Roads", "123", "3-34-45", "langress@hmail.com", "23.06.1992", "1221 321321");
        // Сохранение формы и сравнение результата
        app.submit();
        Thread.sleep(4000);
    }

    @Test
    public void setPaymentInfoForLegalUser() throws InterruptedException {
        // Переход в раздел заполнения данныех для выплат
        app.setIndividualInfo();
        // Переход к форме для юридических лиц
        app.switchToLegalEntity();
        // Заполнение данных для юр. лица
        app.enterParamsForLegals("Enrique Huesis", "Iron Roads", "123", "3-34-45", "langress@hmail.com", "23.06.1992", "1221 321321");
        // Сохранение формы и сравнение результата
        app.submit();
        Thread.sleep(4000);
    }


}

