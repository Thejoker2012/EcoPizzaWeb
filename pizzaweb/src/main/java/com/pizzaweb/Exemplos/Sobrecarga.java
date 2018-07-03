package com.pizzaweb.Exemplos;

public class Sobrecarga {
	
	//Exemplo de sobrecarga
	public class calculadora{
		 public int calcula( int a, int b){
		    return a+b;
		  }
		  public double calcula( double a, double b){
		     return a+b;
		  }
		   public String calcula( String a, String b){
		     return a+b;
		}
	}
}
