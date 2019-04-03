package demo;

import com.StartupApplication;
import com.blog.entity.Book;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StartupApplication.class)
public class PropertyTest {

    @Autowired
    Book book;

    @Test
    public void testBookProperties(){
        //注意编码问题，尤其是properties文件的编码问题
        Assert.assertEquals(book.getName(), "测试");
        Assert.assertEquals(book.getAge(), 12);
    }
}
