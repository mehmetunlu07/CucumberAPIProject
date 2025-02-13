package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/features",
        glue="stepDefinitions",
        dryRun=false,    //false: real run  true:compiling and tell missing steps
        tags="@tag1",
        monochrome = true,
        //strict=true,
        plugin={
                "pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/failed.txt",
             //   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" // Extent Reports adapter
        }

)

public class TestRunner  {


}
