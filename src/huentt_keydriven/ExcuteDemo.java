package huentt_keydriven;

public class ExcuteDemo {

    public static void main(String[] args) {
        ActionKeywords ak = new ActionKeywords();
        ak.openBrowser();
        ak.navigate();
        ak.enterUser();
        ak.enterPass();
        ak.clickLogin();
        System.out.println("Login success");
    }
}
