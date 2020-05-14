package lab6

//конструктор по умолчанию
FirstClass firstClass = new FirstClass(1, "Name", "b@mail.ru", "designer")
println firstClass

Binding binding = new Binding()
binding.setVariable("firstClass", new FirstClass(2, "str", "a@mail.ru", "developer"))
println binding.getProperty("firstClass")

println firstClass.getId()
println firstClass.getName()
println firstClass.getEmail()
println firstClass.getPosition()

def a = 5
def b = "haha"
println a + " " + b

println String instanceof Integer

Integer num = firstClass.calc(2)
println num

//firstClass.calc_Integer(null)
//firstClass.calc_int(null) // кидает ошибку