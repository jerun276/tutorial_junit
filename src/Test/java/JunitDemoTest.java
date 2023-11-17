import org.junit.jupiter.api.*;

public class JunitDemoTest {

    @BeforeAll
    static void beforeClass(){
        System.out.println("Running... before class");
    }


    @BeforeEach
    void beforeEach(){
        System.out.println("Running... before each");
    }

    @AfterEach
    void afterEach(){
        System.out.println("Running... after each");
    }

    @Test
    @DisplayName("Hello World1 test cases")
    public void junitTest1(){
        System.out.println("Running... junitTest1()");
        String actualValue = "Hello World";
        Assertions.assertEquals("Hello World", actualValue);

    }

    @Test
    @DisplayName("Hello World2 test cases")
    public void junitTest2(){
        System.out.println("Running... junitTest2()");
        String actualValue = "Hello World1";
        Assertions.assertEquals("Hello World1", actualValue);

    }

    @AfterAll
    static void afterClass(){
        System.out.println("Running... after class");
    }


}