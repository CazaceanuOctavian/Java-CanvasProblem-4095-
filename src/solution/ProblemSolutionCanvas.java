package solution;

import java.util.Scanner;

public class ProblemSolutionCanvas {
	
	static Scanner input= new Scanner(System.in);
	
	public static void main (String[] args) {
		int[][] canvas;
		int length, height, VerticalStreetNum;
		
		length=input.nextInt();
		height=input.nextInt();
		VerticalStreetNum=input.nextInt();
		
		canvas=new int[height+1][length+1];
	
		canvas=InitCanvas(canvas, height, length);
		
		canvas=DrawHozStreets(canvas, height, length);
		
		canvas=DrawVerticalStreets(canvas, height, length, VerticalStreetNum);
		
		System.out.println();
		
		for(int i=1; i<=height; i++) {
			for(int j=1; j<=length; j++)
					System.out.print(canvas[i][j] + " ");
			System.out.println();
		}
		
		int NumIntersectingStreets=0;
		
		for(int i=1; i<=height; i++) 
			for(int j=1; j<=length; j++)
				if(canvas[i][j]==3)
					NumIntersectingStreets++;
		
		System.out.print("there are " + NumIntersectingStreets + " intersecting streets");
		
	}
	
	public static int[][] InitCanvas(int[][] NewCanvas, int CanvasHeight, int CanvasLength) {
		for(int i=1; i<=CanvasHeight; i++)
			for(int j=1; j<=CanvasLength; j++)
					NewCanvas[i][j]=0;
		return NewCanvas;
	}
	
	public static int[][] DrawHozStreets(int[][] CanvasUpdate, int CanvasHeight, int CanvasLength) {
		
		int EcParamA=input.nextInt();
		int EcParamB=input.nextInt();
		int EcParamC=input.nextInt();
		int EcParamD=input.nextInt();
		int CoordX=input.nextInt();
		int CoordY=input.nextInt();
		
		for(int i=1; i<=CanvasHeight; i++) {
			int start=CoordX;
			int HozLength=0;
			for(int j=start; j<=CanvasLength; j++) {
				CanvasUpdate[i][j]++;
				HozLength++;
				if(HozLength>=CoordY)
					break;
			}
			CoordX= 1 + (CoordX*EcParamA + EcParamB) % CanvasLength;
			CoordY= 1 + (CoordY*EcParamC + EcParamD) % (CanvasLength-CoordX + 1);
		}
		
		return CanvasUpdate;
	}
	
	public static int[][] DrawVerticalStreets(int[][] CanvasUpdate, int CanvasHeight, int CanvasLength, int VerticalStreetNum) {
		for(int i=0; i<VerticalStreetNum; i++) {
			int CoordX=input.nextInt();
			int CoordY=input.nextInt();
			int VertLength=input.nextInt();
			int CheckLength=0;
			for(int k=CoordY; k<=CanvasHeight; k++) {
				CanvasUpdate[k][CoordX]+=2;
				CheckLength++;
				if(CheckLength>=VertLength)
					break;
			}
		}
		return CanvasUpdate;
	}
	
}
