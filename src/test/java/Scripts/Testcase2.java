package Scripts;

import org.testng.annotations.Test;

import POM.DownloadInvoicePage;
import POM.SkillraryHomepage;
import POM.demoSkillraryPage;
import genericLibrary.BaseClass;

public class Testcase2 extends BaseClass {
	@Test
	public void tc2() {
		SkillraryHomepage s = new SkillraryHomepage(driver);
		s.gearsButton();
		s.skillrarydemoappWebElement();
		utiles.childBrowser(driver);
		demoSkillraryPage dS = new demoSkillraryPage(driver);
		dS.feedbackButton();
		DownloadInvoicePage dI= new DownloadInvoicePage(driver);
		dI.downloadInvoiceWebElelment();
	
	}

}
