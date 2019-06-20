package web.internaldemo.webmodule.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class HomeScreen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://www.devrabbit.com/\",\"report_upload_url\":\"https://smartqe.io:443/UploadReportFile\",\"project_name\":\"InternalDemo\",\"project_description\":\"desc\",\"project_id\":299,\"module_name\":\"WebModule\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":435,\"testcase_name\":\"TC_Devrabbit_Contact\",\"testcase_id\":484,\"testset_id\":0,\"executed_timestamp\":1934162303,\"browser_type\":\"chrome\"}";

	public static String projectName = "internaldemo";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public HomeScreen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//LI[@id='menu-item-833']/A[1]")	
	private WebElement	Technology_321962A;
	public String clkATechnology_321962() {
		waitForExpectedElement(driver, Technology_321962A);		
		String text = Technology_321962A.getText();
		mouseHover(driver,Technology_321962A);
		return text;
	}

	@FindBy(how = How.XPATH, using = "//LI[@id='menu-item-358']/A[1]")	
	private WebElement	MobileApplicationTesting_322003A;
	public String clkAMobileApplicationTesting_322003() {
		waitForExpectedElement(driver, MobileApplicationTesting_322003A);		
		String text = MobileApplicationTesting_322003A.getText();
		MobileApplicationTesting_322003A.click();
		return text;
	}

}