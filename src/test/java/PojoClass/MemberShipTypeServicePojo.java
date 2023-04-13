package PojoClass;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class MemberShipTypeServicePojo {
    /*
        "id": 27,
        "name": "Doctors Wholesaler",
        "is_enabled": true,
        "is_individual_plan": true,
        "subscription_type_id": 27,
        "app_id": 2,
        "created_at": "2023-04-06T21:01:24.480026Z",
        "created_by": 32,
        "updated_at": "2023-04-06T21:01:24.480027Z",
        "updated_by": 32
     */
private String id;
private Object name;
private Object app_id;
private Object is_enabled;
private Object is_individual_plan;
private Object subscription_type_id;
private Object created_at;
private Object created_by;
private Object updated_at;
private Object updated_by;
private Object description;



}
