import Facade.SocialMediaFacade;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Facader");

        SocialMediaFacade facade = new SocialMediaFacade();

        // Fetch all notifications
        facade.fetchAllNotifications();

        // Mark all as read
        facade.markAllAsRead();

        System.out.println("\n");

        // Mark all as unread
        facade.markAllAsUnread();

        System.out.println("\n");


        // Delete all notifications
        facade.deleteAll();

        System.out.println("\n");

    }
}