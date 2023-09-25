package otniel.kevin.abiel.coroutine

import org.junit.jupiter.api.Test
import java.util.concurrent.Callable
import java.util.concurrent.Executors
import java.util.concurrent.Future
import kotlin.system.measureTimeMillis

class FutureTest {

    val executorService = Executors.newFixedThreadPool(10)

    fun getFoo(): Int{
        Thread.sleep(5000)
        return 10

    }

    fun getBar(): Int {
        Thread.sleep(5000)
        return 10
    }

    @Test
    fun testNonParalel() {
        val time = measureTimeMillis {
            val foo = getFoo()
            val bar = getBar()
            val result = foo + bar
            println(result)
        }
        println("Total time: $time")
    }

    @Test
    fun testFutureGet() {
        val time = measureTimeMillis {
            // Ini akan membuat masing" function di eksekusi secara paralel sehingga tidak menunggu selama 2 detik
            val foo: Future<Int> = executorService.submit(Callable { getFoo() })
            val bar: Future<Int> = executorService.submit(Callable { getBar() })

            // untuk mendapatkan value dari masing" Callable menggunakan .get()
            val total = foo.get() + bar.get()
            println("Total: $total")
        }
        println("Time: $time")
    }
}