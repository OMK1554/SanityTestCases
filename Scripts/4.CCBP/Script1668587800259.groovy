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
AppiumDriver<?> driver = MobileDriverFactory.getDriver();
driver.terminateApp('com.mobikwik_new')
Mobile.startExistingApplication('com.mobikwik_new')


Mobile.tap( findTestObject('Object Repository/PayRent/1. All Services') ,0)
Mobile.scrollToText( "Credit Card Bill Payments" )
Mobile.tap(  findTestObject('Object Repository/CCBP/2. Credit Card Bill Payments') ,0)
Mobile.tap(  findTestObject('Object Repository/CCBP/3. Pay Now') ,0)
//Entering Amount

Mobile.tap(  findTestObject('Object Repository/CCBP/Number 2'),0)
Mobile.tap(  findTestObject('Object Repository/CCBP/Number 0'),0)
Mobile.tap(  findTestObject('Object Repository/CCBP/Number 0'),0)


Mobile.tap(  findTestObject('Object Repository/CCBP/5. Continue') ,0)
Mobile.tap(  findTestObject('CCBP/6. Pay Amt') ,0)
Mobile.tap(  findTestObject('Object Repository/CCBP/7. Pay Amt through UPI') ,0)
Mobile.setText( findTestObject('Object Repository/CCBP/8.Enter Security PIN')  , "12345", 0)


//closing the app
driver.terminateApp('com.mobikwik_new')


