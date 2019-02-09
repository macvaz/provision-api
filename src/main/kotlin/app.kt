import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.transactions.transaction

fun main(args: Array<String>) {
    println("Hello world!")
    val db = Database.connect(
        "jdbc:postgresql://localhost:5432/extraction",
        driver = "org.postgresql.Driver",
        user = "extraction",
        password = "extraction")
    transaction {
        Db.selectAll().forEach {
            println(it)
        }
    }
    println("Connected to DB")
}