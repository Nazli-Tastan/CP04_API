package PojoClass;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponsePojo {
    /*
    {
        "app_id": 2,
        "user_id": 227,
        "subscription_id": "9eb6e23e-6235-471c-af9f-ccf1df90f9b7",
        "is_individual_membership": true,
        "default_role_id": 6,
        "is_active": true,
        "is_default": false
    },
     */
    private Object app_id;
    private Object user_id;
    private Object subscription_id;

    public ResponsePojo() {
    }

    public Object getApp_id() {
        return app_id;
    }

    public void setApp_id(Object app_id) {
        this.app_id = app_id;
    }

    public Object getUser_id() {
        return user_id;
    }

    public void setUser_id(Object user_id) {
        this.user_id = user_id;
    }

    public Object getSubscription_id() {
        return subscription_id;
    }

    public void setSubscription_id(Object subscription_id) {
        this.subscription_id = subscription_id;
    }

    @Override
    public String toString() {
        return "ResponsePojo{" +
                "app_id=" + app_id +
                ", user_id=" + user_id +
                ", subscription_id=" + subscription_id +
                '}';
    }
}
