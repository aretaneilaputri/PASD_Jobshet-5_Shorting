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