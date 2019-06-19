package web.internaldemo.dbdatasetmodule.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class LoginPage extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://smartqe.io/\",\"report_upload_url\":\"https://smartqe.io:443/UploadReportFile\",\"project_name\":\"InternalDemo\",\"project_description\":\"desc\",\"project_id\":299,\"module_name\":\"DB Dataset Module\",\"module_description\":\"Test SmartQE DB Dataset validation\",\"sub_module_id\":0,\"module_id\":454,\"testcase_name\":\"smartqeLoginTest\",\"testcase_id\":483,\"testset_id\":0,\"executed_timestamp\":1862711865,\"browser_type\":\"chrome\"}";

	public static String projectName = "internaldemo";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 13;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//INPUT[@id='username']")	
	private WebElement	UserName_321229INPUT;
	public void fillINPUTUserName_321229(String varInputValue) {
		waitForExpectedElement(driver, UserName_321229INPUT);
		UserName_321229INPUT.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//INPUT[@id='password']")	
	private WebElement	Password_321231INPUT;
	public void fillINPUTPassword_321231(String varInputValue) {
		waitForExpectedElement(driver, Password_321231INPUT);
		Password_321231INPUT.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//SECTION[@id='site-content']/DIV[1]/DIV[1]/FORM[1]/DIV[3]/BUTTON[1]")	
	private WebElement	Login_321233BUTTON;
	public String clkBUTTONLogin_321233() {
		waitForExpectedElement(driver, Login_321233BUTTON);		
		String text = Login_321233BUTTON.getText();
		Login_321233BUTTON.click();
		return text;
	}

}