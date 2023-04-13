package PojoClass;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class UserStatusServis {
    private Integer id;
    private Object name;
    private Object description;

    public UserStatusServis() {
    }

    public UserStatusServis(Integer id, Object name, Object description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public UserStatusServis(Object name, Object description) {
        this.name = name;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "UserStatusServis{" +
                "id=" + id +
                ", name=" + name +
                ", description=" + description +
                '}';
    }
}
