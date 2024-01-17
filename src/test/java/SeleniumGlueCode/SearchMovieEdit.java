package SeleniumGlueCode;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SearchMovieEdit {

    SoftAssert softAssert = new SoftAssert();
    String name;
    Response response;
    int num;
    private WebDriver driver= hook.getDriver();



    @Before
    public void beforeTest(){
        num = (int)(Math.random()*6 +1);
    }


    @Given("I am an user at the Wikipedia WebPage requesting SW movie")
    public void search_movie_from_API() {
        response = RestAssured.given().get("https://swapi.dev/api/films/" +num);
        name = response.jsonPath().get("title");
        System.out.println(name);


    }
    @When("I search the requested movie name on Wikipedia search")
    public void i_search_movie_name_on_wikipedia_search() {
        driver.findElement(By.cssSelector("#searchLanguage option[value='en']")).click();
        WebElement busqueda = driver.findElement(By.id("searchInput"));
        busqueda.sendKeys(name);
        WebElement boton = driver.findElement(By.cssSelector(".pure-button"));
        boton.click();

    }
    @When("go to the article page and click on the Edit Link")
    public void go_to_the_article_page_and_click_on_the_edit_link() {

        WebElement editButton = driver.findElement(By.id("ca-edit"));
        editButton.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    @Then("Check the edit page is displayed correctly, including the matching of the title for the article page")
    public void check_the_edit_page_and_title() {
        WebElement editArea = driver.findElement(By.id("wpTextbox1"));
        if ( editArea.isDisplayed()){
            System.out.println("el editor se encuentra habilitado");

            String title = driver.findElement(By.id("firstHeadingTitle")).getText();


            Assert.assertTrue(title.contains(name));

            System.out.println(" el titulo coincide con el titulo obtenido en la api ");

        }else {
            System.out.println( "el editor no esta habilitado ");
        }

    }



}
