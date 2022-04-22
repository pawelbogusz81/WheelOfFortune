package pl.pawelprog;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlayerTest {

    @Test
    void testToString(){
        //given
        String name = "Paweł";
        Player player = new Player(name);

        //when
        String result = player.toString();

        //then
        Assertions.assertEquals("[<" + name + ">]", result);
    }
}