package PojoClass;

public class RequestPojo {


    private int organization_id;

    public RequestPojo() {
    }

    public RequestPojo(int organization_id) {
        this.organization_id = organization_id;
    }

    public int getOrganization_id() {
        return organization_id;
    }

    public void setOrganization_id(int organization_id) {
        this.organization_id = organization_id;
    }

    @Override
    public String toString() {
        return "RequestPojo{" +
                "organization_id=" + organization_id +
                '}';
    }
}
