package top.huzhurong.fuck;

/**
 * @author chenshun00@gmail.com
 * @since 2018/12/1
 */
public class DefaultService implements UserService {

    @Override
    public String name() {
        return "111:+chen";
    }

    @Override
    public void noArg() {
        System.out.println("return void");
    }
}
