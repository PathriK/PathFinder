package com.pavan.pathfinder;

public class NeighbourFill {
	public static void Fill(int k,int l){
		int curPath = Matrix.Path[k][l];
		int up,down,right,left;
//		System.out.println(k + "-" + l + "-" + curPath);
		up = (Matrix.getSrcValue(k-1,l)==1)?(Matrix.getPathValue(k-1,l)==0)?1:0:0;
		down = (Matrix.getSrcValue(k+1,l)==1)?(Matrix.getPathValue(k+1,l)==0)?1:0:0;
		right = (Matrix.getSrcValue(k,l+1)==1)?(Matrix.getPathValue(k,l+1)==0)?1:0:0;
		left = (Matrix.getSrcValue(k,l-1)==1)?(Matrix.getPathValue(k,l-1)==0)?1:0:0;
		if(up == 1){
			Matrix.Path[k-1][l] = curPath;
			NeighbourFill.Fill(k-1, l);
		}
		if(down == 1){
			Matrix.Path[k+1][l] = curPath;
			NeighbourFill.Fill(k+1, l);
		}		
		if(right == 1){
			Matrix.Path[k][l+1] = curPath;
			NeighbourFill.Fill(k, l+1);
		}
		if(left == 1){
			Matrix.Path[k][l-1] = curPath;
			NeighbourFill.Fill(k, l-1);
		}
		
	}
	

	
}
