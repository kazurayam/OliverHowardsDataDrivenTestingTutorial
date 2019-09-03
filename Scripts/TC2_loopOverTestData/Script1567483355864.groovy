import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling

TestData data = findTestData("Demo_Account")

for (def index : (1..data.getRowNumbers())) {
	WebUI.openBrowser('')
	WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/profile.php#login')
	WebUI.setText(findTestObject('Page_Login/txt_UserName'), data.getValue("demo_usn", index))
	WebUI.setText(findTestObject('Page_Login/txt_Password'), data.getValue("demo_pwd", index))
	WebUI.click(findTestObject('Page_Login/btn_Login'))
	WebUI.verifyElementPresent(findTestObject('Page_appointment/btn_MakeAppointment'), 
		3, FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.closeBrowser()
}
