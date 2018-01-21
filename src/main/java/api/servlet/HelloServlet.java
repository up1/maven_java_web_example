package api.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response)
            throws ServletException, IOException {

        User user = new User();
        user.setId("1111");
        user.setName("Up1");

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(response.getOutputStream(), user);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse response)
            throws ServletException, IOException {

        ObjectMapper mapper = new ObjectMapper();
        User sendUser = mapper.readValue(req.getInputStream(), User.class);

        User user = new User();
        user.setId("0000");
        user.setName("Response from POST form " + sendUser.getName());

        mapper.writeValue(response.getOutputStream(), user);

    }

}

class User {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
