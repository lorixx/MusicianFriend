package musician

class Musician {


    static constraints = {

        dateCreated(nullable: false)
        
    }
    Date dateCreated

    Profile profile
    Boolean isApproved = false

    static mapping = {
        profile lazy: false  //fetch policy: meaning we will fetch profile when we fetch information for Musician
    }
}
