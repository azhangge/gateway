import com.huajie.educomponent.portal.service.AdPromptService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class test {

    @Mock
    private AdPromptService adPromptService;

    @Test
    public void test(){
        adPromptService.get(false);
    }


}
