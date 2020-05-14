package lab6

import static java.util.Calendar.*

FirstClass firstClass = new FirstClass(1, "Name", "mad@mail.ru", "povar")
//task1
//firstClass.calc_int(null)
firstClass.calc_Integer(null)
//task2
BigDecimal bigDecimal = new BigDecimal(1000.00)
BigDecimal bigDecimal1 = new BigDecimal(1000.0)

println bigDecimal1 == bigDecimal
println bigDecimal.equals(bigDecimal1)

println bigDecimal1.compareTo(bigDecimal)

//task3
def sum = bigDecimal1.add(bigDecimal)
def sum1 = bigDecimal1 + bigDecimal

def div = bigDecimal1.divide(bigDecimal)
def div1 = bigDecimal1 / bigDecimal

def mult = bigDecimal1.multiply(bigDecimal)
def mult1 = bigDecimal1 * bigDecimal

println sum + " " + sum1
println div + " " + div1
println mult + " " + mult1

// Temp temp = new Temp()
// temp.check()

//task4
def var = "first"
println var.getClass().getName()
var = 10
println var.getClass().getName()
var = 'f'
println var.getClass().getName()

//task5
def date = new Date().parse("dd.MM.yyyy", "28.02.2015")
def date1 = new Date().parse("dd.MM.yyyy", "31.01.2015")
def date2 = date - date1
println date2
println date
date[MONTH] -= 1
println date
date[MONTH] += 1
date[DATE] +=1
println date