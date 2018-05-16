package com.yourcodelab.util;

public class EquacaoSegundoGrau {
	
	//Calcular o Delta
	public int delta(int a, int b, int c){
		return (b*b) - (4*a*c);
	}
	
	//Calcular x1
	public double x1(int a, int b, int c){
		int d = delta(a,b,c);
		
		return ((-b + Math.sqrt(d))/2*a);
	}
	
	//Calcular x2
	public double x2(int a, int b, int c){		
		return ((-b - Math.sqrt(delta(a,b,c)))/2*a);
	}
}
