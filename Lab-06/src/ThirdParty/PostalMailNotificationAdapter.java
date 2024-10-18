package ThirdParty;

import MyApplication.INofity;
import MyApplication.PostalMailNotification;

public class PostalMailNotificationAdapter implements INofity {
    private PostalMailNotification postalMailNotification;
    private String address;
    private int postalCode;

    public PostalMailNotificationAdapter(PostalMailNotification postalMailNotification, String address, int postalCode){
        this.postalMailNotification = postalMailNotification;
        this.address = address;
        this.postalCode = postalCode;
    }

    @Override
    public void sendNotification(String message, String receiver) {
        postalMailNotification.sendNotification(message, receiver, address, postalCode);
    }

}
