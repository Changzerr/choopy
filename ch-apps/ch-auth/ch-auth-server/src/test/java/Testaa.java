import cn.changzer.choppy.AuthorityApplication;
import cn.changzer.choppy.biz.UserMapper;
import cn.changzer.choppy.User;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


/**
 * @author lingqu
 * @date 2022/10/29
 * @apiNote
 */

@SpringBootTest(classes=AuthorityApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class Testaa {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test(){
        List<User> users = userMapper.selectList(new QueryWrapper<>());
        for(User s:users){
            System.out.println(s.toString());
        }
    }
}
