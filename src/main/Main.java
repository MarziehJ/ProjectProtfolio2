package main;

public class Main {

    public static void main(String[] args) {

//        MatrixGraph thisGraph = new MatrixGraph(7);
//
//        thisGraph.addEdge( 0, 1, 1);
//        thisGraph.addEdge( 0, 2, 5);
//        thisGraph.addEdge( 0, 4, 3);
//        thisGraph.addEdge( 1, 5, 7);
//        thisGraph.addEdge( 1, 4, 1);
//        thisGraph.addEdge( 2, 3, 1);
//        thisGraph.addEdge( 3, 6, 1);
//        thisGraph.addEdge( 3, 4, 1);
//        thisGraph.addEdge( 4, 3, 3);
//        thisGraph.addEdge( 4, 2, 1);
//        thisGraph.addEdge( 4, 5, 3);
//        thisGraph.addEdge( 4, 6, 4);
//        thisGraph.addEdge( 5, 6, 1);
//
//        thisGraph.printGraph();
//        thisGraph.PrimsMST();

//        thisGraph.addEdge( 0, 1, 4);
//        thisGraph.addEdge( 0, 7, 8);
//        thisGraph.addEdge( 1, 2, 8);
//        thisGraph.addEdge( 1, 7, 11);
//        thisGraph.addEdge( 2, 3, 7);
//        thisGraph.addEdge( 2, 8, 2);
//        thisGraph.addEdge( 2, 5, 4);
//        thisGraph.addEdge( 3, 4, 9);
//        thisGraph.addEdge( 3, 5, 14);
//        thisGraph.addEdge( 4, 5, 10);
//        thisGraph.addEdge( 5, 6, 2);
//        thisGraph.addEdge( 6, 7, 1);
//        thisGraph.addEdge( 6, 8, 6);
//        thisGraph.addEdge( 7, 8, 7);

        // Method invoked
//        thisGraph.printGraph();
//        thisGraph.PrimsMST();

	// write your code here

        ElectricityMatrixGraph thisGraph = new ElectricityMatrixGraph(16);
        thisGraph.addTownElectricityData("Eskildstrup", "Maribo", 28);
        thisGraph.addTownElectricityData("Eskildstrup", "Nykøbing F", 13);
        thisGraph.addTownElectricityData("Eskildstrup", "Vordingborg", 24);

        thisGraph.addTownElectricityData("Haslev", "Korsør", 60);
        thisGraph.addTownElectricityData("Haslev", "Køge", 24);
        thisGraph.addTownElectricityData("Haslev", "Næstved", 25);
        thisGraph.addTownElectricityData("Haslev", "Ringsted", 19);
        thisGraph.addTownElectricityData("Haslev", "Roskilde", 47);
        thisGraph.addTownElectricityData("Haslev", "Slagelse", 48);
        thisGraph.addTownElectricityData("Haslev", "Sorø", 34);
        thisGraph.addTownElectricityData("Haslev", "Vordingborg", 40);

        thisGraph.addTownElectricityData("Holbæk", "Kalundborg", 44);
        thisGraph.addTownElectricityData("Holbæk", "Korsør", 66);
        thisGraph.addTownElectricityData("Holbæk", "Ringsted", 36);
        thisGraph.addTownElectricityData("Holbæk", "Roskilde", 32);
        thisGraph.addTownElectricityData("Holbæk", "Slagelse", 46);
        thisGraph.addTownElectricityData("Holbæk", "Sorø", 34);

        thisGraph.addTownElectricityData("Jærgerspris", "Korsør", 95);
        thisGraph.addTownElectricityData("Jærgerspris", "Køge", 58);
        thisGraph.addTownElectricityData("Jærgerspris", "Ringsted", 56);
        thisGraph.addTownElectricityData("Jærgerspris", "Roskilde", 33);
        thisGraph.addTownElectricityData("Jærgerspris", "Slagelse", 74);
        thisGraph.addTownElectricityData("Jærgerspris", "Sorø", 63);

        thisGraph.addTownElectricityData("Kalundborg", "Ringsted", 62);
        thisGraph.addTownElectricityData("Kalundborg", "Roskilde", 70);
        thisGraph.addTownElectricityData("Kalundborg", "Slagelse", 39);
        thisGraph.addTownElectricityData("Kalundborg", "Sorø", 51);

        thisGraph.addTownElectricityData("Korsør", "Næstved", 45);
        thisGraph.addTownElectricityData("Korsør", "Slagelse", 20);

        thisGraph.addTownElectricityData("Køge", "Næstved", 45);
        thisGraph.addTownElectricityData("Køge", "Ringsted", 28);
        thisGraph.addTownElectricityData("Køge", "Roskilde", 25);
        thisGraph.addTownElectricityData("Køge", "Vordingborg", 60);

        thisGraph.addTownElectricityData("Maribo", "Nakskov", 27);
        thisGraph.addTownElectricityData("Maribo", "Nykøbing F", 26);


        thisGraph.addTownElectricityData("Næstved", "Roskilde", 57);
        thisGraph.addTownElectricityData("Næstved", "Ringsted", 26);
        thisGraph.addTownElectricityData("Næstved", "Slagelse", 37);
        thisGraph.addTownElectricityData("Næstved", "Sorø", 32);

        thisGraph.addTownElectricityData("Ringsted", "Roskilde", 31);
        thisGraph.addTownElectricityData("Ringsted", "Sorø", 15);
        thisGraph.addTownElectricityData("Ringsted", "Vordingborg", 58);

        thisGraph.addTownElectricityData("Slagelse", "Sorø", 14);

        thisGraph.printGraph();
        thisGraph.PrimsMST();

    }
}
