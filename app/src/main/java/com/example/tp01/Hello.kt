package com.example.tp01

fun main(argv: Array<String>) {

    val rectangles = arrayOf(
        Rectangle(),
        Rectangle(p = Point(-5, 3)),
        Rectangle(q = Point(1, 9)),
        Rectangle(Point(6, 3), Point(7, 4))
    )

    fun distance(p: Point, q: Point): Int {
        return (Math.abs(p.x - q.x) + Math.abs(p.y - q.y));
    }
    for (rectangle in rectangles) {
        println("Les coordonnées sont : " + rectangle.toString())
        println("La surface du rectangle est :" + rectangle.surface())
    }
}