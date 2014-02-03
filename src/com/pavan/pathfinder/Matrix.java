package com.pavan.pathfinder;

import java.util.Arrays;

public class Matrix {
	final static int Src[][] ={{1,0,1},
		{1,1,1},
		{1,0,1}};
	static int rwCnt = Src.length;
	static int colCnt = Src[0].length;
	static int Path[][] = new int[rwCnt][colCnt];
	static int curPath = 0;
	
	public static void Traverse(){
//		Path[0][0] = 1;
		
		for(int i = 0;i<rwCnt;i++){
			for(int j = 0; j<colCnt; j++){
				if(Src[i][j] == 1){
					if(Path[i][j] == 0){
						Path[i][j] = ++curPath;
//						++curPath;
						NeighbourFill.Fill(i,j);
					}
					
				}
			}
		}
		System.out.println(Arrays.deepToString(Src).replaceAll("],", "],\r\n"));
		System.out.println("\r\n");
		System.out.println(Arrays.deepToString(Path).replaceAll("],", "],\r\n"));
		}
	public static int getSrcValue(int i,int j){
		if(i<0||i>rwCnt-1||j<0||j>colCnt-1)
			return 0;
		else
			return Src[i][j];
	}
	public static int getPathValue(int i,int j){
		if(i<0||i>rwCnt-1||j<0||j>colCnt-1)
			return 0;
		else
			return Path[i][j];
	}
	}
