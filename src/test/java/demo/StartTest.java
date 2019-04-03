package demo;

import com.StartupApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//需要增加class为启动的那个类
@SpringBootTest(classes = StartupApplication.class)
public class StartTest {

    @Test
    public void contextLoads(){
        System.out.println("this is test");
    }
}
