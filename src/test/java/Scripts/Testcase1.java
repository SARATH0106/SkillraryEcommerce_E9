package Scripts;

import org.testng.annotations.Test;

import POM.SkillraryHomepage;
import POM.TestingPage;
import POM.demoSkillraryPage;
import genericLibrary.BaseClass;

public class Testcase1 extends BaseClass {
	@Test
	public void tc1() throws Throwable {
		SkillraryHomepage s = new SkillraryHomepage(driver);
		s.gearsButton();
		s.skillrarydemoappWebElement();
		utiles.childBrowser(driver);
		demoSkillraryPage dS = new demoSkillraryPage(driver);
		utiles.dropDown(dS.getSearchDd(),pdata.getPropertydata("coursedd"));
		TestingPage tP = new TestingPage(driver);
		utiles.Scrolling(driver,tP.getFb());
		tP.FbWebElement();
	}
	

}
