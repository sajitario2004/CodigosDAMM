package pruebas1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class pruebas1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		
		try {
			
			
			br = new BufferedReader(new FileReader("gym.txt"));
			
			
			String linea = br.readLine();
			
			while (linea != null) {
				Usuario usuAux = new Usuario();
				String[] split = linea.split(",");
				if(split.length >0) {
					usuAux.setDni(split[0]);
					usuAux.setNombre(split[1]);
					usuAux.setFechaNacimiento(split[2]);
					usuAux.setCuota(Double.valueOf(split[3]));
					
					usuarios.add(usuAux);
				}
				
				linea = br.readLine();
				
			}
			
			
			
			int selector = 0;
			
			
			do {
				System.out.println("Buenas vien benido al menu de seleccion de programa, que accion desea realizar");
				System.out.println("1 Dar de alta.");
				System.out.println("2 Dar de baja.");
				System.out.println("3 Listar usuarios.");
				System.out.println("4 Salir.");
				selector = sc.nextInt();
				
				switch (selector) {
				case 1:
					Usuario aux1 = new Usuario();
					System.out.println("introduzca el dni del nuevo usuario");
					aux1.setDni(sc.next());
					System.out.println("introduzca el nombre completo del usuario");
					aux1.setNombre(sc.next());
					System.out.println("Introduzca la fecha de nacimiento del usuario");
					aux1.setFechaNacimiento(sc.next());
					System.out.println("Cuanto va a ser tu cuota a paga");
					aux1.setCuota(sc.nextDouble());
				
			

					usuarios.add(aux1);
					System.out.println("El usuario a sido añadido");
					break;
				
				//System.out.println("El usuario ya existe");
				
				case 2:
					System.out.println("Digame el DNI del usuario que desea elimar");
					String dniEliminado = sc.next();
				
					boolean comprob = false;
				
					Usuario aux2 = new Usuario();
				
					Iterator<Usuario> itUsu2 = usuarios.iterator();
					while(itUsu2.hasNext()) {
						Usuario aux = itUsu2.next();
						if (aux.getDni().equals(dniEliminado)) {
							comprob = true;
							aux2 = aux;
						
						}
					
					}
					if (comprob) {
						usuarios.remove(aux2);
						System.out.println("El usuario a sido eliminado con exito");

					}else {
						System.out.println("El usuario no existe");

					}
					break;
				case 3:
					System.out.println("Aqui tienes la lista de usuarios:");
				
					//Collections.sort(usuarios);
				
					Iterator<Usuario> itUsu3 = usuarios.iterator();
					while(itUsu3.hasNext()) {
						Usuario usuAux3 = itUsu3.next();
						System.out.print(usuAux3 + "\n");
					}
				
				
					break;
				case 4:
			
					bw = new BufferedWriter(new FileWriter("gym.txt"));
					
					Iterator<Usuario> itUsu4 = usuarios.iterator();
					
					while(itUsu4.hasNext()) {
						Usuario usuAux4 = itUsu4.next();
						bw.write(usuAux4.getDni() + "," + usuAux4.getNombre() + ","+ usuAux4.getFechaNacimiento() + "," + usuAux4.getCuota() + "\n") ;
					}
				
					System.out.println("Saliendo de la aplicacion");
					break;
				default:
					System.out.println("La opcion seleccionada no existe");
				
				};
			
			
				
				
			} while (selector != 4);
				

			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	
	
}
