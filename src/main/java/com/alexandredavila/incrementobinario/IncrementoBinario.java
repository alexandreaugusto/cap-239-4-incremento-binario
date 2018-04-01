package com.alexandredavila.incrementobinario;

import java.util.Scanner;

public class IncrementoBinario {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com o numero binario a ser incrementado: ");
		String binario = sc.nextLine();
		char[] binary = binario.toCharArray();
		binario = "";
		
		for(int i=binary.length-1;i>=0;i--) {
			if((int)binary[i] % 2 == 0) {
				binary[i] = '1';
				break;
			}else{
				binary[i] = '0';
				if(i == 0)
					binario = "1" + new String(binary);
			}
		}
		
		System.out.println("Resultado (binario): " + ((binario.equals(""))?new String(binary):binario) + " / em decimal = " + Integer.parseInt(((binario.equals(""))?new String(binary):binario), 2));
		
	}

}
