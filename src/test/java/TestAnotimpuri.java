import enums.Anotimp;
import enums.Luna;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAnotimpuri {
    @Test
    public void testAnotimp(){
        Assertions.assertEquals(Luna.aflaAnotimpul(Luna.NOI), Anotimp.Toamna);
        Luna luna = Luna.valueOf("NOI");
        Assertions.assertEquals(luna, Luna.NOI);

        Assertions.assertEquals("Toamna", Anotimp.Toamna.name());

        Assertions.assertEquals(Anotimp.Toamna, Luna.NOI.getAnotimp());
    }


}
