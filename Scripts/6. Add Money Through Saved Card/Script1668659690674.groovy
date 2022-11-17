import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import io.restassured.RestAssured as RestAssured
import io.restassured.http.Method as Method
import io.restassured.response.Response as Response
import io.restassured.specification.RequestSpecification as RequestSpecification
import groovy.json.JsonSlurper
import groovy.json.JsonOutput
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.AppiumDriver


def makePaymentThroughCard() {
	Mobile.tap(  findTestObject('Object Repository/AddMoneyThroughSavedCard/Pay Amt')    ,0)
	Mobile.setText(   findTestObject('Object Repository/AddMoneyThroughSavedCard/EditText CVV')   ,"647",0)
//	Mobile.tap(  findTestObject('Object Repository/AddMoneyThroughSavedCard/Pay Amt OTP')   ,0)
}

def checkSavedCardAndMakePayment() {
	boolean isCardPresent=false;
	isCardPresent=Mobile.verifyElementVisible( findTestObject('Object Repository/AddMoneyThroughSavedCard/Verify PayTM Card')    , 0, FailureHandling.STOP_ON_FAILURE)
	if(isCardPresent)
	{
		Mobile.tap(findTestObject('Object Repository/AddMoneyThroughSavedCard/Verify PayTM Card')     ,0)
		makePaymentThroughCard();
	}
	else 
		println("Card Not Saved!!")
}



Mobile.startExistingApplication('com.mobikwik_new')

AppiumDriver<?> driver = MobileDriverFactory.getDriver();
driver.terminateApp('com.mobikwik_new')
Mobile.startExistingApplication('com.mobikwik_new')


Mobile.tap(findTestObject('AddMoneyThroughCard/android.widget.TextView0 - '), 0)

Mobile.tap(findTestObject('AddMoneyThroughCard/android.widget.Button0 - Add Money'), 0)

Mobile.setText(findTestObject('AddMoneyThroughCard/android.widget.EditText0 - Enter Amount'), '5', 0)

Mobile.tap(findTestObject('AddMoneyThroughCard/android.widget.Button0 - Continue'), 0)

checkSavedCardAndMakePayment();


driver.terminateApp('com.mobikwik_new')

