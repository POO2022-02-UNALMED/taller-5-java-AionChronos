package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Animal {
    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private ArrayList<Zona> zona = new ArrayList<Zona>();

    public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.habitat = habitat;
		totalAnimales++;
	}
	
	public Animal() {
		this(null, 0, null, null);
	}
	
	public int getTotalAnimales() {
		return totalAnimales;
	}

	public void setTotalAnimales(int totalAnimales) {
		this.totalAnimales = totalAnimales;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public ArrayList<Zona> getZona() {
		return zona;
	}

	public void setZona(ArrayList<Zona> zona) {
		this.zona = zona;
	}

	public String movimiento() {
		return "desplazarse";
	}
	
	public static String totalPorTipo() {
        return String.format("Mamiferos: %d\nAves: %d\nReptiles: %d\nPeces: %d\nAnfibios: %d", Mamifero.cantidadMamiferos(), Ave.cantidadAves(), Reptil.cantidadReptiles(), Pez.cantidadPeces(), Anfibio.cantidadAnfibios());
    }
	
	@Override
    public String toString() {
        if (zona.size() == 0) {
            return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero;
        }
		else{
			return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero +
                    ", la zona en la que me ubico es " + zona + ", en el " + zona.get(0).getZoo().getNombre();
		}
    }

}
