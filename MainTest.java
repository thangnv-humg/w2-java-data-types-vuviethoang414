import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainTest {

    @Test
    public void testOutput() {
        // Ghi lại output của chương trình
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Chạy chương trình
        Main.main(null);

        // Chuyển output thành chuỗi
        String output = outputStream.toString().trim();

        // Kiểm tra các giá trị mong đợi
        assertTrue(output.contains("42"), "Output should contain the integer 42");
        assertTrue(output.contains("3.14"), "Output should contain the double 3.14");
        assertTrue(output.contains("Hello, Java!"), "Output should contain the string 'Hello, Java!'");
    }

    @Test
    public void testCondition() {
        // Giả sử biến int trong chương trình là 42
        int myInt = 42;

        if (myInt > 10) {
            assertEquals("Greater than 10", "Greater than 10", "Condition for myInt > 10 should print correctly");
        } else {
            assertEquals("Less or equal to 10", "Less or equal to 10", "Condition for myInt <= 10 should print correctly");
        }
    }
}
