package cucumber.Options;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/features",
        glue="stepDefinitions",
        dryRun=false,    //false real run
        tags="@smoke",
        monochrome = true,
        //strict=true,
        plugin={
                "pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/failed.txt"
        }

)

public class TestRunner {


}
