package src.cts.s02.principii_clean_code.main;

import java.io.FileNotFoundException;
import java.util.List;

import src.cts.s02.principii_clean_code.clase.Aplicant;
import src.cts.s02.principii_clean_code.clase.readers.ReaderAngajat;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		ReaderAngajat readerAngajat = new ReaderAngajat();
		try {
			listaAngajati = readerAngajat.readAplicants("angajati.txt");
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
