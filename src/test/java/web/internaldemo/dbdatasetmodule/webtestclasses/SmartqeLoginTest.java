package web.internaldemo.dbdatasetmodule.webtestclasses;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.configurations.Constants;
import com.configurations.ExtentConfigurations;
import web.internaldemo.dbdatasetmodule.webpageclasses.LoginPage;
import web.internaldemo.dbdatasetmodule.webpageclasses.DashboardMenu;
import web.internaldemo.dbdatasetmodule.webpageclasses.Dashboard_logout;
import com.utilities.BaseClass;
import com.utilities.ConfigFilesUtility;
import com.utilities.Utilities;
import org.json.JSONObject;

@SuppressWarnings("unused")
public class SmartqeLoginTest extends BaseClass {
	ExtentReports reports;
	ExtentTest test;
	ITestResult result;
	private Logger logger;
	private ConfigFilesUtility configFileObj;
	public boolean isElementDispalyed = false;	public static final int datasetsLength = 13;

	public SmartqeLoginTest() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		logger = Logger.getLogger(SmartqeLoginTest.class);
		configFileObj = new ConfigFilesUtility();
		configFileObj.loadPropertyFile("smartqelogintest.properties");
		reports = ExtentConfigurations.getExtentInstance(reportsPath, projectPath, LoginPage.projectName);
		test = reports.startTest("SmartqeLoginTest");
	}
	
	public void setUP() throws Exception {
		String primaryInfo = LoginPage.primaryInfo;
		Constants.PRIMARY_INFO = primaryInfo;
		driver = launchBrowser(new JSONObject(primaryInfo).optString("browser_type"), configFileObj);
	}

	public void LoginPageTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 1;
		LoginPage objLoginPage = PageFactory.initElements(driver, LoginPage.class);
		testLogHeader(test, "Verify LoginPage page");
		objLoginPage.fillINPUTUserName_321229(configFileObj.getProperty("UserName"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered UserName : " + configFileObj.getProperty("UserName"+ i + datasetScreencount));
		objLoginPage.fillINPUTPassword_321231(configFileObj.getProperty("Password"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered Password : " + configFileObj.getProperty("Password"+ i + datasetScreencount));
String text3 = objLoginPage.clkBUTTONLogin_321233();
		if(text3.equalsIgnoreCase(configFileObj.getProperty("Login"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on Button : " + configFileObj.getProperty("Login"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Button Text : " + configFileObj.getProperty("Login"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Text is displayed as : " + configFileObj.getProperty("Login"+ i + datasetScreencount));
		}

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	

	public void DashboardMenuTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 2;
		DashboardMenu objDashboardMenu = PageFactory.initElements(driver, DashboardMenu.class);
		testLogHeader(test, "Verify DashboardMenu page");
String text1 = objDashboardMenu.clkIMGImage_321257();
		if(text1.equalsIgnoreCase(configFileObj.getProperty("Image"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on : " + configFileObj.getProperty("Image"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Link Text : " + configFileObj.getProperty("Image"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Link Text is not displayed  : " + configFileObj.getProperty("Image"+ i + datasetScreencount));
		}

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	

	public void Dashboard_logoutTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 3;
		Dashboard_logout objDashboard_logout = PageFactory.initElements(driver, Dashboard_logout.class);
		testLogHeader(test, "Verify Dashboard_logout page");
String text1 = objDashboard_logout.clkSPANLogout_321318();
		if(text1.equalsIgnoreCase(configFileObj.getProperty("Logout"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on : " + configFileObj.getProperty("Logout"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Link Text : " + configFileObj.getProperty("Logout"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Link Text is not displayed  : " + configFileObj.getProperty("Logout"+ i + datasetScreencount));
		}

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	
	@Test
	public void screensTest() throws Exception {
		for(int datasets = 1; datasets <= Dashboard_logout.datasetsLength; datasets++) {
			isElementDispalyed = true;			
			setUP();
			if(isElementDispalyed) { LoginPageTest(datasets);}
			if(isElementDispalyed) { DashboardMenuTest(datasets);}
			if(isElementDispalyed) { Dashboard_logoutTest(datasets);}
			tearDown();
		}	}

	
	public void tearDown() throws Exception {
		reports.endTest(test);
		reports.flush();
		driver.quit();
	}
}