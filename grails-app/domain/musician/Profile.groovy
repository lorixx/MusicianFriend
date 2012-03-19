package musician

class Profile {

    static constraints = {
        name(blank: false)
        email(email: true, blank: false)
    }

    String name
    String email
    String instrument

    static belongsTo = Musician
    
    
}
