import java.util.Scanner;

public class percabangan{
	public static void main(String[] args) {
		int nilai;
		String nama;
		Scanner scan = new Scanner(System.in);

		System.out.println("nama : ");
		nama = scan.nextLine();
		System.out.print("nilai: ");
        nilai = scan.nextInt();

        
        if( nilai >= 70 ) {
            System.out.println("Selemat " + nama + ", anda lulus!");
        } else {
            System.out.println("Maaf " + nama + ", anda gagal :( coba lagi taun depan :)");
        }

	}
}