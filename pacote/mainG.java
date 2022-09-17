package pacote;

import java.util.*;
import java.io.*;

public class mainG {

	private static Scanner readFile() throws FileNotFoundException {
		String file = "C:\\pequenoG.txt";
		FileReader reader = new FileReader(file);
		return new Scanner(reader).useDelimiter("\\n");
	}

	public static void main(String[] args) throws Exception {

		mainG grafo;
		int[][] matrizAdj;
		int qtdEd, qtdVert, Vertices_Isolados;
		grafo = new mainG(readFile());
		matrizAdj = grafo.matriz();
		qtdEd = grafo.getboad();
		qtdVert = grafo.getVert();
		Vertices_Isolados = grafo.getVert_Isolados();
	}

	private int[][] matriz;
	private int qtdBorda;
	private int Vert_Isolados;
	private Scanner sc;
	private int qtdVert;

	public int[][] matriz() {
		return this.matriz;
	}

	public int getVert() {
		return qtdVert;
	}

	public mainG(Scanner file) {
		this.sc = file;
	}

	public int getVert_Isolados() {
		return Vert_Isolados;
	}

	public int getboad() {
		return qtdBorda;
	}

	private int contador() {
		boolean isolado;
		int contador = 0;

		for (int i = 0; i < this.matriz.length; i++) {
			isolado = true;
			for (int j = 0; j < this.matriz.length; j++) {
				if (this.matriz[i][j] == 1 || this.matriz[j][i] == 1)
					isolado = false;
			}
			if (isolado == true)
				contador++;
		}
		return contador;
	}

	private static void MostrarMatrizADJ(int[][] matrizAdj) {
		for (int i = 0; i < matrizAdj.length; i++) {
			for (int j = 0; j < matrizAdj[0].length; j++) {
				System.out.print(matrizAdj[i][j] + " ");
			}
			System.out.println();
		}
	}

}