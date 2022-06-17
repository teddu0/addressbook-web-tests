package org.portalbilet.pbilet;

import org.testng.annotations.Test;

public class SetIndividualDataTest extends BaseSeleniumTest {

    UserPage u = new UserPage();
    LoginPage l = new LoginPage();

    @Test
    public void setPaymentInfoForIndividualUser() throws InterruptedException {
        // Переход в раздел заполнения данныех для выплат
        u.setIndividualInfo();
        // Заполнение данных для физ лица
        u.enterParamsForIndividual("Anriano Smoke", "Iron Roads", "123", "3-34-45", "langress@hmail.com", "23.06.1992", "1221 321321");
        // Сохранение формы
        u.submit();
        Thread.sleep(4000);
    }

    @Test
    public void setPaymentInfoForLegalUser() throws InterruptedException {
        u.setIndividualInfo();
        u.switchToLegalEntity();
        u.enterParamsForLegals("Enrique Huesis", "Iron Roads", "123", "3-34-45", "langress@hmail.com", "23.06.1992", "1221 321321");
        u.submit();
        Thread.sleep(4000);
    }


}

