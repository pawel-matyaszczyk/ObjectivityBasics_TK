package pl.sda.order;

import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @org.junit.jupiter.api.Test
    @DisplayName("return 12 when quantity = 3 and price = 4")
    void should_return_12() {
        //given
        Item item=new Item("Cukier",3,4);
        //when
        double result = item.calculate();

        //then
        assertEquals(12,result);
    }


}