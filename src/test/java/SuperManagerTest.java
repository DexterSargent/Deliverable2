import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.UUID;
import ParkingSystem.*;

public class SuperManagerTest {
    private AccountRegistry registry = new AccountRegistry();
    private SuperManager superManager;

    @BeforeEach
    void setUp() {
    	SuperManager.reset();
        registry = new AccountRegistry();
        superManager = SuperManager.createFromCSV("SM-123", "SuperAdmin", "securePass123", registry);
    }

    @Test
    void testSingletonInstance() {
        SuperManager anotherInstance = SuperManager.createFromCSV("SM-456", "AnotherSuper", "pass", registry);
        assertSame(superManager, anotherInstance);
    }

    @Test
    void testRegistryReference() {
        assertSame(registry, superManager.registry);
    }

    @Test
    void testAutoGenerateManagerIncreasesCount() {
        int initialCount = registry.getManagersSize();
        superManager.autoGenerateManager();
        assertEquals(initialCount + 1, registry.getManagersSize());
    }

    @Test
    void testGeneratedManagerIdFormat() {
        Manager manager = superManager.autoGenerateManager();
        assertDoesNotThrow(() -> UUID.fromString(manager.getManagerId()));
    }
    
    @Test
    void testGeneratedManagerCredentialLengths() {
        Manager manager = superManager.autoGenerateManager();
        assertEquals(8, manager.getName().length());
        assertEquals(10, manager.getPassword().length());
    }

    @Test
    void testGeneratedManagerInRegistry() {
        Manager manager = superManager.autoGenerateManager();
        assertTrue(registry.getManagers().containsKey(manager.getManagerId()));
    }

    @Test
    void testMultipleManagerGenerations() {
        int initialCount = registry.getManagersSize();
        superManager.autoGenerateManager();
        superManager.autoGenerateManager();
        assertEquals(initialCount + 2, registry.getManagersSize());
    }

    @Test
    void testGeneratedPasswordCharacters() {
        Manager manager = superManager.autoGenerateManager();
        assertTrue(manager.getPassword().matches("^[A-Za-z0-9]+$"));
    }

    @Test
    void testGeneratedManagerPersistence() {
        Manager manager = superManager.autoGenerateManager();
        Manager retrieved = registry.getManagers().get(manager.getManagerId());
        assertEquals(manager.getName(), retrieved.getName());
    }
    
    @Test
    void testSuperManagerInitialization() {
        assertEquals("SM-123", superManager.getManagerId());
        assertEquals("SuperAdmin", superManager.getName());
        assertEquals("securePass123", superManager.getPassword());
    }
}

