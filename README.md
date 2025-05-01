# Unit Testing Project 1 – Team TypeScript

This project was a **collaborative team assignment** focused on writing and organizing Java unit tests using IntelliJ, Gradle, and GitHub. Designed to simulate real-world software collaboration, the project emphasized version control practices, code review workflows, and consistent test structure across contributors.

## 👥 Team Collaboration
Led by **Yurii Hehediush**, our team used tools like GitHub, Microsoft Teams, and Zoom to coordinate efforts. As team lead, Yurii set up the repository, created member-specific branches, enforced pull request review policies using a `CODEOWNERS` file, and handled .gitignore setup.

We followed strict formatting guidelines for test classes and method documentation, ensuring a unified, professional structure across our entire test suite.

## 🧪 Technologies Used
- Java with JUnit
- IntelliJ IDEA
- Gradle
- GitHub (branches, PRs, CODEOWNERS)

## 🧩 Sample Test Structure
```java
@DisplayName("Yurii - HSetTest")
class HSetTest {
    HSet hSet;

    @BeforeEach
    @DisplayName("Setting up the test environment")
    void setUp() { 
        hSet = new HSet<>(); 
    }

    @AfterEach
    @DisplayName("Tearing down the test environment")
    void tearDown() { 
        hSet.clear(); 
    }

    @Test
    @DisplayName("HSet size should return 0 after creation")
    void size() {
        assertEquals(0, hSet.size(), "The size of a newly created HSet should be 0");
    }
}
