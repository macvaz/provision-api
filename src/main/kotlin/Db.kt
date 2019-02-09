import org.jetbrains.exposed.sql.Table

object Db : Table() {
    val name = varchar("name", 30)
    val database = varchar("database", 30)
    val partitionColumn = varchar("partition_column", 20).nullable()
    val columnNames = varchar("columns", 200)
}