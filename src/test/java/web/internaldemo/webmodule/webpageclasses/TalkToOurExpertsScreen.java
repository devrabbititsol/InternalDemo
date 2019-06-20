package web.internaldemo.webmodule.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class TalkToOurExpertsScreen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://www.devrabbit.com/\",\"report_upload_url\":\"https://smartqe.io:443/UploadReportFile\",\"project_name\":\"InternalDemo\",\"project_description\":\"desc\",\"project_id\":299,\"module_name\":\"WebModule\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":435,\"testcase_name\":\"TC_Devrabbit_Contact\",\"testcase_id\":484,\"testset_id\":0,\"executed_timestamp\":1934162303,\"browser_type\":\"chrome\"}";

	public static String projectName = "internaldemo";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public TalkToOurExpertsScreen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//HTML/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[8]/DIV[1]/A[1]")	
	private WebElement	TalkToOurExperts_322506A;
	public String clkATalkToOurExperts_322506() {
		waitForExpectedElement(driver, TalkToOurExperts_322506A);		
		String text = TalkToOurExperts_322506A.getText();
		TalkToOurExperts_322506A.click();
		return text;
	}

}