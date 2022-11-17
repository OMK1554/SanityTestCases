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

Mobile.startExistingApplication('com.mobikwik_new')
Mobile.delay(5)
boolean snplP = false

boolean locationP = false

boolean setupUPIP = false

boolean videoAdP = false

boolean chooseANumberPre = false


snplP = Mobile.verifyElementExist(findTestObject('Object Repository/SerializeLoginOR/1.SNPL Activity'), 5,FailureHandling.CONTINUE_ON_FAILURE)?true:false;

if (snplP) {
	Mobile.tap(findTestObject('Object Repository/SerializeLoginOR/2.SkipSNPL'), 5,FailureHandling.CONTINUE_ON_FAILURE)
}

locationP = Mobile.verifyElementExist(findTestObject('Object Repository/SerializeLoginOR/3.Location Access Pop-Up'), 5,FailureHandling.CONTINUE_ON_FAILURE)

if (locationP) {
	Mobile.tap(findTestObject('Object Repository/SerializeLoginOR/4.ALLOW Location'), 5,FailureHandling.CONTINUE_ON_FAILURE)
}

setupUPIP = Mobile.verifyElementExist(findTestObject('Object Repository/SerializeLoginOR/5.SetupUPI Pop- Up'), 5,FailureHandling.CONTINUE_ON_FAILURE)

if (setupUPIP) {
	Mobile.tap(findTestObject('Object Repository/SerializeLoginOR/6.CLOSE setup UPI'), 5,FailureHandling.CONTINUE_ON_FAILURE)
}

videoAdP = Mobile.verifyElementExist(findTestObject('Object Repository/SerializeLoginOR/7.Video Ad Pop Up'), 5,FailureHandling.CONTINUE_ON_FAILURE)

if (videoAdP) {
	Mobile.tap(findTestObject('Object Repository/SerializeLoginOR/8.Close Video Pop Up'), 5,FailureHandling.CONTINUE_ON_FAILURE)
}

Mobile.tap(findTestObject('Serialize OR/9. LoginSignup Btn'), 5,FailureHandling.CONTINUE_ON_FAILURE)

chooseANumberPre = Mobile.verifyElementExist(findTestObject('Object Repository/SerializeLoginOR/10. Choose a Number System Pop -Up'), 
    5,FailureHandling.CONTINUE_ON_FAILURE)

if (chooseANumberPre) {
    Mobile.tap(findTestObject('Object Repository/SerializeLoginOR/11.NONE OF THE ABOVE Btn'), 5,FailureHandling.CONTINUE_ON_FAILURE)
}

// Mobile.setText(findTestObject('Object Repository/SerializeLoginOR/12.Edit Mobile No'), "", 0)
Mobile.tap(findTestObject('Object Repository/SerializeLoginOR/13.Send OTP Btn'), 5,FailureHandling.CONTINUE_ON_FAILURE)

boolean ZipAd = false

ZipAd = Mobile.verifyElementExist(findTestObject('Object Repository/SerializeLoginOR/14.Get up to 30,000 with ZIP Activity'), 
    5,FailureHandling.CONTINUE_ON_FAILURE)

if (ZipAd) {
    Mobile.tap(findTestObject('Object Repository/SerializeLoginOR/15.Skip KYC Zip'), 5,FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('Object Repository/SerializeLoginOR/16. Dont want benefits Btn'), 5,FailureHandling.CONTINUE_ON_FAILURE)
}

boolean checkKYCPopUp = false

checkKYCPopUp = Mobile.verifyElementExist(findTestObject('Object Repository/SerializeLoginOR/17. Check KYC Text'), 5,FailureHandling.CONTINUE_ON_FAILURE)

if (checkKYCPopUp) {
    Mobile.pressBack()
}

Mobile.tap(findTestObject('Object Repository/SerializeLoginOR/19.Profile Menu Btn'), 5,FailureHandling.CONTINUE_ON_FAILURE)


boolean ZipAdK=false
 ZipAdK=Mobile.verifyElementExist( findTestObject('Object Repository/SerializeLoginOR/20. Zip Ad Check android.widget.TextView - Buy now  pay later at 0 interest Shop at your favorite brands') , 5,FailureHandling.CONTINUE_ON_FAILURE)
if(ZipAdK)
	Mobile.tap( findTestObject('Object Repository/SerializeLoginOR/21.Close Zip Ad') , 5,FailureHandling.CONTINUE_ON_FAILURE)

string(Name, Email, Mobile_Num)

Name = Mobile.getText(findTestObject('Object Repository/SerializeLoginOR/20. Name'), 5,FailureHandling.CONTINUE_ON_FAILURE)

Email = Mobile.getText(findTestObject('Object Repository/SerializeLoginOR/21. Email'), 5,FailureHandling.CONTINUE_ON_FAILURE)

Mobile_Num = Mobile.getText(findTestObject('Object Repository/SerializeLoginOR/22.Mobile No'), 5,FailureHandling.CONTINUE_ON_FAILURE)

println Name

println Email

println Mobile_Num

Mobile.closeApplication()

