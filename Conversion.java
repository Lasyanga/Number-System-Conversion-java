package consoleTutorials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conversion {
	static BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	private String binary, octal, decimal, hexdecimal;
	
	public Conversion() {
		Display();
	}
	
	private boolean isBinary(String bin) {
		for(int i = 0; i < bin.length(); i++) {
			if(bin.charAt(i) != '0' && bin.charAt(i) != '1') {
				return false;
			}
		}
		return true;
	}
	
	private boolean isDecimal(String dec) {
		for(int i = 0; i < dec.length(); i++) {
			if(!Character.isDigit(dec.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	private boolean isOctal(String oct) {
		for(int i = 0; i < oct.length(); i++) {
			if((int)oct.charAt(i) < 48 || (int)oct.charAt(i) > 55) {
				return false;
			}
		}
		return true;
	}
	
	private boolean isHexdecimal(String str) {
		str.toUpperCase();
		for(int i = 0; i < str.length(); i++) {
			if(!Character.isDigit(str.charAt(i)) && (int)str.charAt(i) < 65 && (int)str.charAt(i) > 70) {
				return false;				
			}
		}
		return true;
	}
	
	private void binaryToMenu() {
		try {
			String option = "";
			System.out.println("\nBinary to :\n"
					+ "+------------------------------------------+\n"
					+ "|  [1] Decimal                             |\n"
					+ "|  [2] Octal                               |\n"
					+ "|  [3] Hexadicamal                         |\n"
					+ "+------------------------------------------+\n"
					+ "|Other option:                             |\n"
					+ "|  [4] Back to Home Menu                   |\n"
					+ "+------------------------------------------+");
			System.out.print("Please Enter Number of Choice: ");
			option = read.readLine();
			switch(option) {
				case "1":
					System.out.println("\nBinary Value: "+binary);
					System.out.println("\nDecimal Value: "+Integer.toString(Integer.parseInt(binary, 2), 10)+"\n");
					binaryToMenu();
					break;
				case "2":
					System.out.println("\nBinary Value: "+binary);
					System.out.println("\nOctal Value: "+Integer.toOctalString(Integer.parseInt(binary, 2))+"\n");
					binaryToMenu();
					break;
				case "3":
					System.out.println("\nBinary Value: "+binary);
					System.out.println("\nHexadecimal Value: "+Integer.toHexString(Integer.parseInt(binary, 2))+"\n");
					binaryToMenu();
					break;
				case "4":
					new Conversion();
					break;
				default:
					System.out.println("Please Enter the Correct Option.");
					binaryToMenu();
			}
			
		}catch(IOException e) {
			System.err.print(e.getMessage());
		}
		
	}
	
	private void decimalToMenu() {
		try {
			String option = "";
			System.out.println("\nDecimal to :\n"
					+ "+------------------------------------------+\n"
					+ "|  [1] Binary                              |\n"
					+ "|  [2] Octal                               |\n"
					+ "|  [3] Hexadicamal                         |\n"
					+ "+------------------------------------------+\n"
					+ "|Other option:                             |\n"
					+ "|  [4] Back to Home Menu                   |\n"
					+ "+------------------------------------------+");
			System.out.print("Please Enter Number of Choice: ");
			option = read.readLine();
			switch(option) {
				case "1":
					System.out.println("\nDecimal Value: "+decimal);
					System.out.println("\nBinary Value: "+Integer.toBinaryString(Integer.parseInt(decimal, 10))+"\n");
					decimalToMenu();
					break;
				case "2":
					System.out.println("\nDecimal Value: "+decimal);
					System.out.println("\nOctal Value: "+Integer.toOctalString(Integer.parseInt(decimal, 10))+"\n");
					decimalToMenu();
					break;
				case "3":
					System.out.println("\nDecimal Value: "+decimal);
					System.out.println("\nHexadecimal Value: "+Integer.toHexString(Integer.parseInt(decimal, 10))+"\n");
					decimalToMenu();
					break;
				case "4":
					new Conversion();
					break;
				default:
					System.out.println("Please Enter the Correct Option.");
					decimalToMenu();
			}
			
		}catch(IOException e) {
			System.err.print(e.getMessage());
		}
		
	}
	
	private void octalToMenu() {
		try {
			String option = "";
			System.out.println("\nOctal to :\n"
					+ "+------------------------------------------+\n"
					+ "|  [1] Binary                              |\n"
					+ "|  [2] Decimal                             |\n"
					+ "|  [3] Hexadicamal                         |\n"
					+ "+------------------------------------------+\n"
					+ "|Other option:                             |\n"
					+ "|  [4] Back to Home Menu                   |\n"
					+ "+------------------------------------------+");
			System.out.print("Please Enter Number of Choice: ");
			option = read.readLine();
			switch(option) {
				case "1":
					System.out.println("\nOctal Value: "+octal);
					System.out.println("\nBinary Value: "+Integer.toBinaryString(Integer.parseInt(octal, 8))+"\n");
					octalToMenu();
					break;
				case "2":
					System.out.println("\nOctal Value: "+octal);
					System.out.println("\nDecimal Value: "+Integer.toString(Integer.parseInt(octal, 8), 10)+"\n");
					octalToMenu();
					break;
				case "3":
					System.out.println("\nOctal Value: "+octal);
					System.out.println("\nHexadecimal Value: "+Integer.toHexString(Integer.parseInt(octal, 8))+"\n");
					octalToMenu();
					break;
				case "4":
					new Conversion();
					break;
				default:
					System.out.println("Please Enter the Correct Option.");
					octalToMenu();
			}
			
		}catch(IOException e) {
			System.err.print(e.getMessage());
		}
		
	}
	
	private void hexToMenu() {
		try {
			String option = "";
			System.out.println("\nHexadecimal to :\n"
					+ "+------------------------------------------+\n"
					+ "|  [1] Binary                              |\n"
					+ "|  [2] Decimal                             |\n"
					+ "|  [3] Octal                               |\n"
					+ "+------------------------------------------+\n"
					+ "|Other option:                             |\n"
					+ "|  [4] Back to Home Menu                   |\n"
					+ "+------------------------------------------+");
			System.out.print("Please Enter Number of Choice: ");
			option = read.readLine();
			switch(option) {
				case "1":
					System.out.println("\nHexadecimal Value: "+hexdecimal);
					System.out.println("Binary Value: "+Integer.toBinaryString(Integer.parseInt(hexdecimal, 16)));
					hexToMenu();
					break;
				case "2":
					System.out.println("\nHexadecimal Value: "+hexdecimal);
					System.out.println("Decimal Value: "+Integer.toString(Integer.parseInt(hexdecimal, 16), 10));
					hexToMenu();
					break;
				case "3":
					System.out.println("\nHexadecimal Value: "+hexdecimal);
					System.out.println("Octal Value: "+Integer.toOctalString(Integer.parseInt(hexdecimal, 16)));
					hexToMenu();
					break;
				case "4":
					new Conversion();
					break;
				default:
					System.out.println("Please Enter the Correct Option.");
					hexToMenu();
			}
			
		}catch(IOException e) {
			System.err.print(e.getMessage());
		}
		
	}
	
	private void choice(String choice) {
		switch(choice) {
			case "1":
				try {
					do {
						System.out.print("\nPlease Enter the Binary Value: ");
						binary = read.readLine();
					}while(!isBinary(binary));
					
					System.out.println("\nBinary Value: "+binary+"\n");
					binaryToMenu();
				}catch(IOException ie) {
					System.err.print(ie.getMessage());
				}				
				break;
				
			case "2":
				try {
					do {
						System.out.print("\nPlease Enter the Decimal Value: ");
						decimal = read.readLine();
					}while(!isDecimal(decimal));
					
					System.out.println("\nDecimal Value: "+decimal);
					decimalToMenu();
				}catch(IOException ie) {
					System.err.print(ie.getMessage());
				}	
				break;
				
			case "3":
				try {
					do {
						System.out.print("\nPlease Enter the Octal Value: ");
						octal = read.readLine();
					}while(!isOctal(octal));
					
					System.out.println("\nOctal Value: "+octal);
					octalToMenu();
				}catch(IOException ie) {
					System.err.print(ie.getMessage());
				}	
				break;
				
			case "4":
				try {
					do {
						System.out.print("\nPlease Enter the HexaDecimal Value: ");
						hexdecimal = read.readLine();
					}while(!isHexdecimal(hexdecimal));
					
					System.out.println("\nHexadecimal Value: "+hexdecimal);
					hexToMenu();
				}catch(IOException ie) {
					System.err.print(ie.getMessage());
				}	
				break;
			
			default:
				System.out.println("\nPlease Enter the Correct Option.\n");
				Display();			
		}
	}
	
	private void Display() {
		String input;
		System.out.println("Welcome To Number System Conversion\n"
				+ "+------------------------------------------+\n"
				+ "| [1] Binary to                            |\n"
				+ "|       > Decimal                          |\n"
				+ "|       > Octal                            |\n"
				+ "|       > Hexadecimal                      |\n"
				+ "|                                          |\n"
				+ "| [2] Decimal to	                   |\n"
				+ "|       > Binary                           |\n"
				+ "|       > Octal                            |\n"
				+ "|       > Hexadecimal                      |\n"
				+ "|                                          |\n"
				+ "| [3] Octal to                             |\n"
				+ "|       > Binary                           |\n"
				+ "|       > Decimal                          |\n"
				+ "|       > Hexadecimal                      |\n"
				+ "|                                          |\n"
				+ "| [4] Hexadecimal to                       |\n"
				+ "|       > Binary                           |\n"
				+ "|       > Decimal                          |\n"
				+ "|       > Octal                            |\n"
				+ "+------------------------------------------+");
		try {
			System.out.print("Please Enter the Number of your choice: ");
			input = read.readLine();
			choice(input);
			
		}catch(IOException ie) {
			System.err.print(ie.getMessage());
		}
		
	}

	public static void main(String[] args) {
		new Conversion();
	}

}
