enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    val user1 = Usuario()
    val user2 = Usuario()
    
    val kotlinLanguage = ConteudoEducacional("Kotlin", 60)
    val android = ConteudoEducacional("android", 60)
    val spring = ConteudoEducacional("spring", 60)
    
    val formacaoMobile = Formacao("Mobile developer", listOf(kotlinLanguage, android))
    val formacaoBackend = Formacao("BackEnd", listOf(kotlinLanguage, spring))
    
    println(formacaoMobile)
	println(formacaoBackend)
    
}