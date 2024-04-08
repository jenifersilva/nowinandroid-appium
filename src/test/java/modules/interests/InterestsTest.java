package modules.interests;

import modules.BaseTest;
import org.junit.jupiter.api.*;
import screens.InterestsScreen;
import screens.NavigationBar;

public class InterestsTest extends BaseTest {
    @DisplayName("Add and Remove Interests successfully")
    @Test
    public void testAddAndRemoveInterestsSuccessfully(){
        Assertions.assertTrue(new NavigationBar(app)
                .goToInterestsTab()
                .followInterest()
                .getUnfollowInterestsButton()
                .isDisplayed());
        Assertions.assertTrue(new InterestsScreen(app)
                .unfollowInterest()
                .getFollowInterestButton()
                .isDisplayed());
    }
}
