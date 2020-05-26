// Comentario
class animal {
constructor(
makes_noise) {
this.makes_noise =  false ;
}

 make_noise(){
if(self.makes_noise){
console.log(self.sound());
}

}
 sound(){
return "??? "

}
 randomFunction(lol){
return "??? "

}
}
class cow extends animal {constructor(
) {
super()
this.init__(this)
}
 init__(){

self.makes_noise =  true 

}
 sound(){
return "moo"

}
}
var c = null 

c = new cow()
//Prints "moo"
