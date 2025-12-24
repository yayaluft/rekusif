# PERCOBAAN 1
1. Apa yang dimaksud dengan fungsi rekursif?
2. Pada Percobaan1, apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program pada penggunaan fungsi rekursif dan fungsi iteratif!

## Jawaban:
1. Sebuah fungsi memberi perintah untuk memanggil fungsi itu sendiri sehingga akan terjadi secara berulang-ulang
2. hasil yang diberikan masing-masing fungsi tidak sama, hasil faktorialRekusif(5) adalah 120 sedangkan faktorialIteratif(5) adalah 1.
- faktorialRekusif :
fungsi memanggil dirinya sendiri dan memiliki base case if (n == 0). Proses berjalan dari n lalu n-1 dan seterusnya, setelah itu hasil di return.
- faktorialIteratif :
fungsi ini menggunakan perulangan atau looping. proses berjalan dari n hingga 1. 

# PERCOBAAN 2
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!
2. Tambahkan kode program untuk mencetak deret perhitungan pangkatnya. Contoh: hitungPangkat(2,5) dicetak 2x2x2x2x2x1 = 32

## Jawaban:
1. fungsi tersebut akan terus berjalan secara berulang hingga mencapai base case dimana kondisi berhenti.
2. sudah saya modifikasi.

# PERCOBAAN 3
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!
2. Jabarkan trace fase ekspansi dan fase subtitusi algoritma perhitungan laba di atas jika diberikan nilai hitungLaba(100000,3)

# Jawaban:
1. base case berada di kode if (tahun == 0) untuk menghentikan pemanggilan rekursif. recursion call berada di kode return (1.11 * hitungLaba(saldo, tahun-1));
2. 
### fase ekspansi: 
hitungLaba(100000,3)
= 1.11 * hitungLaba(100000, 2)
= 1.11 * (1.11 * hitungLaba(100000, 1))
= 1.11 * (1.11 * (1.11 * hitungLaba(100000, 0)))

### fase substitusi:
= 1.11 * (1.11 * (1.11 * 100000))
= 1.11 * (1.11 * 111000)
= 1.11 * 123210
= 136763.10000000003