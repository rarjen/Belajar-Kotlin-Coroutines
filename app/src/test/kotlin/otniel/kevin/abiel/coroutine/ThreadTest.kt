package otniel.kevin.abiel.coroutine

import org.junit.jupiter.api.Test
import java.util.Date
import kotlin.concurrent.thread

class ThreadTest {

    @Test
     fun testThreadName() {
        val threadName = Thread.currentThread().name
        println("Running in thread $threadName")
    }

    // Membuat Thread
    @Test
    fun testNewThread(){

        // Ini contoh thread di java
//        val runnable = Runnable {
//            println(Date())
//            Thread.sleep(2000)
//            println("Finish: ${Date()}")
//        }

        // Untuk melakukan running runnable
//        val thread = Thread(runnable)
//        thread.start() //untuk menjalankan thread


        // Ini contoh thread di kotlin (Helper function di kotlin)
        thread(start = true) { //default start = true
            println(Date())
            Thread.sleep(2000)
            println("Finish: ${Date()}")
        }

        println("MEUNGGU SELESAI")
        Thread.sleep(3000) //Membuat thread menunggu 3 dtk agar runnable dijalankan
        println("SELESAI")
    }


    // Multiple Thread
    @Test
    fun testMultipleThread(){
        val thread1 = Thread(Runnable {
            println(Date())
            Thread.sleep(2000)
            println("Finish Thread 1: ${Thread.currentThread().name} : ${Date()}")
        })

        val thread2 = Thread(Runnable {
            println(Date())
            Thread.sleep(2000)
            println("Finish Thread 2: ${Thread.currentThread().name} : ${Date()}")
        })

        thread1.start()
        thread2.start()
        println("MENUNGGU SELESAI")
        Thread.sleep(3000)
        println("SELESAI")
    }
}