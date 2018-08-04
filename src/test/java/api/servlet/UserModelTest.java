package api.servlet;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserModelTest {

    @Test
    public void getRealUser() {
        UserModel userModel = new UserModel();
        User user = userModel.getUser();
        assertEquals("1111", user.getId());
        assertEquals("Up1", user.getName());
    }

}