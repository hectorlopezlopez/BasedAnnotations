    import com.revature.HelloWorld;
    import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

    public class Driver {
        public static void main(String[] args) {
                ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

                HelloWorld hw = (HelloWorld) context.getBean("helloWorld");
                System.out.println(hw.hashCode());

                HelloWorld hw2 = (HelloWorld) context.getBean("helloWorld");
                System.out.println(hw2.hashCode());
            }
    }
