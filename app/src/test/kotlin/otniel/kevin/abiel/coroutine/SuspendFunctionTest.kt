package otniel.kevin.abiel.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import java.util.Date
import kotlin.time.measureTime

class SuspendFunctionTest {

    @Test
    fun tesSuspend(){
        // runBlocking hanya contoh saja penggunaan suspend saja pada meteri ini, di dunia asli tidak boleh dipake
        runBlocking {
            helloWorld()
        }
    }

    suspend fun helloWorld() {
        val time = measureTime {
            println("Hello World: ${Date()}")
            delay(2000)
            println("Hello World: ${Date()}")
        }
        println("total time: $time")
    }
}