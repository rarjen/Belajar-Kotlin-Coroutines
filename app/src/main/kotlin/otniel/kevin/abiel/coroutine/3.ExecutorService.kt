package otniel.kevin.abiel.coroutine

/**
 * Masalah Dengan Thread
 *
 * Thread adalah object yang lumayan berat, sekitar 512kb - 1MB, sehingga jika terlalu banyak membuat Thread, penggunaan memory di aplikasi kita akan membengkak
 * Sehingga penggunaan Thread secara manual sangat tidak disarankan
 * Thread sendiri sebenernya bisa digunakan ulang jika proses sudah selesai dilakukan
 */

/**
 * Executor Service
 *
 * ExecutorService adalah fitur di JVM yang bisa digunakan untuk manajemen Thread.
 * Penggunakan ExecutorService lebih direkomendasikan dibandingkan menggunakan Thread secara manual
 * ExecutorService adalah sebuah interface, untuk membuat objectnya, kita bisa menggunakan class Executors, terdapat banyak helper method di class Executors.
 *
 */

/**
 * Executors Method
 * newSingleThreadExecutor -> Membuat ExecutorService dengan 1 thread
 * newFixedThreadPool(int) -> Membuat ExecutorService dengan n thread
 * newCachedThreadPool() -> Membuat ExecutorService dengan thread akan meningkat sesuai kebutuhan
 */

/**
 * Threadpool
 *
 * Implementasi ExecutorService yang terdapat di class Executors adalah class ThreadPoolExecutor
 * Di dalam ThreadPool, terdapat data queue (antrian) tempat menyimpan semua proses sebelum di eksekusi oleh Thread yang tersedia di ThreadPool
 * Hal ini jadi kita bisa mengeksekusi sebanyak-banyaknya Runnable walaupun Thread tidak cukup untuk mengeksekusi semua Runnable
 * Runnable yang tidak dieksekusi akan menunggu di queue sampai Thread sudah selesai mengeksekusi Runnable yang lain
 *
 */