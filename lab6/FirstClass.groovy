package lab6

class FirstClass {
    def id;
    def name;
    def email;
    def position;

    FirstClass(id, name, email, position) {
        this.id = id
        this.name = name
        this.position = position
        this.email = email
    }

    @Override
    String toString() {
        return "id: " + id + ", name: " + name + ", email: " + email + ", position: " + position
    }

    Integer calc(Integer a) {
        a*2;
    }

    Integer calc_Integer(Integer num) {
        return num;
    }
    int calc_int(Integer num) {
        return num;
    }
}
