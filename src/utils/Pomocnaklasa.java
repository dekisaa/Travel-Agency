package utils;

import model.adresa.Adresa;
import model.adresa.Drzava;
import model.adresa.Mesto;
import model.korisnici.Korisnik;
import model.smestaj.Apartman;
import model.smestaj.Hotel;
import model.zakupljivanje.Aranzman;
import model.zakupljivanje.Paket;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Pomocnaklasa {

    public static void upisiUFajlKorisnik(ArrayList<Korisnik> korisnici) throws IOException {
        try
        {
            FileOutputStream fos = new FileOutputStream("fajlovi/korisnici");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(korisnici);
            oos.close();
            fos.close();

        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
    }

    public static ArrayList<Korisnik> citajIzFajlaKorisnik(String fajl){
        ArrayList<Korisnik> korisnici = new ArrayList<>();
        try
        {
            FileInputStream fis = new FileInputStream(fajl);
            ObjectInputStream ois = new ObjectInputStream(fis);

            korisnici = (ArrayList) ois.readObject();

            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return korisnici;
    }

    public static void upisiUFajlDrzave(ArrayList<Drzava> drzave) throws IOException {
        try
        {
            FileOutputStream fos = new FileOutputStream("fajlovi/drzave");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(drzave);
            oos.close();
            fos.close();

        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
    }

    public static ArrayList<Drzava> citajIzFajlaDrzava(String fajl){
        ArrayList<Drzava> drzave = new ArrayList<>();
        try
        {
            FileInputStream fis = new FileInputStream(fajl);
            ObjectInputStream ois = new ObjectInputStream(fis);

            drzave = (ArrayList) ois.readObject();

            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return drzave;
    }

    public static void upisiUFajlMesta(ArrayList<Mesto> mesta) throws IOException {
        try
        {
            FileOutputStream fos = new FileOutputStream("fajlovi/mesta");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(mesta);
            oos.close();
            fos.close();

        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
    }

    public static ArrayList<Mesto> citajIzFajlaMesto(String fajl){
        ArrayList<Mesto > mesta= new ArrayList<>();
        try
        {
            FileInputStream fis = new FileInputStream(fajl);
            ObjectInputStream ois = new ObjectInputStream(fis);

            mesta= (ArrayList) ois.readObject();

            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return mesta;
    }

    public static void upisiUFajlAdresa(ArrayList<Adresa> adrese) throws IOException {
        try
        {
            FileOutputStream fos = new FileOutputStream("fajlovi/adrese");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(adrese);
            oos.close();
            fos.close();

        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
    }

    public static ArrayList<Adresa> citajIzFajlaAdresa(String fajl){
        ArrayList<Adresa> adresa= new ArrayList<>();
        try
        {
            FileInputStream fis = new FileInputStream(fajl);
            ObjectInputStream ois = new ObjectInputStream(fis);

            adresa= (ArrayList) ois.readObject();

            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return adresa;
    }

    public static void upisiUFajlApartmani(ArrayList<Apartman> apartmani) throws IOException {
        try
        {
            FileOutputStream fos = new FileOutputStream("fajlovi/apartmani");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(apartmani);
            oos.close();
            fos.close();

        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
    }

    public static ArrayList<Apartman> citajIzFajlaApartmani(String fajl){
        ArrayList<Apartman> apartmani= new ArrayList<>();
        try
        {
            FileInputStream fis = new FileInputStream(fajl);
            ObjectInputStream ois = new ObjectInputStream(fis);

            apartmani= (ArrayList) ois.readObject();

            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return apartmani;
    }

    public static void upisiUFajlHotel(ArrayList<Hotel> hoteli) throws IOException {
        try
        {
            FileOutputStream fos = new FileOutputStream("fajlovi/hoteli");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(hoteli);
            oos.close();
            fos.close();

        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
    }

    public static ArrayList<Hotel> citajIzFajlaHotel(String fajl){
        ArrayList<Hotel> hoteli= new ArrayList<>();
        try
        {
            FileInputStream fis = new FileInputStream(fajl);
            ObjectInputStream ois = new ObjectInputStream(fis);

            hoteli= (ArrayList) ois.readObject();

            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return hoteli;
    }

    public static void upisiUFajlAranzmani(ArrayList<Aranzman> aranzmani) throws IOException {
        try
        {
            FileOutputStream fos = new FileOutputStream("fajlovi/aranzmani");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(aranzmani);
            oos.close();
            fos.close();

        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
    }

    public static ArrayList<Aranzman> citajIzFajlaAranzmani(String fajl){
        ArrayList<Aranzman> aranzmani= new ArrayList<>();
        try
        {
            FileInputStream fis = new FileInputStream(fajl);
            ObjectInputStream ois = new ObjectInputStream(fis);

            aranzmani= (ArrayList) ois.readObject();

            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return aranzmani;
    }

    public static void upisiUFajlPaketi(ArrayList<Paket> paketi) throws IOException {
        try
        {
            FileOutputStream fos = new FileOutputStream("fajlovi/paketi");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(paketi);
            oos.close();
            fos.close();

        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
    }

    public static ArrayList<Paket> citajIzFajlaPaketi(String fajl){
        ArrayList<Paket> paketi= new ArrayList<>();
        try
        {
            FileInputStream fis = new FileInputStream(fajl);
            ObjectInputStream ois = new ObjectInputStream(fis);

            paketi= (ArrayList) ois.readObject();

            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return paketi;
    }
    
static Scanner sc = new Scanner(System.in);
	
	//citanje promenljive String
	public static String ocitajTekst(){
		String tekst = "";
		while(tekst == null || tekst.equals(""))
			tekst = sc.nextLine();
		
		return tekst;
	}
		
	//citanje promenljive integer
	public static int ocitajCeoBroj(){
		while (sc.hasNextInt()==false) {
			System.out.println("GRESKA - Pogresno unsesena vrednost, pokusajte ponovo: ");
			sc.nextLine();
		}
		int ceoBroj = sc.nextInt();
		sc.nextLine(); //cisti sve sa ulaza sto nije broj ili ostatak teste posla broja
		return ceoBroj;
	}
		
	//citanje promenljive double
	public static float ocitajRealanBroj(){

		while (sc.hasNextFloat()==false) {
			System.out.println("GRESKA - Pogresno unsesena vrednost, pokusajte ponovo: ");
			sc.nextLine();
		}
		float realanBroj = sc.nextFloat();
		sc.nextLine(); //cisti sve sa ulaza sto nije broj ili ostatak teste posla broja
		return realanBroj;
	}
		
	//citanje promenljive char
	public static char ocitajKarakter(){
		
		String text;
		while ( (text=sc.next())==null || text.length()!=1) {
			System.out.println("GRESKA - Pogresno unsesena vrednost za karakter, pokusajte ponovo: ");
			sc.nextLine();
		}
		char karakter = text.charAt(0);
		return karakter;
	}
	
	//citanje promenljive char
	public static char ocitajOdlukuOPotvrdi(String tekst){
		System.out.println("Da li zelite " + tekst + " [Y/N]:");
		char odluka = ' ';
		while( !(odluka == 'Y' || odluka == 'N') ){
			odluka = ocitajKarakter();
			if (!(odluka == 'Y' || odluka == 'N')) {
				System.out.println("Opcije su Y ili N");
			}
		}
		return odluka;
	}
	
	static boolean isInteger(String s){
		try {
			Integer.parseInt(s);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	static boolean isDouble(String s){
		try {
			Double.parseDouble(s);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	static boolean isBoolean(String s){
		try {
			Boolean.parseBoolean(s);
		} catch (Exception e) {
			return false;
		}
		return true;
	}


}
