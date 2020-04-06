package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    static void beforeAll() {
        System.out.println("In BeforeAll");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In BeforeEach");
        greeting = new Greeting();
    }

    @AfterEach
    void tearDown() {
        System.out.println("In AfterEach");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("In AfterAll");
    }

    @Test
    void helloWorld() {
        // given
        // when
        String result = greeting.helloWorld();

        // then
        assertEquals("Hello World", result);
    }

    @Test
    void testHelloWorld() {
        // given
        // when
        String result = greeting.helloWorld("Johnson");

        // then
        assertEquals("Hello Johnson", result);
    }
}