package otniel.kevin.abiel.coroutine

import org.junit.jupiter.api.Test
import java.util.Date
import java.util.concurrent.Executors

class ExecutorServiceTest {


    @Test
    fun testingSingleThreadPool(){
        val executorService = Executors.newSingleThreadExecutor()
        repeat(10){
            val runnable = Runnable {
                Thread.sleep(1000)
                println("Done $it ${Thread.currentThread().name} ${Date()}")
            }
            executorService.execute(runnable) // memasukkan data ke antrian runnable di dlm Executor Service
            println("Selesai memasukkan runnable $it")
        }
        println("MENUNGGU")
        Thread.sleep(11000)
        println("SELESAI")
    }

    // Untuk menjalankan multiple thread pada kotlin
    // n atau jumlah thread yg akan dijalankan sebainya dipertimbangkan berdasarkan spesifikasi hardware
    @Test
    fun testFixhTreadPool(){
        val executorService = Executors.newFixedThreadPool(3)
        repeat(10){
            val runnable = Runnable {
                Thread.sleep(1000)
                println("Done $it ${Thread.currentThread().name} ${Date()}")
            }
            executorService.execute(runnable) // memasukkan data ke antrian runnable di dlm Executor Service
            println("Selesai memasukkan runnable $it")
        }
        println("MENUNGGU")
        Thread.sleep(11000)
        println("SELESAI")
    }

    // Tidak terbatas dan menyesuaikan jumlah thread yang ada di antrian
    @Test
    fun testCacheThreadPool(){
        val executorService = Executors.newCachedThreadPool()
        repeat(10){
            val runnable = Runnable {
                Thread.sleep(1000)
                println("Done $it ${Thread.currentThread().name} ${Date()}")
            }
            executorService.execute(runnable) // memasukkan data ke antrian runnable di dlm Executor Service
            println("Selesai memasukkan runnable $it")
        }
        println("MENUNGGU")
        Thread.sleep(11000)
        println("SELESAI")
    }

}