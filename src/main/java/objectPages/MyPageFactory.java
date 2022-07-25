package objectPages;

import objectPages.administrator.*;
import objectPages.mainPage.MainPage;
import util.ScreenShotPage;

public class MyPageFactory {

    public MainPage getMainPage(){
        return new MainPage();
    }

    public AdminPage getAdminPage(){
        return new AdminPage();
    }

    public UsersPage getUsersPage(){
        return new UsersPage();
    }

    public UserEditPage getUserEditPage(){
        return new UserEditPage();
    }

    public MessagesPage getMessagesPage(){
        return new MessagesPage();
    }

    public ScreenShotPage getScreenShotPage(){
        return new ScreenShotPage();
    }

    public NetWorks getNetWorksPage(){
        return new NetWorks();
    }

    public JournalPage getJournalPage(){
        return new JournalPage();
    }
}
