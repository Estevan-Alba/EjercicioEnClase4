package com.example.ejercicioenclase4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.ActivityResult

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun main() {

    metodoLista()
}

const val impConsumo = 0.08

fun metodoLista() {
/*
    println("----------------------Listas normales------------------------- \n")
    val listaProductos = listOf("Azucar", "Pan", "Huevo", "Leche", "Carne", "sal")
    println(listaProductos)

    println("----------------------Listas para asignar------------------------- \n")
    val listaProductos2: List<String> = listOf("Azucar", "Pan", "Huevos", "Leche", "Carne", "sal")
    println(listaProductos2)


    println("----------------------Recorrer las listas------------------------- \n")
    for (producto in listaProductos) {
        println("Su compra tiene $producto")
    }

    println("----------------------Recorrer las listas con foreach------------------------- \n")

    listaProductos.forEach() { listaProductos ->
        println("Cada producto $listaProductos")
    }

    println("----------------------Lista por caaracteres------------------------- \n")
    val listaCaracteres: List<Int> = listaProductos.map { producto -> producto.length }
    println(listaCaracteres)

    println("----------------------Lista por filtro------------------------- \n")
    val listaConFiltro1 = listaCaracteres.filter { listaCaracteres -> listaCaracteres > 3 }

    println(listaConFiltro1)

    val listaConFiltro2 = listaCaracteres.filter { listaCaracteres -> listaCaracteres < 4 }

    println(listaConFiltro2)

    println("----------------------Lista como vector------------------------- \n")

    data class alumno(val nombre: String, val apellido: String)

    val nombreCompleto = listOf(
        alumno("Julian", "Alba"),
        alumno("Sergio", "Cotrino"),
        alumno("Raul", "Vacas"),
        alumno("Diego", "Vargas")
    )

    println(nombreCompleto.map { it.nombre })

    println(nombreCompleto.map { it.apellido })

    println(nombreCompleto.map { it.nombre + " " + it.apellido })

    println("----------------------Ejercicio con lista para filtrar------------------------- \n")

    val listaEjercicio: List<Int> = listOf(1, 2, 3, 4, 5, 6, 10, 12, 17, 21, 35, 40, 48, 50)


    val listaConFiltro3 = listaEjercicio.filter { listaEjercicio -> listaEjercicio > 40 }

    println(listaConFiltro3)

    val listaConFiltro4 = listaEjercicio.filter { listaEjercicio -> listaEjercicio < 40 }

    println(listaConFiltro4)

    val listaConFiltro5 = listaEjercicio.filter { listaEjercicio -> listaEjercicio % 2 == 0 }

    println(listaConFiltro5)

    val listaConFiltro6 = listaEjercicio.filter { listaEjercicio -> listaEjercicio % 2 != 0 }

    println(listaConFiltro6)

    val listaConFiltro7 = listaEjercicio.filter { listaEjercicio -> listaEjercicio % 5 == 0 }

    println(listaConFiltro7)


    println("----------------------Ejercicio con mapeo------------------------- \n")



    val factura = listOf(
        "Dtergente" to 1000,
        "varsol" to 500,
        "Limpiapisos" to 300,
        "Jabon En barra" to 150,
        "Suavizante" to 100,
        "Desinfectante" to 200,
        "Esponjilla" to 50,
        "Crema de deintes" to 1500,
        "Papel higienico" to 10000
    )

    var resultado = factura.filter{ (nombre,precio) -> precio > 1000}

    resultado = factura.filter{(nombre,precio) -> nombre.startsWith("H")}

    resultado = factura.filter{(nombre,precio) -> nombre.startsWith("S") && precio > 90}

    resultado = factura.filter{(nombre,precio) -> precio > precio*impConsumo}

    println(resultado)


    println("----------------------Ejercicio con listas mutables------------------------- \n")

    val listaMutable = mutableListOf<String>()

    listaMutable.add("Julian")
    listaMutable.add("Estevan")
    listaMutable.add("Alba")
    listaMutable.add("Fresno")

    println(listaMutable)

    var listaValor = listaMutable.get(0)
    println(listaValor)


    val listaNumeros = mutableListOf<Int>()

    listaNumeros.add(3)
    listaNumeros.add(5)
    listaNumeros.add(8)
    listaNumeros.add(10)


    println(listaNumeros)

    println("----------------------Ejercicio con listas mutables en clase------------------------- \n")

    var multiplicar = listaNumeros[0]

    var operacion = multiplicar * 3

    println("La multiplicacion es: $operacion")

    multiplicar = listaNumeros[1]

    operacion = multiplicar * 5 +10-11+2

    println("La multiplicacion es: $operacion")

    multiplicar = listaNumeros[2]

    operacion = (multiplicar/2)*7

    println("La multiplicacion es: $operacion")

    multiplicar = listaNumeros[3]

    operacion = (multiplicar/5)*256



    println("La multiplicacion es: $operacion")

    println("----------------------Ejercicio con listas mutables en clase para saber longitud------------------------- \n")

    listaValor = listaMutable.get(3).length.toString()

    println("La longitud es: $listaValor")

    println("----------------------Ejercicio con listas mutables en clase con excetions------------------------- \n")

    try {
        listaNumeros.add(readln().toString().toInt())
        println(listaNumeros)
    }catch (e: Exception){
        println("Solo puede digitar numeros, nada de letras")
    }

    println("----------------------Ejercicio con listas mutables en clase con fucion------------------------- \n")

    val primeroA = listaNumeros.first()

    val primeroB = listaMutable.first()

    val ultimoA = listaNumeros.last()

    val ultimoB = listaMutable.last()

    println(primeroA)
    println(primeroB)
    println(ultimoA)
    println(ultimoB)

    println("----------------------Ejercicio con listas mutables en clase para borrar ------------------------- \n")

    val removerC = listaMutable.removeAt(2)

    println(listaMutable)

    println("----------------------Ejercicio con listas mutables en clase para nueva lista ------------------------- \n")


    val listaAlmacen = mutableListOf<String>()

    listaAlmacen.add("sal")
    listaAlmacen.add("Azucar")
    listaAlmacen.add("Pan")
    listaAlmacen.add("Carne")
    listaAlmacen.add("Pescado")
    listaAlmacen.add("Huevos")
    listaAlmacen.add("Leche")
    listaAlmacen.add("Leche")

    val listaPrecios = mutableListOf<Int>()

    listaPrecios.add(1000)
    listaPrecios.add(2500)
    listaPrecios.add(3500)
    listaPrecios.add(15000)
    listaPrecios.add(12000)
    listaPrecios.add(18000)
    listaPrecios.add(4000)
    listaPrecios.add(50000)


    val listaImpuesto = mutableListOf<Double>()

    listaImpuesto.add(0.19)
    listaImpuesto.add(0.08)

    listaImpuesto.add(readln().toString().toDouble())


    println("Tabla")



    val producto1 = (listaPrecios.get(3)* 3)
    val producto2 = (listaPrecios.get(6)* 5)
    val producto3 = (listaPrecios.get(0)* 1)
    val producto4 = (listaPrecios.get(7)* 2 + 100)
    val producto5 = (listaPrecios.get(5)* 5 + listaPrecios[4])
    val producto6 = (listaPrecios.get(2)* 10 - listaPrecios[0])
    val producto7 = (listaPrecios.get(1)* 9 - listaPrecios[5])
    val producto8 = (listaPrecios.get(7)* 1)


    val impuesto1 = (producto1*listaImpuesto[0]).toDouble().toInt()
    val impuesto2 = (producto2*(listaImpuesto[0]*listaImpuesto[1])).toDouble().toInt()
    val impuesto3 = (producto3*listaImpuesto[2]).toDouble().toInt()
    val impuesto4 = (producto4 * listaImpuesto[2]).toDouble().toInt()
    val impuesto5 = (producto5 * listaImpuesto[1]).toDouble().toInt()
    val impuesto6 = (producto6 * (listaImpuesto[0]+listaImpuesto[2])).toDouble().toInt()
    val impuesto7 = (producto7 * listaImpuesto[2]).toDouble().toInt()
    val impuesto8 = (producto8 * listaImpuesto[0]).toDouble().toInt()


    println("Productos"+" | "+"precio"+" | "+"Impuesto"+" | "+"Total")

    println(listaAlmacen[3]+"     |"+producto1+"   |"+impuesto1+ "    |" + (listaPrecios[3]+impuesto1))
    println(listaAlmacen[5]+"    |"+producto2 +"   |"+impuesto2+ "     |"+ (listaPrecios[5]+impuesto2))
    println(listaAlmacen[0]+"       |"+producto3+"    |"+impuesto3 + "     |"+ (listaPrecios[0]+impuesto3))
    println(listaAlmacen[7]+"     |"+producto4+"  |"+impuesto4 + "   |"+ (listaPrecios[7]+impuesto4))
    println(listaAlmacen[5]+"    |"+producto5+"  |"+impuesto5 + "    |"+ (listaPrecios[5]+impuesto5))
    println(listaAlmacen[2]+"       |"+producto6+"   |"+impuesto6 + "   |"+ (listaPrecios[2]+impuesto6))
    println(listaAlmacen[1]+"    |"+producto7+"    |"+impuesto7 + "     |"+ (listaPrecios[1]+impuesto7))
    println(listaAlmacen[7]+"     |"+producto8+"   |"+impuesto8+ "    |"+ (listaPrecios[7]+impuesto8))
*/

    println("----------------------Ejercicio con listas------------------------- \n")

    //Fecha: 21/03/2023
    //Nombre: Julian Estevan Alba Fresno
    //N° documento: 1002394910

    val listaNumerica = listOf(1,5,10,100,99,7,11,25,55)

    val orden1 = listaNumerica.sorted()
    val orden2 = listaNumerica.sortedDescending()
    val orden3 = listaNumerica.sortedBy { listaNumerica -> listaNumerica<5 }
    val orden4 = listaNumerica.shuffled()
    val orden5 = listaNumerica.reversed()
    val orden6= listaNumerica.filter { listaNumerica -> listaNumerica<10 }


    println("Orden 1 es: $orden1")
    println("Orden 2 es: $orden2")
    println("Orden 3 es: $orden3")
    println("Orden 4 es: $orden4")
    println("Orden 5 es: $orden5")
    println("Orden 6 es: $orden6")

    println("----------------------Ejercicio con mapas------------------------- \n")
    val mapInmutable = mapOf( "Pompilio" to 25, "Pepe" to 28, "Gregorio" to 30)
    val mapMutable = mutableMapOf("Soraca" to 12, "Belen" to 5, "Tuta" to 10, "Motavita" to 8, "Cucaita" to 6)

    println("Lista uno: $mapInmutable")
    println("Lista dos: $mapMutable")

    mapMutable.put("Samaca", 22)

    mapMutable["Villa"] = 30

    println("Lista tres: $mapMutable")

    val x = mapMutable["Tuta"]

    println("valores en x: $x")

    println("Lista con solo llaves: ${mapMutable.keys} ")

    mapMutable.remove("Cucaita")

    println("Lista para ver cual se removio: $mapMutable")

    if (mapMutable.values.equals(mapMutable)){

        println("Hay mayor numero de inges en motavita que en motavita")
    }else{
        println("Hay mayor numero de inges en motavita que en belen")
    }


    println("----------------------Ejercicio con set inmutable------------------------- \n")

    val setLetras = setOf("a", "b","c","e","f","a","b","c","w","x")

    println(setLetras)


    println("----------------------Ejercicio con set mutable------------------------- \n")
    val setNumeros = mutableSetOf(1,2,3)


    println("Set 1: $setNumeros")
    setNumeros.add(10)
    setNumeros.add(9)
    setNumeros.add(5)
    setNumeros.add(7)
    setNumeros.add(2)
    setNumeros.add(3)

    println("Set 2: $setNumeros")


    val setNumeros2 = mutableSetOf(1,2,2,2,3,3,5,7,9,10)
    println("Set 3: $setNumeros2")


    println("La igualacion es: "+setNumeros.equals(setNumeros2))

    println("Existe el valor 9: "+setNumeros.contains(9))

    setNumeros += 10

    setNumeros.remove(5)

    setNumeros -= 10

    println("----------------------Ejercicio con set mutable operaciones en conjunto------------------------- \n")

    val setPrimero = mutableSetOf(1,3,5,7,2,4)

    val setSegundo = mutableSetOf(2,4,6,8,1,3)


    println("Conjunto A: $setPrimero")
    println("Conjunto B: $setSegundo \n")

    val union = setPrimero.union(setSegundo)
    val union2 = setPrimero + setSegundo


    println("La union entre A y B: $union")
    println("La union entre A y B: $union2 \n")


    val interseccion = setPrimero.intersect(setSegundo)
    println("La interseccion entre A y B: $interseccion\n")

    val diferencia = setPrimero.subtract(setSegundo)
    val diferencia2 = setPrimero - setSegundo
    println("La diferencia entre A y B: $diferencia")
    println("La diferencia entre A y B: $diferencia2")

    println("comprueba me por favor te lo pido señor sati")
    println("relajado no es para suplicas ")

    println("Hola soy yo")

    println("hola ahora soy yo: andres")

    print("amigos somos todos")

    println("Claro que si podemos ser amigos")




}
