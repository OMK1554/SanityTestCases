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

Mobile.tap( findTestObject('Object Repository/IMPS Wallet 2 Acc No OR/1.Wallet to Bank Transfer Btn') , 0)
Mobile.tap( findTestObject('Object Repository/IMPS Wallet 2 Acc No OR/2.Transfer to a new account') ,0)
Mobile.tap(  findTestObject('Object Repository/IMPS Wallet 2 UPI ID/3.UPI ID'),0)
Mobile.setText(  findTestObject('Object Repository/IMPS Wallet 2 UPI ID/4. Edit UPI ID'), "9910757211@ikwik", 0)
Mobile.tap( findTestObject('Object Repository/IMPS Wallet 2 UPI ID/Continue') ,0)
Mobile.setText( findTestObject('Object Repository/IMPS Wallet 2 UPI ID/5. Edit Amount') , "200", 0)
Mobile.delay(3)
Mobile.tap( findTestObject('Object Repository/IMPS Wallet 2 UPI ID/6.Done Amount')  ,0 )
Mobile.tap(  findTestObject('Object Repository/IMPS Wallet 2 UPI ID/7.Pay') ,0 )
Mobile.setText( findTestObject('Object Repository/IMPS Wallet 2 UPI ID/8. Enter PIN') , "12345", 0)

driver.terminateApp('com.mobikwik_new')

