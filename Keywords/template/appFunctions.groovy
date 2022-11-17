package template

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import groovy.json.JsonSlurper
import groovy.json.JsonOutput

import internal.GlobalVariable

public class appFunctions {

	@Keyword
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

	@Keyword
	def checkScanCard() {
		boolean isPresent=false;
		isPresent= Mobile.verifyElementExist( findTestObject('Object Repository/Prepaid Recharge/11.Check Scan a new card') , 0, FailureHandling.STOP_ON_FAILURE)
		if(isPresent)
			Mobile.pressBack();
	}


	@Keyword
	def gotoHome() {
		boolean onHome=false;
		while(!onHome) {
			if(Mobile.verifyElementExist( findTestObject('Object Repository/HomePage/See all services') , 3, FailureHandling.OPTIONAL))
				onHome=true;
			else Mobile.pressBack();
		}
	}

	@Keyword
	def checkZipBenefits() {
		boolean isPresent=false;
		isPresent=Mobile.verifyElementExist( findTestObject('Object Repository/PayRentToUPI/3.Check Benefits of paying rent through Credit card')  , 0, FailureHandling.CONTINUE_ON_FAILURE)
		if(isPresent) {
			println("Check Zip Benefits Ad is shown. Closing....")
			Mobile.tap( findTestObject('Object Repository/PayRentToUPI/3.Use UPI')  ,0)
			println("Zip Ad closed . UPI is selected!!")
		}
	}
}