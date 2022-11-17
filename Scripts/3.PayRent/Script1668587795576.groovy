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

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.AppiumDriver

Mobile.startExistingApplication('com.mobikwik_new')
CustomKeywords.'template.appFunctions.gotoHome'()
Mobile.tap( findTestObject('Object Repository/PayRent/1. All Services') ,0)
Mobile.scrollToText( "Pay Rent" )
Mobile.tap(  findTestObject('Object Repository/PayRent/2.Pay Rent') ,0)

CustomKeywords.'template.appFunctions.checkZipBenefits'()

Mobile.setText(    findTestObject('Object Repository/PayRentToUPI/4. Enter Name, Number, UPI ID or Scan QR')     , "8076595767@ikwik", 0);
Mobile.tap(  findTestObject('Object Repository/PayRentToUPI/5. 8076595767ikwik')  , 0)

//Entering Amount 
Mobile.tap(  findTestObject('Object Repository/PayRent/Number 2'),0)
Mobile.tap(  findTestObject('Object Repository/PayRent/Number 0') ,0)
Mobile.tap(  findTestObject('Object Repository/PayRent/Number 0') ,0)

Mobile.tap(  findTestObject('Object Repository/PayRent/6. Continue') ,0)

//Mobile.tap(  findTestObject('Object Repository/PayRent/7. Confirm Pay') ,0)

//closing the app
AppiumDriver<?> driver = MobileDriverFactory.getDriver();
driver.terminateApp('com.mobikwik_new')




