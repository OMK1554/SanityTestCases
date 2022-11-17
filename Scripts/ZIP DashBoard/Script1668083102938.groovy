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
Mobile.tap( findTestObject('Object Repository/Zip DashBoard/Zip ICON (1)')   ,0)
if(!Mobile.verifyElementExist( findTestObject('Object Repository/Zip DashBoard/Spend Now Pay Later in 1 click') , 0, FailureHandling.CONTINUE_ON_FAILURE))
 println("SNPL Text Not Found")
 
 
 if(!Mobile.verifyElementExist( findTestObject('Object Repository/Zip DashBoard/Available Balance')  , 0, FailureHandling.CONTINUE_ON_FAILURE))
 println("Available Balance Not Found")
else println Mobile.getText( findTestObject('Object Repository/Zip DashBoard/Available Balance') , 0)

println "Hello"
//closing the app
AppiumDriver<?> driver = MobileDriverFactory.getDriver();
driver.terminateApp('com.mobikwik_new')