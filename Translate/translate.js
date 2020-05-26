// Comentario
class animal {
    constructor(makes_noise) {
        this.makes_noise = false;
    }

    make_noise(self) {
        if (self.makes_noise) {
            console.log(self.sound());
        }

    }

    sound(self) {
        return "??? "

    }
}

class cow extends animal {
    constructor() {
        super()
        this.init__(this)
    }

    init__(self) {

        self.makes_noise = true

    }

    sound(self) {
        return "moo"

    }
}

var c = null

c = cow()
//Prints "moo"
