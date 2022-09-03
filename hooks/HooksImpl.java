package hooks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import stepDef.ProjectSpecificMethod;

public class HooksImpl extends ProjectSpecificMethod {
	
	@BeforeStep
	public void beforeStep() {
		System.out.println("This is before starting every step");
	}
	
	@AfterStep
	public void takeSnap() throws IOException {
		System.out.println("Going to take a snap shot");
		File source = driver.getScreenshotAs(OutputType.FILE);
		
		
		File dest = new File ("snap" +i+ ".png");
		FileUtils.copyFile(source, dest);
		i++;
	}

}
