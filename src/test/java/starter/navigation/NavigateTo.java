package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable theApplitoolsGoHomePage() {
        return Task.where("{0} opens the Applitools home page",
                Open.browserOn().the(ApplitoolsGoHomePage.class)
        );
    }
}