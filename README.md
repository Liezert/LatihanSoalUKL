# Latihan Soal UKL

Nama: Intazar Lintang Pramanta
Kelas: X RPL 8
Absen: 14


## Soal  1 - Mudah

### No. 1

**Pertama, user diminta untuk memasukkan data berupa:**

- Panjang
- Lebar
- Tinggi
- Berat Barang
- Jarak Tempuh

**Lalu terdapat kondisi yang dimana jika jarak menempuh lebih dari 10km, maka harga jarak tersebut menjadi:** Rp.6.000/km.

**Dan juga terdapat kondisi yang sama, yang dimana jika volume barang tersebut (PxLxT) melebihi 100cm3, maka dikenakan biaya tambahan sebesar:** Rp.100.000

**Maka dari itu kondisi tersebut menggunakan if-else seperti di dalam kode tersebut:**

 
```java
#contoh pengukuran jarak menggunakan if-else 
if (jarak <= 10) {
    hargajarak = berat * 4250;
        } else {
            hargajarak = berat * 6000;
        }


#contoh menentukan jika volume melebihi dari 100cm3 menggunakan if-else 
if (volume >= 100) {
            System.out.println("Mendapatkan Rp.50.000 karena Volume melebihi 100 cm3");
            pajakvolume = 50000;
        }else{
            pajakvolume = 0;
        }
```

### Output:
<img src=ScreenShoot\Soal1_1.png width="70%"> 

### No. 2

**User diminta untuk memasukkan angka, lalu mendapatkan hasil Ganjil/Genap.**

**Setelah user memasukkan angka, angka yang telah di input oleh user akan di bagi habis (%) dengan angka 2, menggunakan rumus if-else karena angka 2 menjadi patokan apakah nilai tersebut Ganjil/Genap.**

**Contoh kode dalam penghitungan angka Ganjil/Genap:**

```java
if (angka % 2 == 0) {
    System.out.println("Bilangan Genap"); //Karena habis dibagi oleh angka 2
        }else {
            System.out.println("Bilangan Ganjil"); //Karena terdapat sisa dari pembagian angka 2
        }
```
### Output:
<img src=ScreenShoot\Soal1_2.png width="70%"> 

## Soal 2 - Sedang

### No.1

**User diminta untuk menginput angka faktorial, lalu program dijalankan untuk menghitung total angka faktorial tersebut.**

```
Masukkan Bilangan Faktorial anda: 5
```
**Setelah itu program mengidentifikasi angka yang telah di input, program melakukan looping sesuai dengan angka yang telah di input oleh user, lalu menghasilkan output yang berupa hasil faktorial dari nilai user.**


**Kode tersebut menggunakan looping jenis `for`, yang dimana hitungan dimulai dari 1, lalu berhenti pada nilai yang telah ditetapkan oleh user.** 

**Contoh kode sebagai berikut:**

```java
for (int i = 1; i <= angkaFaktorial; i++) {
    hasil *= i;
        }
```

### Output:
<img src=ScreenShoot\Soal2_1.png width="70%"> 

### No.2

**Terdapat program penghitungan volume tabung dan luas permukaan yang dimana user diminta untuk memasukkan:**

- Jari-jari
- Tinggi

**Setelah user input, program menghitung dengan menggunakan rumus kode:**

``` java
double Volume = phi * r * tinggi;
double LuasPermukaan = 2 * phi * rusuk * (rusuk + tinggi);
```

> [!NOTE]
> Phi dapat ditemukan di class java dengan menambahkan:
> ```java
> double phi = Math.PI;
> ```

**Diawali dengan membuat jenis variabel `double` yang bernama `Volume` & `LuasPermukaan`, berfungsi untuk menghitung total `Volume` & `LuasPermukaan` menggunakan variabel `Phi`, `Rusuk`, dan `tinggi`.**

### Output:
<img src=ScreenShoot\Soal2_2.png width="70%"> 

## Soal 3 - Sulit

### No.1

**User diminta untuk memasukkan jumlah siswa yang ada di dalam kelas, lalu User memasukkan nilai masing-masing siswa yang ada di dalam kelas**

**Menggunakan Kondisi `While` sangat cocok untuk kondisi yang dimana User dapat memasukkan nilai yang sesuai dengan input `JumlahSiswa` dari user**.

**contoh kode `While` sebagai berikut:**

```java
while (awal <= JumlahSis) {
    System.out.println("Nilai Siswa " + awal);
        nilai = input.nextInt();
        temp += nilai;
        awal++;
    }
```

**Variabel `temp` mencakup total nilai yang telah di input oleh user, oleh karena itu, hasil `temp` akan dibagi dengan `JumlahSiswa`**

```java
 double rata = temp/JumlahSis;
```

### Output:
<img src=ScreenShoot\Soal3_1.png width="70%"> 

### No.2
**User dapat menambah jumlah `kolom` dan `baris` sesuai dengan kemauan user, lalu user dapat menambahkan masing-masing nilai dalam setiap `matirks`.**

**Pertama, program akan membuat `Matriks` sesuai inputan `kolom` dan `baris` dari user, dan teradpat `MatriksA` dan `MatriksB` untuk dijumlahkan kedua matriks  tersebut, yang dimana seitap buah matriks mencakup nilai yang telah user tambahkan masing-masing.**

```java
for (int i = 0; i < baris; i++) {
    for (int j = 0; j < kolom; j++) {
        System.out.print("Matriks[" + i + "] " + "[" + j+ "] : ");
        matriksA[i][j] = input.nextInt()
    }
}
```

**Menggunakan jenis looping `For` di dalam `For` yang menglooping bagian matriks paling dalam `[j]`, lalu disusul dengan looping luar `[i]`** 
**yang menghasilkan input kode ke user sebagai berikut:**

```
---- Matriks A ----
Matriks[0] [0] :
Matriks[0] [1] : 
Matriks[1] [0] : 
Matriks[1] [1] : 
```

**Sama halnya dengan Matrks B, yang menghasilkan input kode ke user sebagai berikut:**
```
---- Matriks B ----
Matriks[0] [0] : 
Matriks[0] [1] : 
Matriks[1] [0] : 
Matriks[1] [1] : 
```

**Setelah user input masing-masing matriks yang telah di program, program akan menghitung jumlah kedua dari masing-masing `matriksA` dan `matriksB`. yang menghasilkan jumlah total angka dari kedua matriks A + B tersebut.**

```java
System.out.println("Hasil Matriks A + B ");
            for (int i1 = 0;  i1 < baris; i1++) {
                for (int j = 0; j < kolom; j++) {
                    System.out.printf("%5d", matriksHasil[i1][j]);
                }
                System.out.println();
            }
```

**yang menghasilkan output:**

```
Hasil Matriks A + B 
    2    2
    2    2
```

### Output

<img src=ScreenShoot\Soal3_2.png width="70%"> 