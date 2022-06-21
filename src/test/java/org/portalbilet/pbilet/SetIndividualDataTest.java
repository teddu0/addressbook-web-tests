package org.portalbilet.pbilet;

import org.testng.annotations.Test;

public class SetIndividualDataTest extends BaseSeleniumTest {

    @Test
    public void setPaymentInfoForIndividualUser() throws InterruptedException {
        // Переход в раздел заполнения данныех для выплат
        setIndividualInfo();
        // Заполнение данных для физ лица
        enterParamsForIndividual("Anriano Smoke", "Iron Roads", "123", "3-34-45", "langress@hmail.com", "23.06.1992", "1221 321321");
        // Сохранение формы и сравнение результата
        submit();
        Thread.sleep(4000);
    }

    @Test
    public void setPaymentInfoForLegalUser() throws InterruptedException {
        // Переход в раздел заполнения данныех для выплат
        setIndividualInfo();
        // Переход к форме для юридических лиц
        switchToLegalEntity();
        // Заполнение данных для юр. лица
        enterParamsForLegals("Enrique Huesis", "Iron Roads", "123", "3-34-45", "langress@hmail.com", "23.06.1992", "1221 321321");
        // Сохранение формы и сравнение результата
        submit();
        Thread.sleep(4000);
    }


}

