import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class DigitalWatchTest {
    @Test
    void test1() {
        digital_watch d = new digital_watch();
        assertEquals("Turned On!",d.turnOn());
    }
    @Test
    public void test2(){
        digital_watch d = new digital_watch();
        assertEquals("Turned On!",d.turnOn());
        assertEquals("Already turned on",d.turnOn());
    }
    @Test
    public void test3(){
        digital_watch d = new digital_watch();
        assertEquals("Turned On!",d.turnOn());
        assertEquals("Already turned on",d.turnOn());
        assertEquals("Turned off",d.turnOff());
    }
}
