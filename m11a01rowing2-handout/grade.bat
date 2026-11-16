@echo off
java --enable-native-access=ALL-UNNAMED -Xmx128m -ea -Dlog4j.skipJansi=false -jar .jgrader/jgrader-0.0.2.jar %*
