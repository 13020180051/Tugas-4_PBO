
public class MethodReturn {

	public static String nama = "Sitti Ajriana A.";

	public static String getNama(){
		return nama;
	}

	public static int hitungUmur(int lahir, int sekarang){
		int umur = sekarang - lahir;
		return umur;
	}

	public static void main(String[] args){

		String namaSaya = getNama();
		System.out.println("Nama saya: "+namaSaya);

		int umurSaya = hitungUmur(2000, 2020);
		System.out.println("Umur saya: "+umurSaya);
	}

}
