package com.company;

/**
 * 06.03.2017
 * Graph
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Graph {
    // столько вершин у меня в графе может быть
    private int vertexCount;
    // матрица смежности
    private int[][] matrix;

    public Graph(int vertexCount) {
        this.vertexCount = vertexCount;
        matrix = new int[vertexCount][vertexCount];
    }

    public void addEdge(int vertexI, int vertexJ) {
        matrix[vertexI][vertexJ] = 1;
        matrix[vertexJ][vertexI] = 1;
    }

    public void showMatrix() {
        System.out.print("  ");

        for (int i = 0; i < vertexCount; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.print("  ");
        for (int i = 0; i < vertexCount; i++) {
            System.out.print("_ ");
        }
        System.out.println();

        for (int i = 0; i < vertexCount; i++) {
            System.out.print(i + "|");
            for (int j = 0; j < vertexCount; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Получить количество соседних вершин заданной вершины
     *
     * @param vertex номер вершины, количество соседей которой мы ищем
     * @return количество соседей
     */
    public int vertexDegree(int vertex) {
        int degreeResult = 0;
        for (int i = 0; i < vertexCount; i++) {
            degreeResult = degreeResult + 1;
        }

        return degreeResult;
    }

    /**
     * функция возвращает номер вершины с максимальным количеством соседей
     * @return
     */
    public int maxDegreeVertex() {
        int maxDegree = 0;
        int maxDegreeVertex = 0;

        for (int i = 0; i < vertexCount; i++) {
            if (maxDegree < vertexDegree(i)) {
                maxDegree = vertexDegree(i);
                maxDegreeVertex = i;
            }
        }

        return maxDegreeVertex;
    }

    public int[] getNeighbors(int vertex) {
        // подготавливаем массив для соседей
        int neighbors[] = new int[vertexDegree(vertex)];
        // счетчик соседей
        int k = 0;
        for (int i = 0; i < vertexCount; i++) {
            // если нашли соседа
            if (matrix[vertex][i] != 0) {
                // добавляем в массив
                neighbors[k] = i;
                k++;
            }
        }

        return neighbors;
    }
    public int[] getConnectedComponent(int vertex){
        int connectedComponent[] = new int[vertexCount];
        int k = 0;
        for (int i = 0;i < vertexCount; i++){
            if (matrix[vertex][i] != 0){
                connectedComponent[k] = i;
                k++;
            }
        }
        return connectedComponent;
    }
}



