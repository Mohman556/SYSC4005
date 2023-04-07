package Test;

import Run.Simulation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SimulationTest {
    Simulation simulation;

    @BeforeEach
    void setUp() {
        simulation = new Simulation();
    }

    @Test
    void testSimulationWithDifferentInspectorSpeeds() throws InterruptedException {
        simulation.avg1 *= 2;
        simulation.avg22 *= 0.5;
        simulation.avg23 *= 1.5;
        simulation.simulate();

        // Check if the simulation produces the correct number of assembled products
        assertTrue(simulation.completedP1 > 0, "No P1 products assembled");
        assertTrue(simulation.completedP2 > 0, "No P2 products assembled");
        assertTrue(simulation.completedP3 > 0, "No P3 products assembled");
    }

    @Test
    void testSimulationWithDifferentWorkstationSpeeds() throws InterruptedException {
        simulation.ws1 *= 1.5;
        simulation.ws2 *= 0.75;
        simulation.ws3 *= 2;
        simulation.simulate();

        // Check if the simulation produces the correct number of assembled products
        assertTrue(simulation.completedP1 > 0, "No P1 products assembled");
        assertTrue(simulation.completedP2 > 0, "No P2 products assembled");
        assertTrue(simulation.completedP3 > 0, "No P3 products assembled");
    }

    @Test
    void testSimulationWithInsufficientComponents() throws InterruptedException {
        simulation.avg1 *= 100;
        simulation.avg22 *= 100;
        simulation.avg23 *= 100;
        simulation.simulate();

        // Check if the simulation produces the correct number of assembled products
        assertEquals(0, simulation.completedP1, "P1 products assembled");
        assertEquals(0, simulation.completedP2, "P2 products assembled");
        assertEquals(0, simulation.completedP3, "P3 products assembled");
    }

    @Test
    void testSimulationWithExternalFactors() throws InterruptedException {
        // Here you can add external factors that affect the simulation, e.g., reducing the simulation time
        simulation.simulate();

        // Check if the simulation produces the correct number of assembled products
        assertTrue(simulation.completedP1 > 0, "No P1 products assembled");
        assertTrue(simulation.completedP2 > 0, "No P2 products assembled");
        assertTrue(simulation.completedP3 > 0, "No P3 products assembled");
    }

    @Test
    void avgTime() {
    }

    @Test
    void simulate() {
    }

    @Test
    void printLittlesLawResults() {
    }

    @Test
    void testSimulate() {
    }

    @Test
    void testPrintLittlesLawResults() {
    }

    @Test
    void printResults() {
    }

    @Test
    void testSimulate1() {
    }

    @Test
    void main() {
    }
}
