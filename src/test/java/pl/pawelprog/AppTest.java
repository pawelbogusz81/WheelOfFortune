package pl.pawelprog;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    @Test
    public void alwaysPass() {
        assertTrue(true);
    }

    @Test
    public void addNewPlayer_nameNull_throwsIllegalArgumentException () {

        //given
        String inputName = null;

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> App.addNewPlayer(inputName));
    }

    @Test
    public void addNewPlayer_nameIsBlankOrEmpty_throwsIllegalArgumentException () {

        //given
        String inputName = " ";

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> App.addNewPlayer(inputName));
    }


}
