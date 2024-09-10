package org.example.Clases

class Elecciones {
    private val candidatos =
        mutableListOf<Candidato>()
    private var totalVotos = 0


    fun agregarCandidato(nombre: String) {
        candidatos.add(Candidato(nombre))
    }

    fun getCandidatos(): List<Candidato>{
        return candidatos
    }

    fun votar(candidato: Candidato, medio: String) {
        when (medio) {
            "internet" -> candidato.votosInternet++
            "radio" -> candidato.votosRadio++
            "tv" -> candidato.votosTV++
            else -> println("Medio de votación inválido")
        }
    }

    fun vaciarUrnas() {
        candidatos.forEach {
            it.votosInternet = 0
            it.votosRadio = 0
            it.votosTV = 0
        }
    }

    fun totalVotos(): Int {
        return candidatos.sumOf { it.totalVotos() }
    }

    fun porcentajeVotos(candidato: Candidato): Double {
        val total = totalVotos()
        return if (total > 0) (candidato.totalVotos().toDouble() / total) * 100 else 0.0
    }

    fun costoPromedioCampania(): Double {
        return if (totalVotos() > 0) candidatos.sumOf { it.costoCampania() }.toDouble() / candidatos.size else 0.0
    }

    fun ganador(): Candidato? {
        return candidatos.maxByOrNull { it.totalVotos() }
    }
}
