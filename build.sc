import mill._, scalalib._, scalanativelib._, scalanativelib.api.ReleaseMode

object nativetext extends ScalaNativeModule {
  def scalaVersion = "3.2.0"
  def scalaNativeVersion = "0.4.7"
}

object text extends ScalaModule {
  def scalaVersion = "2.11.12"
  //def releaseMode = ReleaseMode.Debug // optional
}

object nativeargs extends ScalaNativeModule {
  def scalaVersion = "3.2.0"
  def scalaNativeVersion = "0.4.7"
  def ivyDeps = Agg(
    // NOTE: use  ivy"com.lihaoyi::mainargs::0.3.0"
    // instead of ivy"com.lihaoyi::mainargs:0.3.0"
    // for some insane reason
    // (see https://github.com/scala-native/scala-native/issues/2500)
    ivy"com.lihaoyi::mainargs::0.3.0"
  )
}