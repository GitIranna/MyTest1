import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\ipattar\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Common Test Cases\\Login\\20170818_174619\\execution.properties')

TestCaseMain.beforeStart()
try {
    
	    TestCaseMain.runTestCase('Test Cases/Common Test Cases/Login', new TestCaseBinding('Test Cases/Common Test Cases/Login', [:]), FailureHandling.STOP_ON_FAILURE )
    
} catch (Exception e) {
    TestCaseMain.logError(e, 'Test Cases/Common Test Cases/Login')
}