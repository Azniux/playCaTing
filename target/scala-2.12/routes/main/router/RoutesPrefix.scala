
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_Aa/playCaTing-master/conf/routes
// @DATE:Mon Mar 12 01:19:48 GMT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
