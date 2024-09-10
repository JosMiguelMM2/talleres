package org.example.Clases

const val COSTO_INTERNET = 700000
const val COSTO_RADIO = 200000
const val COSTO_TV = 600000

data class Candidato(
    val nombre: String,
    var votosInternet: Int = 0,
    var votosRadio: Int = 0,
    var votosTV: Int = 0
) {
    fun totalVotos() = votosInternet + votosRadio + votosTV

    fun costoCampania() = (votosInternet * COSTO_INTERNET) +
            (votosRadio * COSTO_RADIO) + (votosTV * COSTO_TV)
}

