package top.huzhurong.fuck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @author chenshun00@gmail.com
 * @since 2018/12/2
 */
public class ConsumerDemo {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("test.xml");
        UserService bean = applicationContext.getBean(UserService.class);
//        long first = System.currentTimeMillis();
//        System.out.println(bean.name());
        System.out.println(bean.name());
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        System.out.println(allStackTraces.size());
//        System.out.println(bean.name());
//        long second = System.currentTimeMillis();
//        bean.noArg();
//        bean.noArg();
//        bean.noArg();
//        long thrid = System.currentTimeMillis();
//        System.out.println(second - first);
//        System.out.println(thrid - second);
    }
}
