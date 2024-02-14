package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;





@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/MakeAppointment.feature",glue= {"stepDefinations"},
      monochrome=true,
    plugin =  {"pretty","html:target/HtmlReports/report.html"}
		)

//@RunWith(Cucumber.class)
//@CucumberOptions(features="src/test/resources/Features/LoginPage.feature",glue= {"stepDefinations"},
//      monochrome=true,
//    plugin =  {"pretty","html:target/HtmlReports/report.html"}
//		)






public class RunnerFile {

}
