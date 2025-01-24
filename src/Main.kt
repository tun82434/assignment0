fun main(args: Array<String>) {
    val circle : Shape = Circle()
    val rectangle : Shape = Rectangle()
    val square : Shape = Square()
    val triangle : Shape = Triangle()
    val equilateralTriangle : Shape = EquilateralTriangle()

    print("Enter circle dimensions: ")
    (circle as Circle).setDimensions(readln().toInt())
    println("Shape Name: ${circle.name}")
    println("Dimensions:")
    circle.printDimensions()
    println("Area: ${circle.getArea()}")
}