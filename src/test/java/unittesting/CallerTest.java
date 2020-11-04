package unittesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class CallerTest {
    @Test
    public void testCall(){
        String expectedOutcome = "Ana > abc";
        MockedStatic<Callee> calleeMock = Mockito.mockStatic(Callee.class);
        calleeMock.when(Callee::methodToBeCalled).thenReturn("abc");
        String outcome = Caller.someMethodToBeInvoqued("Ana");
        Assertions.assertEquals(expectedOutcome, outcome);
    }
}
