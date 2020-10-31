package main;

import java.util.*;

public class ElectricityMatrixGraph extends MatrixGraph {
    HashMap<String, Integer> TownIndex = new HashMap<String, Integer>();
    int CostPerDistance = 1000000;

    public ElectricityMatrixGraph(int townCount) {
        super(townCount);
    }

    public void addTownElectricityData(String fromTown, String toTown, int distance) {
        updateTownIndex(fromTown);
        updateTownIndex(toTown);
        addEdge(TownIndex.get(fromTown), TownIndex.get(toTown), distance);
        addEdge(TownIndex.get(toTown), TownIndex.get(fromTown), distance);
    }

    private void updateTownIndex(String town) {
        if (!TownIndex.containsKey(town)) {
            TownIndex.put(town, TownIndex.size());
        }
    }

    @Override
    public void printGraph() {
        for (int fromi = 0; fromi < matrixGraph.length; fromi++) {
            System.out.println("Electricity from: '" + getTownByIndex(fromi) + "'");
            for (int toj = 0; toj < matrixGraph.length; toj++) {
                if (matrixGraph[fromi][toj] == 1) {
                    System.out.print("To '" + getTownByIndex(toj));
                    System.out.print("', distance: " + matrixWeightGraph[fromi][toj] + " km ");
                    System.out.println(" ");
                }
            }
            System.out.println(" ");
        }
    }


    @Override
    public void printMSTEdges(int[] pred, int[] dist) {
        for (int i = 0; i < matrixGraph.length; i++) {
            System.out.println("'" + getTownByIndex(pred[i]) + "' To '" + getTownByIndex(i) + "', distance: " + dist[i] + " km ");
        }
    }

    @Override
    public void printMSTValue(int MST) {
        System.out.println(" Minimum spanning Tree Distance: " + MST + " km");
        System.out.println(" Minimum cost: " + MST * CostPerDistance + " kr");
    }

    private String getTownByIndex(int value) {
        if (value == -1)
            return "Start";

        for (Map.Entry<String, Integer> entry : TownIndex.entrySet()) {
            if (value == entry.getValue()) {
                return entry.getKey();
            }
        }
        return "Not found!";
    }


}
