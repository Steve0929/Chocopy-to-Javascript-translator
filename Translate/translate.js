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
