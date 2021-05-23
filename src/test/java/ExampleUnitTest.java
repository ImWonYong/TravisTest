import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class ExampleUnitTest {
    @Mock
    Sound sound;

    @Test
    public void mockTest() {
        MockitoAnnotations.initMocks(this);
        when(sound.shout()).thenReturn("짹짹");
        assertTrue(sound != null);

        Animal a = new Animal();
        a.setAge(3);
        a.setName("참새");
        a.setFly(true);
        a.setSound(sound);

        assertTrue(a.getAge() == 3);
        assertTrue(a.getName().equals("참새"));
        assertTrue(a.getFly() == true);
        assertTrue(a.shout().equals("뻐꾹"));

    }
}
