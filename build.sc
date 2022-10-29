import mill._, scalalib._, scalanativelib._, scalanativelib.api.ReleaseMode

object nativetext extends ScalaNativeModule {
  def scalaVersion = "3.2.0"
  def scalaNativeVersion = "0.4.7"
  //def logLevel = NativeLogLevel.Info // optional
  //def releaseMode = ReleaseMode.Release // optional
}

object text extends ScalaModule {
  def scalaVersion = "2.11.12"
  //def scalaNativeVersion = "0.3.8"
  //def logLevel = NativeLogLevel.Info // optional
  //def releaseMode = ReleaseMode.Debug // optional
}