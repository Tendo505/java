public class Untitled {
    public static void main(String[] args) {
        
        // ============ CONTOH 1: FOR LOOP ============
        // TAHU berapa kali = 3 kali
        System.out.println("=== FOR LOOP: 3 Ulang (TETAP) ===");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ulang ke-" + i);
        }
        // SELALU: 3 ulang (TETAP)


        // ============ CONTOH 2: WHILE LOOP ============
        // TAK TAHU berapa kali, BERGANTUNG SYARAT
        System.out.println("\n=== WHILE LOOP: Ulang Sehingga x = 10 ===");
        int x = 0;
        while (x < 10) {
            System.out.println("x = " + x);
            x += 3;  // Tambah 3
        }
        // BOLEH: 3 ulang, 4 ulang, 5 ulang (BERGANTUNG SYARAT)


        // ============ CONTOH PALING JELAS ============
        System.out.println("\n=== FOR: TETAP 5 Ulang ===");
        for (int a = 1; a <= 5; a++) {
            System.out.println("*");
        }
        // Output: SELALU 5 bintang


        System.out.println("\n=== WHILE: BERGANTUNG INPUT ===");
        int bilangan = 0;
        while (bilangan < 5) {
            System.out.println("*");
            bilangan++;  // Boleh jadi 3 ulang, 4 ulang, 5 ulang (BERGANTUNG bilangan)
        }
        // Output: BOLEH berbeza (bergantung nilai bilangan)
        
    }
}