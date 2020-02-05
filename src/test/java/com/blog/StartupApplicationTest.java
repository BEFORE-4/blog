package com.blog;

import com.blog.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StartupApplicationTest {

    @Autowired
    Person person ;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService(){
        boolean flag = ioc.containsBean("helloService");
        System.out.println(flag);
    }

    @Test
    public  void getPerson(){
        System.out.println(111111111);
        System.out.println(person);
    }

}
