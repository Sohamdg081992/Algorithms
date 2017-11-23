package Gfg;

import java.util.LinkedList;

public class GFG 
{
	
	static class Graph{
		int v;
		LinkedList<Integer> llist[];
		Graph(int v){
		this.v=v;
		 llist=new LinkedList[v];
		for (int i=0;i<v;i++){
			llist[i] = new LinkedList();
		}
		}
		}
	static void addEdge(Graph graph,int start,int end){
		graph.llist[start].addFirst(end);
		graph.llist[end].addFirst(start);
		}
	static void printlist(Graph graph){
	for (int x=0;x<graph.v;x++){
		for (Integer m:graph.llist[x]){
			System.out.println(" "+m);
		}
		System.out.println("\n");
	}	
	}
	
public static void main(String args[]){
	int v=6;
	Graph graph=new Graph(v);
	addEdge(graph, 0, 1);
	addEdge(graph, 0, 5);
	addEdge(graph, 0, 4);
	addEdge(graph, 1, 2);
	addEdge(graph, 1, 3);
	addEdge(graph, 1, 4);
	addEdge(graph, 2, 3);
	addEdge(graph, 3, 4);
	addEdge(graph, 3, 5);
	printlist(graph);
}}
