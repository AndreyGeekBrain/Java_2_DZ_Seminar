import controller.ControllerToyShop;
import user_ui.UserUI;

public class Main {
    public static void main (String[] args) {
        new UserUI ().start (new ControllerToyShop ()
        );
    }
}
