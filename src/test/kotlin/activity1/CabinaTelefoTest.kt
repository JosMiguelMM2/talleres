package activity1

import org.example.activity1.CabinaTelefo
import org.example.activity1.TipoLlamada
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*


class CabinaTelefoTest {

    @Test
    fun registrarLlamada() {
        val cabina = CabinaTelefo(1)
        cabina.registrarLlamada(TipoLlamada.LOCAL, 10.0)
        assertEquals(1, cabina.getTotalCalls())
        assertEquals(10.0, cabina.getTotalDuration())
        assertEquals(500.0, cabina.getTotalCost())
    }

    @Test
    fun detalleInfo() {
        val cabina = CabinaTelefo(1)
        cabina.registrarLlamada(TipoLlamada.LOCAL, 10.0)
        val expectedInfo = "Cabina numero 1: tiene un total de llamadas de 1 con un total de duracion de 10.0 y un costo total de 500.0"
        assertEquals(expectedInfo, cabina.detalleInfo())
    }

    @Test
    fun getTotalCost() {
        val cabina = CabinaTelefo(1)
        cabina.registrarLlamada(TipoLlamada.LOCAL, 10.0)
        val expectedInfo = "Cabina numero 1: tiene un total de llamadas de 1 con un total de duracion de 10.0 y un costo total de 500.0"
        assertEquals(expectedInfo, cabina.detalleInfo())
    }

    @Test
    fun getTotalDuration() {
        val cabina = CabinaTelefo(1)
        cabina.registrarLlamada(TipoLlamada.LOCAL, 10.0)
        cabina.registrarLlamada(TipoLlamada.CELULAR, 5.0)
        assertEquals(15.0, cabina.getTotalDuration())
    }

    @Test
    fun getTotalCalls() {
        val cabina = CabinaTelefo(1)
        cabina.registrarLlamada(TipoLlamada.LOCAL, 10.0)
        cabina.registrarLlamada(TipoLlamada.CELULAR, 5.0)
        assertEquals(2, cabina.getTotalCalls())
    }
}