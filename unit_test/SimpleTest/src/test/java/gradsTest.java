import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class gradsTest {


    @BeforeEach
    void setUp() {
        System.out.println("set up");
    }

    @AfterEach
    void tearDown() {
        System.out.println("tear down");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("before all");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("after all");
    }

    @Test
    void fiftyNine() {
        Grades grades = new Grades();
        assertEquals('E',grades.Showgrade(59));
        System.out.println("test fifty nine");
    }
    @Test
    void sixtyNine() {
        Grades grades = new Grades();
        assertEquals('D', grades.Showgrade(69));
        System.out.println("test sixty nine");
    }
    @Test
    void ExceptonTest() {
        Grades grades= new Grades();
        assertThrows(IllegalArgumentException.class,
                () -> {
            grades.Showgrade(-1);
                });
        System.out.println("exception test");
    }

}