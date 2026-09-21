# Tugas-PBO-Individu

# ManajemenKost
# MUHAMMAD ARHAM ANUGRAH
# 25091160044 B25

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


Program Sistem Manajemen Kost dibuat untuk membantu pengelolaan data kamar dan penghuni kost secara sederhana. Program ini dapat digunakan untuk menyimpan informasi mengenai kamar kost, data penghuni, serta pembayaran.

Pada program ini terdapat beberapa class utama, yaitu Kamar, KamarBiasa, KamarPremium, Penghuni, dan Pembayaran. Class Kamar digunakan sebagai class utama untuk menyimpan informasi umum mengenai kamar, sedangkan KamarBiasa dan KamarPremium digunakan untuk membedakan jenis kamar berdasarkan fasilitas yang tersedia.


-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


Hierarki class pada program ini adalah:

Kamar
KamarBiasa
KamarPremium

Penghuni
memiliki objek Kamar

Pembayaran
berhubungan dengan data Penghuni

Kamar merupakan superclass yang menjadi dasar bagi KamarBiasa dan KamarPremium. Kedua class tersebut merupakan subclass dari Kamar.

Sedangkan Penghuni memiliki atribut berupa objek Kamar, sehingga data penghuni dapat dikaitkan dengan kamar yang ditempatinya.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Penerapan inheritance terdapat pada class KamarBiasa dan KamarPremium yang mewarisi atribut dan method dari class Kamar.
Keyword extends menunjukkan bahwa KamarBiasa dan KamarPremium merupakan turunan dari class Kamar. Dengan inheritance, kedua subclass dapat menggunakan atribut dan method yang berasal dari superclass Kamar, sehingga kode dapat dibuat lebih terstruktur dan mengurangi pengulangan.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/d949801d-ac52-4559-9c29-50e8d8479c1f" />

Diatas adalah dokumentasi program saat dijalankan, program menampilkan nomor kamar, harga sewa, Status, fasilitas dasar atau fasilitas tambahan tergantung dari jenis kamar.

untuk data penghuni akan menampilkan nama, no hp, alamat dan status pembayaran. Selain itu juga menampilkan pembayaran mencakup jumlah bayar, tanggal pembayaran, status pembayarn beserta penghuni yang bersangkutan.
