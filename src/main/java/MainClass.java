import com.upgrad.hireWheel.services.initService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("HireWheelBeans.xml");
        initService initService = (initService)context.getBean("intiServiceImpl");
        initService.startapp();

        //Movie CRUD

        //usersDAO usersDAO= (usersDAO)context.getBean("usersDAO");
        //System.out.println("*******creating new user*********");
        //Users users1 = new Users("Admin" , "Admin" , "admin@123" , "upgrad@gmail.com" , 999999999 , 1 , 10000);

        //insert
        //System.out.println("===========Insert=============");
        //users1 = usersDAO.saveUsers(users1);
        //System.out.println(users1);


    }


}