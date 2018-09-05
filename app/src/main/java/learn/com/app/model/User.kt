package learn.com.app.model

class User(username:String){

    val nombre:String = username.toUpperCase()
    private var currentAddress:String? = null

    fun getAddress():String? {
       return  if (currentAddress != null)
           "sin dirección"
       else currentAddress
   }
}