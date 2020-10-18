// main function
fun main() {
    val officeOpen = 7
    val now = 10
    val office: String
    office = if (now < officeOpen) {
        "Office already open"
    } else if (now == officeOpen){
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }

    print(office)
}