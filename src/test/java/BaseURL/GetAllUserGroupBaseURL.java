package BaseURL;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class GetAllUserGroupBaseURL {
    // https://qa-gm3.quaspareparts.com/auth/api/

    protected RequestSpecification specification;

    @Before
    public void setUpBaseURL(){

        specification = new RequestSpecBuilder().
                setBaseUri("https://qa-gm3.quaspareparts.com/auth/api").
                build();
    }
}
