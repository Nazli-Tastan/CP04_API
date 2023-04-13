package PojoClass;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class UserGroupPOJO {

    /*
    name :"neww Departmentt",

    group-type-id : 1,
    organization-id: 24

     */

    private  int group_type_id;
    private String name;
    private int organization_id;

    public UserGroupPOJO() {
    }

    public UserGroupPOJO(int group_type_id, String name, int organization_id) {
        this.group_type_id = group_type_id;
        this.name = name;
        this.organization_id = organization_id;
    }

    public int getGroup_type_id() {
        return group_type_id;
    }

    public void setGroup_type_id(int group_type_id) {
        this.group_type_id = group_type_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrganization_id() {
        return organization_id;
    }

    public void setOrganization_id(int organization_id) {
        this.organization_id = organization_id;
    }

    @Override
    public String toString() {
        return "UserGroupPOJO{" +

                ", group_type_id=" + group_type_id +
                ", name='" + name + '\'' +
                ", organization_id=" + organization_id +
                '}';
    }
}
