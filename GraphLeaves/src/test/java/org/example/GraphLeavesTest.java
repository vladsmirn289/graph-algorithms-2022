package org.example;

import com.mathsystem.api.graph.GraphFactory;
import com.mathsystem.api.graph.model.Graph;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.assertj.core.api.Assertions.assertThat;

public class GraphLeavesTest {

    @Test
    void shouldCheckGraphLeavesOnEmptyGraph() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/testGraph1.txt"));

        GraphLeaves graphLeaves = new GraphLeaves();
        assertThat(graphLeaves.execute(testGraph)).isEqualTo(0);
    }

    @Test
    void shouldCheckGraphLeavesOnUndirectedGraphWithoutEdges() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/testGraph2.txt"));

        GraphLeaves graphLeaves = new GraphLeaves();
        assertThat(graphLeaves.execute(testGraph)).isEqualTo(0);
    }

    @Test
    void shouldCheckGraphLeavesOnUndirectedCycledGraph() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/testGraph3.txt"));

        GraphLeaves graphLeaves = new GraphLeaves();
        assertThat(graphLeaves.execute(testGraph)).isEqualTo(0);
    }

    @Test
    void shouldCheckGraphLeavesOnUndirectedGraphWithTwoVertexesAndTwoEdges() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/testGraph4.txt"));

        GraphLeaves graphLeaves = new GraphLeaves();
        assertThat(graphLeaves.execute(testGraph)).isEqualTo(2);
    }

    @Test
    void shouldCheckGraphLeavesOnCasualUndirectedGraph() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/testGraph5.txt"));

        GraphLeaves graphLeaves = new GraphLeaves();
        assertThat(graphLeaves.execute(testGraph)).isEqualTo(5);
    }

/// DIRECTED GRAPH !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    @Test
    void shouldCheckGraphLeavesOnDirectedGraphWithTwoVertexesAndOneEdge() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/testGraph6.txt"));

        GraphLeaves graphLeaves = new GraphLeaves();
        assertThat(graphLeaves.execute(testGraph)).isEqualTo(1);
    }

    @Test
    void shouldCheckGraphLeavesOnDirectedGraph1() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/testGraph7.txt"));

        GraphLeaves graphLeaves = new GraphLeaves();
        assertThat(graphLeaves.execute(testGraph)).isEqualTo(0);
    }


    @Test
    void shouldCheckGraphLeavesOnDirectedGraph2() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/testGraph8.txt"));

        GraphLeaves graphLeaves = new GraphLeaves();
        assertThat(graphLeaves.execute(testGraph)).isEqualTo(3);
    }


    @Test
    void shouldCheckGraphLeavesOnCasualDirectedGraph() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/testGraph9.txt"));

        GraphLeaves graphLeaves = new GraphLeaves();
        assertThat(graphLeaves.execute(testGraph)).isEqualTo(2);
    }

}