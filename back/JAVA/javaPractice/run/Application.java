package pm.javaPractice.run;

import pm.javaPractice.controller.BookManager;
import pm.javaPractice.model.BookDTO;
import pm.javaPractice.view.BookMenu;

public class Application {
    public static void main(String[] args) {
        new BookMenu().menu();
    }
}
