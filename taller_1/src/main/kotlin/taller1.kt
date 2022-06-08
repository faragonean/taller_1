import java.time.LocalDateTime

fun main() {
    println("hola world")
}

/*
Actividad 1. Traducción de ecuaciones
*/

// a)
// var s = Math.sqrt(Math.pow(X-m, 2.0)/(n-1))

// b)
// var P = -(Math.pow(y, 3.0) - 1)/((y+1)-Math.sqrt(y + 1))

// c)
// var Z = x * Math.pow(Math.pow(x, 2.0) + 1, 3.0) / (Math.sqrt(2 * x) + 1)

// d)
// var T = 1 - (Math.pow(x - 2, 1 / n) / Math.pow(x, 3.0))

// e)
// var s = (x != y) && (x <= y)

// f)
// var s = (a >= b * c) || (b <= c)

/*
Actividad 2. Evaluacion expresiones aritmeticas
*/

/*

a) 30+8*3/6-4%6
    30+24/6-4%6
    30+4-4%6
    30+4-4
    34-4
    30

b) 30.0 / 20.0 - 2.5 * 3.0
    30.0 / 20.0 - 2.5 * 3.0
    30.0 / 20.0 - 7.5
    30.0 / 20.0 - 7.5
    1.5-7.5
    -6.0

c) 8/4/2*6
    8/4/2*6
    8/4/12
    2/12
    0.17
*/

/*
Actividad 3. Solucion de problemas
*/

/*
a) Realice una función que halle el área de un triángulo.

Entradas:
    base -> Double
    altura -> Double
Salidas:
    area --> Double
 */
fun area_triangulo(base: Double, altura: Double): Double {
    val area = base * altura / 2
    return area
}

/*
b) Si alquilar una bicicleta tiene cierto valor y puede transportar dos personas, determine cuántas bicicletas
necesito y cuánto dinero voy a gastar en alquilarlas, para transportar a todos los estudiantes de la universidad.

Entradas:
    costo_bici -> Double
    numero_estudiantes -> Int
Salidas:
    numero_bicis -> Int
    costo_total -> Double
 */
fun alquilerBiciletas(numero_estudiantes: Int, costo_bici: Double): Pair<Int, Double> {
    val numero_bicis = numero_estudiantes / 2
    val costo_total = numero_bicis * costo_bici
    return Pair(numero_bicis, costo_total)

}

/*
c) Según el DANE, el número de desempleados corresponde al 8.15% de la población activa. Escriba una función que
permita determinar cuántas personas desempleadas hay actualmente en Colombia.

Entradas:
    poblacion -> Int
Salidas:
    desempleados -> Int
 */
fun calculo_desempleados(poblacion: Int) : Int {
    val desempleados = (poblacion * 0.0815).toInt()
    return desempleados
}

/*
d) Se desea determinar cuántos dólares se puede adquirir con cierta cantidad de pesos colombianos.

Entradas:
    pesos_colombiano -> Double
    taza_cambio -> Double
Salidas:
    dollar -> Double
 */
fun cambio_dolares(pesos_colombiano: Double, taza_cambio: Double) : Double {
    val dollar = pesos_colombiano / taza_cambio
    return dollar
}

/*
e) Una empresa que contrata personal requiere determinar la edad de las personas que solicitan trabajo, pero cuando
se les realiza la entrevista sólo se les pregunta el año en que nacieron. Realice el algoritmo para solucionar este problema.

Entradas:
    ano_nacimiento -> Int
Salidas:
    edad -> Int
 */

fun calculo_edad(ano_nacimiento: Int) : Int {
    val edad = LocalDateTime.now().year - ano_nacimiento
    return edad
}

/*
f) Un estacionamiento requiere determinar el cobro que debe aplicar a las personas que lo utilizan. Considere que
el cobro es con base en las horas que lo disponen y que las fracciones de hora se toman como completas yrealice una
función que permita determinar el cobro.

Entradas:
    tiempo -> Double
    costo_hora -> Double
Salidas:
    costo --> Double
 */

fun cobro_estacionamiento(tiempo: Double, costo_hora: Double) : Double {
    val costo = Math.ceil(tiempo) * costo_hora
    return costo
}

/*
g) Pinturas “La brocha gorda” requiere determinar cuánto cobrar por trabajos de pintura. Considere que se cobra
por m2 y realice una funciòn que le permita saber cuánto cobrar a un cliente.

Entradas:
    area ->
    costo_m2 -> Double
Salidas:
    costo -> Double
 */
fun calculo_costo_pintura(area: Double, costo_m2: Double) : Double {
    val costo = area * costo_m2
    return costo
}

/*
h) Se requiere determinar el tiempo que tarda una persona en llegar de una ciudad a otra en bicicleta, considerando
que lleva una velocidad constante. Realice una función para tal fin.

Entradas:
    velocidad -> Double
    distancia -> Double
Salidas:
    tiempo -> Double
 */
fun tiempo_persona(velocidad: Double, distancia: Double) : Double {
    val tiempo = distancia / velocidad
    return tiempo
}

/*
i) Realice un algoritmo para determinar cuánto pagará finalmente una persona por un artículo equis, considerando que
tiene un descuento de 5%, y debe pagar 19% de IVA (debe retornar el precio con descuento y el precio final).

Entradas:
    precio_articulo -> Double
Salidas:
    precio_descuento -> Double
    precio_final -> Double
 */

fun calculo_precio_articulo(precio_articulo: Double): Pair<Double, Double> {
    var precio_descuento = 0.95 * precio_articulo
    val precio_final = 1.19 * precio_descuento
    return Pair(precio_descuento, precio_final)
}

