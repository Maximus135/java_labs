package lab6

def division = {a,b -> a/b}
println division(1, 2)

def difference = {d,c -> d - c}
println difference(3, 4)

println difference(division.call(1, 2), 5)
