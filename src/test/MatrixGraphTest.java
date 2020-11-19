package test;

import main.MatrixGraph;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MatrixGraphTest {


    @org.junit.jupiter.api.Test
    void PrimsMST() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        MatrixGraph thisGraph = new MatrixGraph(7);
        thisGraph.addEdge( 0, 1, 1);
        thisGraph.addEdge( 0, 2, 5);
        thisGraph.addEdge( 0, 4, 3);
        thisGraph.addEdge( 1, 5, 7);
        thisGraph.addEdge( 1, 4, 1);
        thisGraph.addEdge( 2, 3, 1);
        thisGraph.addEdge( 3, 6, 1);
        thisGraph.addEdge( 3, 4, 1);
        thisGraph.addEdge( 4, 3, 3);
        thisGraph.addEdge( 4, 2, 1);
        thisGraph.addEdge( 4, 5, 3);
        thisGraph.addEdge( 4, 6, 4);
        thisGraph.addEdge( 5, 6, 1);

        thisGraph.printGraph();
        thisGraph.PrimsMST();

        String expected = "Minimum spanning Tree Distance: 8";
        String expected_1 = "0 parent -1 EdgeWeight: 0";
        String expected_2 = "1 parent 0 EdgeWeight: 1";
        String expected_3 = "2 parent 4 EdgeWeight: 1";
        String expected_4 = "3 parent 2 EdgeWeight: 1";
        String expected_5 = "4 parent 1 EdgeWeight: 1";
        String expected_6 = "5 parent 4 EdgeWeight: 3";
        String expected_7 = "6 parent 3 EdgeWeight: 1";
        assertTrue(outContent.toString().contains(expected));
        assertTrue(outContent.toString().contains(expected_1));
        assertTrue(outContent.toString().contains(expected_2));
        assertTrue(outContent.toString().contains(expected_3));
        assertTrue(outContent.toString().contains(expected_4));
        assertTrue(outContent.toString().contains(expected_5));
        assertTrue(outContent.toString().contains(expected_6));
        assertTrue(outContent.toString().contains(expected_7));

    }

}