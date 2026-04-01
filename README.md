# PASD_Jobshet-5_Shorting

Pertanyaan dan Jawaban 5.2 Praktikum 1
1. Jelaskan fungsi kode program berikut
    if (data[j-1]>data[j]){ 
        temp=data[j]; 
        data[j]=data[j-1]; 
        data[j-1]=temp;
    }
Jawaban: Fungsi kode program tersebut adalah untuk mengurutkan data angka dari kecil ke besar menggunakan algoritma sorting (seperti bubble sort, selection sort, atau insertion sort). Selain itu,juga digunakan untuk menampilkan data sebelum dan sesudah diurutkan supaya kita bisa melihat perubahannya.

2. Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada selection sort!
Jawaban: Bagian yang digunakan untuk mencari nilai minimum adalah:
if (data[j] < data[min]) {
    min = j;
}
Kode ini berfungsi untuk membandingkan data, lalu mencari nilai yang paling kecil dalam array, kemudian menyimpan posisi (index) nilai terkecil tersebut.

3.Pada Insertion sort , jelaskan maksud dari kondisi pada perulangan
while (j>=0 && data[j]>temp)
Jawaban: Artinya selama data di sebelah kiri lebih besar dari data yang sedang dibandingkan (temp), maka data tersebut akan digeser ke kanan.

4. Pada Insertion sort, apakah tujuan dari perintah data[j + 1] = temp;
Jawaban:Perintah tersebut berfungsi untuk Menempatkan nilai (temp) ke posisi yang benar setelah proses pergeseran selesai.

Pertanyaan dan Jawaban 5.3 Praktikum 2

1. 1.	Perhatikan perulangan di dalam bubbleSort() di bawah ini:
for (int i=0; i<listMhs.length-1; i++){
    for (int j=1; j < listMhs.lenght-i; j++){

    }
}
a.Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ?
Jawaban:Karena dalam bubble sort, setiap perulangan akan menempatkan satu data pada posisi yang benar (biasanya di bagian akhir). Jadi jika ada n data, cukup dilakukan n-1 kali perulangan saja. Elemen terakhir tidak perlu dicek lagi karena sudah pasti berada di posisi yang benar.
b.Mengapa syarat dari perulangan j adalah j<listMhs.length-i ?
Jawaban:Karena setiap perulangan i, bagian belakang array sudah dalam keadaan terurut. Jadi tidak perlu dibandingkan lagi. Dengan begitu, program jadi lebih efisien karena tidak melakukan pengecekan yang tidak perlu.
c.Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i  akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?
Jawaban:Jika jumlah data 50, maka:
Perulangan i berlangsung sebanyak 49 kali
Tahap bubble sort juga sebanyak 49 tahap
Karena rumusnya adalah n - 1 → 50 - 1 = 49
2.	Modifikasi program diatas dimana data mahasiswa bersifat dinamis (input dari keyborad) yang terdiri dari nim, nama, kelas, dan ipk!

5.3.7 Pertanyaan
Pertanyaan: Di dalam method selection sort, terdapat baris program seperti di bawah ini:
int idxMin = i;
for (int j = i + 1; j < listMhs.length; j++) {
    if (listMhs[j].ipk < listMhs[idxMin].ipk) {
        idxMin = j;
    }
}
Untuk apakah proses tersebut, jelaskan!
Jawaban: Untuk mengubah insertion sort menjadi descending (urut dari besar ke kecil),hanya perlu mengubah kondisi perbandingan pada perulangan while.