/*
j) Realice una función para determinar la nota final que obtendrá un alumno considerando que realiza tres exámenes,
de los cuales el primero y el segundo tienen una ponderación de 25%, mientras que el tercero de 50%.

Entradas:
    nota_examen1 -> Double
    nota_examen2 -> Double
    nota_examen3 -> Double
Salidas:
    nota_final -> Double
 */
fun calculo_nota_final(nota_examen1: Double, nota_examen2: Double, nota_examen3: Double) : Double {
    val nota_final = 0.25 * nota_examen1 + 0.25 * nota_examen2 + 0.5 * nota_examen3
    return nota_final
}

/*
k) Se tiene el nombre y la edad de tres personas. Se desea saber el nombre y la edad de la persona de menor edad.

Entradas:
    persona1 -> Persona
    persona2 -> Persona
    persona3 -> Persona
Salidas:
    nombre -> Persona.nombre
    edad -> Persona.edad
 */

class Persona {
    var nombre: String
    var edad: Int

    constructor(nombre: String, edad: Int) {
        this.nombre = nombre
        this.edad = edad
    }
}

fun calculo_persona_menor(persona1: Persona, persona2: Persona, persona3: Persona): Persona? {
    val listadoPersonas: List<Persona> = listOf(persona1, persona2, persona3)
    val persona_menor = listadoPersonas.minByOrNull{ it.edad }
    return persona_menor
}

/*
l) El presidente de la república ha decidido estimular a todos los estudiantes de una universidad mediante la
asignación de becas mensuales, para esto se tomarán en consideración los siguientes criterios: Para alumnos mayores de
18 años con promedio mayor o igual a 90, la beca será de $2000.00; con promedio mayor o igual a 75, de$1000.00; para los
promedios menores de 75 pero mayores o iguales a 60, de $500.00; a los demás se les enviará una carta de invitación
incitándolos a que estudien más en el próximo ciclo escolar. A los alumnos de 18 años o menores de esta edad, con promedios
mayores o iguales a 90, se les dará $3000; con promedios menores a 90 pero mayores o iguales a 80, $2000; para los alumnos
con promedios menores a 80 pero mayores o iguales a 60, se les dará $100, y a los alumnos que tengan promedios menores a 60
se les enviará carta de invitación. Realice la función correspondiente.

Entradas:
    edad -> Int
    promedio -> Double
Salidas:
    valor_beca -> Double
 */

fun calculo_valor_beca(edad: Int, promedio: Double): Double {
     if (edad > 18) {
         return valor_beca_mayor(promedio)
     } else {
         return valor_beca_menor(promedio)
     }
}

fun valor_beca_mayor(promedio: Double): Double {
    if (promedio >= 90) return 2000.00
    else if (promedio >= 75) return 1000.00
    else if (promedio < 75 && promedio >= 60) return 500.00
    return 0.0
}

fun valor_beca_menor(promedio: Double): Double {
    if (promedio >= 90) return 3000.00
    else if (promedio < 90 && promedio >= 80) return 2000.00
    else if (promedio < 80 && promedio >= 60) return 100.00
    return 0.0
}

/*
m) Escriba una función que halle el volumen de un cono.

Entradas:
    radio -> Double
    altura -> Double
Salidas:
    volumen -> Double
 */

fun volumen_cono(radio: Double, altura: Double): Double {
    val volumen = altura * Math.PI * Math.pow(radio, 2.0) / 3
    return volumen
}

/*
n) En la universidad vamos a conectar los diversos computadores que hay en una sala de cómputo con cables. Se necesita
un cable para conectar dos computadores, y debe haber conexión entre todos los computadores. Escriba una función que determine
el número de cables a comprar a partir del número de computadores que hay en la sala.

Entradas:
    numero_computadores -> Int
Salidas:
    total_cables -> Int
 */
fun calculo_conexion_pc(numero_computadores: Double): Double {
    val total_cables = numero_computadores / 2
    return total_cables
}

/*
o) Se sabe que una batería de celular contamina 175 litros de agua. ¿Cuántos litros de agua serán contaminados por
la población de una ciudad en un año si cada persona utiliza 2 baterías al semestre?

Entradas:
    poblacion --> Int
Salidas:
    agua_total --> Double
 */
fun calculo_agua_contaminada(poblacion: Int) : Double {
    val baterias = poblacion * 2 * 2
    val agua_total = baterias * 175.0
    return agua_total
}

/*
p) Mi proveedor de Internet me asegura que mi conexión es de 4 megabytes por segundo. Escriba una función que permita
determinar cuántos minutos y segundos debo esperar para descargar la última película de La Mujer Maravilla.

Entradas:
    peso_pelicula --> Double en MB
Salidas:
    tiempo_segundos -> Double
    tiempo_minutos -> Double
 */
fun calculo_tiempo_descarga(peso_pelicula: Double) : Pair<Double, Double> {
    val tiempo_segundos = peso_pelicula / 4.0
    val tiempo_minutos = tiempo_segundos / 60
    return Pair(tiempo_segundos, tiempo_minutos)
}

/*
q) El valor presente de un cierto capital de dinero a una tasa de interés t durante n años se encuentra a partir de la fórmula:
  VP = C / (1 + t)^n
Escriba una función que determine el valor presente a partir de los datos de entrada dados.

Entradas:
    capital -> Double
    tiempo -> Double
    tasa_interes -> Double
Salidas:
    valor_presente -> Double
 */
fun valor_presente(capital: Double, tiempo: Double, tasa_interes: Double) : Double {
    val valor_presente = capital / Math.pow(1 + tasa_interes, tiempo)
    return valor_presente
}