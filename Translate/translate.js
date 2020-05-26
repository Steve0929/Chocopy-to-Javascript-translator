
// Comentario
class animal {
    constructor(
        makes_noise) {
        this.makes_noise = false;
    }

    make_noise() {
        if (this.makes_noise) {
            console.log(this.sound());
        }

    }

    sound() {
        return "??? "

    }

    randomFunction(lol) {
        return "??? "

    }
}

class cow extends animal {
    constructor() {
        super()
        this.init__(this)
    }

    init__() {

        this.makes_noise = true

    }

    sound() {
        return "moo"

    }
}

var c = null

c = new cow()
//Prints "moo"
>>>>>>> dcba539fc63b00651111da6bd3c57a43de39806f
