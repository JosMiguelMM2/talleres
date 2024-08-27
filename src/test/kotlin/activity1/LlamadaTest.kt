package activity1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.example.activity1.Llamada
import org.example.activity1.TipoLlamada
import org.mockito.Mockito.*


class LlamadaTest {

    @Test
    fun costo() {
        val llamadaLocal = Llamada(TipoLlamada.LOCAL, 10.0)
        assertEquals(500.0, llamadaLocal.costo())

        val llamadaLargaDistancia = Llamada(TipoLlamada.LARGADISTANCIA, 5.0)
        assertEquals(1750.0, llamadaLargaDistancia.costo())

        val llamadaCelular = Llamada(TipoLlamada.CELULAR, 20.0)
        assertEquals(3000.0, llamadaCelular.costo())
    }

    @Test
    fun getDuracion() {
        val llamadaMock=mock(Llamada::class.java)
        `when`(llamadaMock.duracion).thenReturn(15.0)
        assertEquals(15.0, llamadaMock.duracion)
        verify(llamadaMock).duracion
    }
}