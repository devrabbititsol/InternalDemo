package web.internaldemo.webmodule.webtestclasses;
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
import web.internaldemo.webmodule.webpageclasses.HomeScreen;
import web.internaldemo.webmodule.webpageclasses.TalkToOurExpertsScreen;
import web.internaldemo.webmodule.webpageclasses.ContactUsScreen;
import com.utilities.BaseClass;
import com.utilities.ConfigFilesUtility;
import com.utilities.Utilities;
import org.json.JSONObject;

@SuppressWarnings("unused")
public class TC_Devrabbit_Contact extends BaseClass {
	ExtentReports reports;
	ExtentTest test;
	ITestResult result;
	private Logger logger;
	private ConfigFilesUtility configFileObj;
	public boolean isElementDispalyed = false;	public static final int datasetsLength = 1;

	public TC_Devrabbit_Contact() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		logger = Logger.getLogger(TC_Devrabbit_Contact.class);
		configFileObj = new ConfigFilesUtility();
		configFileObj.loadPropertyFile("tc_devrabbit_contact.properties");
		reports = ExtentConfigurations.getExtentInstance(reportsPath, projectPath, HomeScreen.projectName);
		test = reports.startTest("TC_Devrabbit_Contact");
	}
	
	public void setUP() throws Exception {
		String primaryInfo = HomeScreen.primaryInfo;
		Constants.PRIMARY_INFO = primaryInfo;
		driver = launchBrowser(new JSONObject(primaryInfo).optString("browser_type"), configFileObj);
	}

	public void HomeScreenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 1;
		HomeScreen objHomeScreen = PageFactory.initElements(driver, HomeScreen.class);
		testLogHeader(test, "Verify HomeScreen page");
String text1 = objHomeScreen.clkATechnology_321962();
		if(text1.equalsIgnoreCase(configFileObj.getProperty("Technology"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Validated Link Text : " + configFileObj.getProperty("Technology"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Link Text is not displayed  : " + configFileObj.getProperty("Technology"+ i + datasetScreencount));
		}
String text2 = objHomeScreen.clkAMobileApplicationTesting_322003();
		if(text2.equalsIgnoreCase(configFileObj.getProperty("MobileApplicationTesting"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on : " + configFileObj.getProperty("MobileApplicationTesting"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Link Text : " + configFileObj.getProperty("MobileApplicationTesting"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Link Text is not displayed  : " + configFileObj.getProperty("MobileApplicationTesting"+ i + datasetScreencount));
		}

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	

	public void TalkToOurExpertsScreenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 2;
		TalkToOurExpertsScreen objTalkToOurExpertsScreen = PageFactory.initElements(driver, TalkToOurExpertsScreen.class);
		testLogHeader(test, "Verify TalkToOurExpertsScreen page");
String text1 = objTalkToOurExpertsScreen.clkATalkToOurExperts_322506();
		if(text1.equalsIgnoreCase(configFileObj.getProperty("TalkToOurExperts"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on : " + configFileObj.getProperty("TalkToOurExperts"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Link Text : " + configFileObj.getProperty("TalkToOurExperts"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Link Text is not displayed  : " + configFileObj.getProperty("TalkToOurExperts"+ i + datasetScreencount));
		}

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	

	public void ContactUsScreenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 3;
		ContactUsScreen objContactUsScreen = PageFactory.initElements(driver, ContactUsScreen.class);
		testLogHeader(test, "Verify ContactUsScreen page");
		objContactUsScreen.fillINPUTNinja_forms_field_19_322926(configFileObj.getProperty("Ninja_forms_field_19"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered Ninja_forms_field_19 : " + configFileObj.getProperty("Ninja_forms_field_19"+ i + datasetScreencount));
		objContactUsScreen.fillINPUTNinja_forms_field_20_322925(configFileObj.getProperty("Ninja_forms_field_20"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered Ninja_forms_field_20 : " + configFileObj.getProperty("Ninja_forms_field_20"+ i + datasetScreencount));
		objContactUsScreen.fillINPUTNinja_forms_field_23_322924(configFileObj.getProperty("Ninja_forms_field_23"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered Ninja_forms_field_23 : " + configFileObj.getProperty("Ninja_forms_field_23"+ i + datasetScreencount));
		objContactUsScreen.clkselectStartup4_322972();
		printInfoLogAndReport(test, logger, "Clicked on Startupdropdown");
				objContactUsScreen.clkselectEnterpriseMarketingOption4_322972();
		printSuccessLogAndReport(test, logger,  "Selected option : Enterprise Marketing");
		printSuccessLogAndReport(test, logger,  "Text is displayed as : Enterprise Marketing");
		objContactUsScreen.fillTEXTAREAMessage_323213(configFileObj.getProperty("Message"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered Message : " + configFileObj.getProperty("Message"+ i + datasetScreencount));
		objContactUsScreen.clkINPUT_ninja_forms_field_28_322942();
		printInfoLogAndReport(test, logger, "Clicked on _ninja_forms_field_28Button");
		
	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	
	@Test
	public void screensTest() throws Exception {
		for(int datasets = 1; datasets <= ContactUsScreen.datasetsLength; datasets++) {
			isElementDispalyed = true;			
			setUP();
			if(isElementDispalyed) { HomeScreenTest(datasets);}
			if(isElementDispalyed) { TalkToOurExpertsScreenTest(datasets);}
			if(isElementDispalyed) { ContactUsScreenTest(datasets);}
			tearDown();
		}	}

	
	public void tearDown() throws Exception {
		reports.endTest(test);
		reports.flush();
		driver.quit();
	}
}