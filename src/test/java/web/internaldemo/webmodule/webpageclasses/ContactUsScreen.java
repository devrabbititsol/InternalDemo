package web.internaldemo.webmodule.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class ContactUsScreen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://www.devrabbit.com/\",\"report_upload_url\":\"https://smartqe.io:443/UploadReportFile\",\"project_name\":\"InternalDemo\",\"project_description\":\"desc\",\"project_id\":299,\"module_name\":\"WebModule\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":435,\"testcase_name\":\"TC_Devrabbit_Contact\",\"testcase_id\":484,\"testset_id\":0,\"executed_timestamp\":1869990625,\"browser_type\":\"chrome\"}";

	public static String projectName = "internaldemo";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public ContactUsScreen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//INPUT[@id='ninja_forms_field_19']")	
	private WebElement	Ninja_forms_field_19_322926INPUT;
	public void fillINPUTNinja_forms_field_19_322926(String varInputValue) {
		waitForExpectedElement(driver, Ninja_forms_field_19_322926INPUT);
		Ninja_forms_field_19_322926INPUT.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//INPUT[@id='ninja_forms_field_20']")	
	private WebElement	Ninja_forms_field_20_322925INPUT;
	public void fillINPUTNinja_forms_field_20_322925(String varInputValue) {
		waitForExpectedElement(driver, Ninja_forms_field_20_322925INPUT);
		Ninja_forms_field_20_322925INPUT.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//INPUT[@id='ninja_forms_field_23']")	
	private WebElement	Ninja_forms_field_23_322924INPUT;
	public void fillINPUTNinja_forms_field_23_322924(String varInputValue) {
		waitForExpectedElement(driver, Ninja_forms_field_23_322924INPUT);
		Ninja_forms_field_23_322924INPUT.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//SELECT[@id='ninja_forms_field_24']/OPTION[1]")	
	private WebElement	Startup4_322972select;
	public void clkselectStartup4_322972() {
		waitForExpectedElement(driver, Startup4_322972select);		
		String text = Startup4_322972select.getText();
		Startup4_322972select.click();
	}

	@FindBy(how = How.XPATH, using = "//SELECT[@id='ninja_forms_field_24']/OPTION[3]")	
	private WebElement	EnterpriseMarketingselectOption4_322972;
	public void clkselectEnterpriseMarketingOption4_322972() {
		waitForExpectedElement(driver, EnterpriseMarketingselectOption4_322972);		
		String text = EnterpriseMarketingselectOption4_322972.getText();
		EnterpriseMarketingselectOption4_322972.click();
	}

	@FindBy(how = How.XPATH, using = "//TEXTAREA[@id='ninja_forms_field_26']")	
	private WebElement	Message_323213TEXTAREA;
	public void fillTEXTAREAMessage_323213(String varInputValue) {
		waitForExpectedElement(driver, Message_323213TEXTAREA);
		Message_323213TEXTAREA.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//INPUT[@id='ninja_forms_field_28']")	
	private WebElement	_ninja_forms_field_28_322942INPUT;
	public void clkINPUT_ninja_forms_field_28_322942() {
		waitForExpectedElement(driver, _ninja_forms_field_28_322942INPUT);		
		String text = _ninja_forms_field_28_322942INPUT.getText();
		_ninja_forms_field_28_322942INPUT.click();
	}

}