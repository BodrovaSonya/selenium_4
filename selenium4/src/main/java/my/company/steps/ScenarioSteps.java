package my.company.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;

/**
 * Created by sonya on 04.02.2018.
 */
public class ScenarioSteps {
    MainSteps mainSteps = new MainSteps();
    RequestSteps requestSteps = new RequestSteps();
    TravelInsuranceSteps travelInsuranceSteps = new TravelInsuranceSteps();

    @When("^выбран пункт меню \"(.+)\"$")
    public void stepSelectSectionItem(String nameSection) {
        mainSteps.selectSection(nameSection);
    }

    @When("^выбран вид страхования - \"(.+)\"$")
    public void stepSelectTypeInsurance(String typeName){
        mainSteps.insuranceType(typeName);
    }

    @Then("^получен вид страхования \"(.+)\"$")
    public void stepGetTypeOfInsurance(String typeName){
        mainSteps.waitElement(mainSteps.getInsuranceElement(typeName));
    }

    @Then("^произведено ожидание элемента \"(.+)\"$")
    public void stepWaitElement(WebElement nameElement){
        mainSteps.waitElement(nameElement);
    }

    @Then("^произведено ожидание заголовка")
    public void stepWaitTitle () {
        travelInsuranceSteps.waitElement(travelInsuranceSteps.getTitle());
    }

    /*@When("^когда получен заголовок страницы")
    public void stepTitleGet(String title){
        travelInsuranceSteps.getTitle();
    }*/

    @Then("^заголовок проверен по шаблону \"(.+)\"$")
    public void stepCheckTitle (String title) {
        travelInsuranceSteps.checkTitleErrorMessage(title);
    }

    @When("^выбирается оформление заявки онлайн")
    public void stepCheckOutOnline(){
        travelInsuranceSteps.checkOutOnline();
    }

    @Then("^произошла смена рабочего окна")
    public void stepSwitchWindow() {
        travelInsuranceSteps.switchWindow();
    }

    @When("^выбрана сумма - \"(.+)\"$")
    public void stepChooseSum(String sum){
        requestSteps.chooseSum(sum);
    }

    @Then("^выбрано оформление заявки")
    public void stepExecute () {
        requestSteps.execute();
    }

    @When("^заполняются поля:$")
    public void fillForm(DataTable fields) {
        fields.asMap(String.class, String.class)
                .forEach((field, value) -> requestSteps.fillField(field, value));
    }

    @When("^выбран пол \"(.+)\"$")
    public void stepChooseGender (String sex) {
        requestSteps.chooseGender(sex);
    }

    @Then("^значения полей равны:$")
    public void checkFillForm(DataTable fields) {
        fields.asMap(String.class, String.class)
                .forEach((field, value) -> requestSteps.checkField(field, value));
    }

    @When("^выбрано продолжение оформления заявки")
    public void stepClickContinue(){
        requestSteps.clickContinue();
    }

    @Then("^появилось сообщение об ошибке \"(.+)\"")
    public void stepCheckError(String errorMessage){
        requestSteps.checkErrorMessage(errorMessage);
    }
}
