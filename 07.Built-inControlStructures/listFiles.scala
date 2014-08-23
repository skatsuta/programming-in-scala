val filesHere = new java.io.File(".").listFiles
filesHere.filter(file => file.getName.endsWith(".scala")).foreach(println)
