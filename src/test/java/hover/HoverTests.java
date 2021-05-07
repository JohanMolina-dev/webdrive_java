package hover;

import base.BaseTest;
import org.testng.annotations.Test;
import page.HoverPage;

public class HoverTests extends BaseTest {
    @Test
    public void testHoverSuccessful (){
        HoverPage hoverPage = homePage.clickHoverPage();
        hoverPage.locatorFirstFigure();
        hoverPage.clickHoverProfileLink();
    }
}
