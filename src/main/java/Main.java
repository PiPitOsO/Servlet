import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ServletException, IOException {
        Class<?> aClass = Class.forName("servlet.MainServlet");
        Servlet servlet = (Servlet) aClass.getConstructor().newInstance();
        servlet.init(null);
        servlet.service(null, null);
    }
}