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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import groovy.json.JsonSlurper
import groovy.json.JsonOutput
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.AppiumDriver

def fetchOTP(){
	Mobile.delay(10)
	def response = WS.sendRequest(findTestObject('OTPRequest'))
	def responseText = response.getResponseText()
	println JsonOutput.prettyPrint(responseText)
	
	
	JsonSlurper slurper = new JsonSlurper()
	Map parsedJson = slurper.parseText(responseText)
	
	def OTP= parsedJson.otp;
	println OTP
	return OTP
	
}

def checkScanCard() {
	boolean isPresent=false;
	isPresent= Mobile.verifyElementExist( findTestObject('Object Repository/Prepaid Recharge/11.Check Scan a new card') , 0, FailureHandling.OPTIONAL) 
	if(isPresent)	
	Mobile.pressBack();
}


def makePayment() {
//	Mobile.tap(  findTestObject('Object Repository/Prepaid Recharge/9. Pay Amt')    ,0)
	Mobile.tap( findTestObject('Object Repository/Prepaid Recharge/9.More payment options') ,0)
	Mobile.tap( findTestObject('Object Repository/Prepaid Recharge/10.Enter your 16 digit card number')  ,0)
	checkScanCard();
	Mobile.setText( findTestObject('Object Repository/Prepaid Recharge/11. EditText - Card Number'),"4363931800224460"   ,0)
	Mobile.setText(  findTestObject('Object Repository/Prepaid Recharge/12.EditText - Card Expiry')  , "12/22", 0)
	Mobile.setText( findTestObject('Object Repository/Prepaid Recharge/13.EditText - CVV') ,"239",0  )
	//Mobile.tap( findTestObject('Object Repository/Prepaid Recharge/14.Pay 10') , 0)
	//Mobile.delay(20)
	//
	//def OTP=fetchOTP()
	//
	//Mobile.setText(findTestObject('AddMoneyThroughCard/android.widget.EditText0'), OTP, 0)
	//
	//Mobile.tap( findTestObject('AddMoneyThroughCard/Confirm  Pay') , 0)
}

	
	
//script starts from here
	
Mobile.startExistingApplication('com.mobikwik_new')
CustomKeywords.'template.appFunctions.gotoHome'()
Mobile.tap( findTestObject('Object Repository/Prepaid Recharge/1.Recharge  Pay Bills')    , 0)
Mobile.tap( findTestObject('Object Repository/Prepaid Recharge/2.Mobile')   ,0)
Mobile.tap( findTestObject('Object Repository/Prepaid Recharge/3.Enter name or Mobile no')  , 0)
Mobile.setText(  findTestObject('Object Repository/Prepaid Recharge/4. Search your contact')   , "9555746475", 0)
Mobile.tap( findTestObject('Object Repository/Prepaid Recharge/5.Select Number')  ,0)
Mobile.tap(  findTestObject('Object Repository/Prepaid Recharge/6. Search ICON')  ,0)
Mobile.setText( findTestObject('Object Repository/Prepaid Recharge/7. Search Plan or Amount')  , "10", 0)
Mobile.tap( findTestObject('Object Repository/Prepaid Recharge/8. First View Group (of Amt)')  ,0)


//Payment Part
//Mobile.tap(  findTestObject('Object Repository/Prepaid Recharge/9. Pay Amt')    ,0)
//makePayment()
//println('Payment Done From Your End')




