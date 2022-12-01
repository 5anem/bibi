package renastech.runner;



//2 Things
//RunWith      --->JUnit -----Cucumber works with Junit by default , normaly developers usually creat testng with Junit
//Cucumber options


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources",
        glue = "renastech/Steps_Definations", //glue is step defination in java cucumber language
        tags = "@Maping",
        dryRun= false          //it will check if there is undifianed steps definations
)
public class TestRunner {

}

