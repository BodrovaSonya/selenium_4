import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by sonya on 04.02.2018.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/"}, glue = {"my.company"},
        plugin = {
                "my.company.util.AllureReporter",
        }
)
public class CucumberRunner {

}
