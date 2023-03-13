import java.lang.Exception
import javax.swing.text.Utilities
import kotlin.math.*
import kotlin.time.Duration.Companion.hours

fun main() {
    nullSafety()
}

fun nullSafety() {
    var s: String? = null

    //O ? significa que pode ser nula
    // Já o !! significa que você tem certeza que a variavel não será nula

    println(s?.length)

    try {
        println(s!!.length)
        //como a variavel é nula vai para o catch
    } catch (e: NullPointerException) {
        println("Variavel nulla")
    } catch (e: Exception) {
        println("Util para evitar erros, é muito util, mas deve ser deixada na ultima opção")
    } finally {
        println("Sou muito util para fechar conexões com o bd")
    }
}


fun exerciciosTreinoIf(cargo: String) {
    when (cargo) {
        "Gerente" -> {
            println("O salário de um $cargo é: R$ 2000,00")
        }

        "Coordenador" -> {
            println("O salário de um $cargo é: R$ 1500,00")
        }

        "Engenheiros" -> {
            println("O salário de um $cargo é: R$ 1000,00")
        }

        else -> {
            println("O salário de um $cargo é: R$ 500,00")
        }
    }
}

fun exerciciosTreinoIf2(cargo: String, tempoExperiencia: Int) {
    if (cargo == "Gerente" && tempoExperiencia <= 2) {
        return println("O salário de um $cargo é: R$ 2000,00")
    } else {
        return println("O salário de um $cargo é: R$ 3000,00")
    }
    if (cargo == "Coordenador" && tempoExperiencia <= 1) {
        return println("O salário de um $cargo é: R$ 1500,00")
    } else {
        return println("O salário de um $cargo é: R$ 1800,00")
    }
    if (cargo == "Engenheiros") {
        return println("O salário de um $cargo é: R$ 1000,00")
    }
    if (cargo == "Estagiario") {
        return println("O salário de um $cargo é: R$ 500,00")
    }
}


fun numeroEntre(numero: Int) {
    if (numero in 1..25) {
        println("Pertence")
    } else {
        println("Não pertence")
    }
}

fun exercicioFuncao1(ano: Int) {

    println("$ano anos equivalem a:")
    println("${ano * 12} meses")
    println("${ano * 365} dias")
    println("${ano * 24 * 365} horas")
    println("${ano * 24 * 365 * 60} minutos")
    println("${ano * 24 * 365 * 60 * 60} segundos")
}

fun exercicioFuncao2(string: String) = println("A String tem ${string.length} caracteres")


fun exercicioFuncao3(numero: Int) = numero.toDouble().pow(3.0)

fun exercicioFuncao4(milhas: Float) = milhas * 1.6F

fun exercicioFuncao5(texto: String): String {
    var textoFormatado: String = texto.replace("A", "x")
    textoFormatado = textoFormatado.replace("a", "x")

    return textoFormatado
}

fun propriedadesMath() {
    println(max(2, 40))
    println(min(2, 40))
    println(sqrt(200f))
    println(PI)
    println(E)
    println(round(3.21321312F))
}


fun propriedadesString() {
    var string: String = "Meu nome é Antony"
    println("Posição 0 da string ${string[0]}")
    //começa e termina com:
    println(string.startsWith("Meu"))
    println(string.endsWith("oni"))

    //Pega o que está escrito entre essas 2 posições
    println(string.substring(2, 4))
    println(string.substringBefore("nome"))

    //retira os espaços antes e depois do texto
    string = "    Meu nome é Antony    "
    println(string.trim())
}


fun helloWorld() = println("Hello world")

fun soma(a: Int, b: Int): Int {

    return a + b
}

fun somaUmaLinha(a: Int, b: Int): Int = (a + b)

fun calcularIdade(idadeNascimento: Int): Int {
    var idade: Int = 0;

    idade = 2023 - idadeNascimento;

    return idade;
}

fun acessoDeVariaveis() {
    val nome = "Antony"
    val sobrenome = "Bresolin"

    println("Olá, " + nome + " " + sobrenome)
    println("Olá, $nome $sobrenome")

    //indicação de inicio e final da variavel quando houver uma propriedade { }
    println("Double: ${Double.MAX_VALUE}")
    println("Seu nome possui ${nome.length} letras")
}

fun comentario() {
    println("Hello world");
    println("teste 2")
    /**
     * sdasdsa
     */
    //teste
}

fun variaveis() {
    var nome = "Antony"
    var nome2: String = "Henrique"
    var idade: Int = 21
    var double: Double = 10.0
    var float: Float = 10f
    var long: Long = 10L

    println(nome + " " + nome2)
    println(idade)

    //unsigned variaveis
    //não pode ser negativo

    val centimentros: UInt = 10u
    val testeLong: ULong = 10u

}

fun constantesVariaveis() {
    var nome = "Tony"
    nome = "Antony"

    var ano: Int
    ano = 23

    //Constante
    val nomeCompleto = "Antony Herique Bresolin"
}

fun exercicioTreino() {
    var nomeCompleto = "Antony Henrique Bresolin"
    var texto: String
    var calcado: Byte
    val pibBrasil: Long = 1869000000000
    val populacaoBrasil: Int = 211000000

    println("${pibBrasil / populacaoBrasil}")

}

