package top.huzhurong.fuck.transaction.netty;

import top.huzhurong.fuck.transaction.netty.ii.UserService;

/**
 * @author chenshun00@gmail.com
 * @since 2018/12/1
 */
public class DefaultUserService implements UserService {

    @Override
    public String name() {
        return "cc";
    }
}
