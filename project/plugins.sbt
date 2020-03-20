resolvers += Classpaths.sbtPluginReleases
resolvers += "Typesafe Repository" at "https://repo.typesafe.com/typesafe/releases/"

addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat"   % "0.1.11")
addSbtPlugin("org.xerial.sbt"            % "sbt-sonatype"   % "3.8.1")
addSbtPlugin("com.jsuereth"              % "sbt-pgp"        % "2.0.1")
addSbtPlugin("de.heikoseeberger"         % "sbt-header"     % "5.4.0")
addSbtPlugin("com.lucidchart"            % "sbt-scalafmt"   % "1.16")
addSbtPlugin("com.47deg"                 % "sbt-microsites" % "1.1.5")
addSbtPlugin("org.scalameta"             % "sbt-mdoc"       % "2.1.4")
addSbtPlugin("com.scalapenos"            % "sbt-prompt"     % "1.0.2")
