package web.internaldemo.dbdatasetmodule.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class DashboardMenu extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://smartqe.io/\",\"report_upload_url\":\"https://smartqe.io:443/UploadReportFile\",\"project_name\":\"InternalDemo\",\"project_description\":\"desc\",\"project_id\":299,\"module_name\":\"DB Dataset Module\",\"module_description\":\"Test SmartQE DB Dataset validation\",\"sub_module_id\":0,\"module_id\":454,\"testcase_name\":\"smartqeLoginTest\",\"testcase_id\":483,\"testset_id\":0,\"executed_timestamp\":1862711865,\"browser_type\":\"chrome\"}";

	public static String projectName = "internaldemo";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 13;

	public DashboardMenu(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//BODY[@id='loading']/NAV[1]/DIV[2]/NAV[1]/DIV[1]/DIV[2]/A[1]/SPAN[1]/IMG[1]")	
	private WebElement	Image_321257IMG;
	public String clkIMGImage_321257() {
		waitForExpectedElement(driver, Image_321257IMG);		
		String text = Image_321257IMG.getText();
		Image_321257IMG.click();
		return text;
	}

}