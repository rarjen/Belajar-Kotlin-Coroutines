package otniel.kevin.abiel.coroutine

/**
 * Callable
 *
 * Sebelumnya kita sudah tau, bahwa Thread akan mengeksekusi isi method run yang ada di interface Runnable, hanya saja masalahnya, return value dari Runnable adalah void (unit), artinya tidak mengembalikan data
 * Jika kita ingin mengeksekusi sebuah kode yang mengembalikan data, kita bisa menggunakan interface Callable, dimana terdapat method call dan return value nya adalah generic
 * Kita bisa menggunakan ExecutorService.submit(callable) untuk mengeksekusi Callable, dan hasilnya adalah sebuah Future<T>
 *
 */

/**
 * Future
 *
 * Future merupakan return value untuk eksekusi Callable
 * Dengan Future, kita bisa mengecek status apakah proses telah selesai, atau bisa mendapatkan data hasil return callable, atau bahkan membatalkan proses callable yang sedang berjalan
 *
 */