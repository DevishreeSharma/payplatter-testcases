import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('http://localhost:8085/BizPlatter/')

WebUI.maximizeWindow()

WebUI.delay(1)

WebUI.click(findTestObject('test/Page_PayPlatter  Home  payplatter.i/a_Login'))

String c = findTestData('login_users').getValue(14, 1)

println('VAlue  :: ' + c)

String d = findTestData('login_users').getValue(11, 1)

println('VAlue  :: ' + d)

WebUI.setText(findTestObject('test/Page_PayPlatter  Home  payplatter.i/input_loginBean.userName'), c)

System.out.println(Encryptor.decrypt('passwordmuskilba', '1234567898765432', d))

String actPassword = null

try {
    actPassword = Encryptor.decrypt('passwordmuskilba', '1234567898765432', d)
}
catch (Exception e) {
    e.printStackTrace()
} 

WebUI.setText(findTestObject('test/Page_PayPlatter  Home  payplatter.i/input_loginBean.password'), actPassword)

//WebUI.setText(findTestObject('test/Page_PayPlatter  Home  payplatter.i/input_loginBean.password'), 'SAdmin@2018')
WebUI.click(findTestObject('test/Page_PayPlatter  Home  payplatter.i/input'))

/*try {
	println("In Mail Send ::::::::::::::::::::::::::::::::::::::::::::::::::")
	CustomKeywords.'com.email.Email.sendMail'('kumar.ravi7852@gmail.com', 'test', 'www.gmail.com')
	} catch (Exception e) {
	// TODO Auto-generated catch block
	println ("Exception :: " +e.getMessage())
	e.printStackTrace();
	}*/
WebUI.mouseOver(findTestObject('create payment processor/manage'))

